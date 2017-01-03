package GestionMarche;
import Acteurs.*;


import java.util.Iterator;
import java.util.Set;

import static GestionMarche.Marche.listeAchat;
import static GestionMarche.Marche.listeVente;

/**
 * Created by David on 28/11/2016.
 */
public class Controleur{

    /*public boolean valider(pf produit, int prixUnitaire) {

        if (get_moyenne(produit))*0,9 < get_moyenne(produit) < (get_moyenne(produit))*1,1)
            return true;
        else
            return false;
    }*/


    public void associerAcheteurVendeur(OffreAchat achat){
        Set cles = listeVente.keySet();
        Iterator it = cles.iterator();

        while (it.hasNext()){
            Object cle = it.next();
            OffreVente vente = listeVente.get(cle);
            if (achat.getProduit() == vente.getProduit()){
                if (achat.getPrixMin() < vente.getPrixUnitaire() && achat.getPrixMax() > vente.getPrixUnitaire()) {
                    if (achat.getQuantité() - vente.getQuantité() > 0) {
                        achat.getAcheteur().Debiter(vente.getQuantité() * vente.getPrixUnitaire());
                        vente.getVendeur().Crediter(vente.getQuantité() * vente.getPrixUnitaire());
                        achat.getAcheteur().faireOffreAchat(achat.getAcheteur(), achat.getPrixMin(), achat.getPrixMax(), achat.getQuantité() - vente.getQuantité(), achat.getProduit());
                    } else if (achat.getQuantité() - vente.getQuantité() < 0) {
                        achat.getAcheteur().Debiter(achat.getQuantité() * vente.getPrixUnitaire());
                        vente.getVendeur().Crediter(achat.getQuantité() * vente.getPrixUnitaire()); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!stop !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!;
                        vente.getVendeur().mettreEnVente(vente.getVendeur(), vente.getPrixUnitaire(), vente.getQuantité() - achat.getQuantité(), vente.getProduit());
                    }
                }
            }
        }
    }


    public void associerVendeurAcheteur(OffreVente vente){
        Set cles = listeAchat.keySet();
        Iterator it = cles.iterator();

        while (it.hasNext()){
            Object cle = it.next();
            OffreAchat achat = listeAchat.get(cle);
            if (achat.getProduit() == vente.getProduit()){
                if (achat.getPrixMin() < vente.getPrixUnitaire() && achat.getPrixMax() > vente.getPrixUnitaire()) {
                    if (achat.getQuantité() - vente.getQuantité() > 0) {
                        achat.getAcheteur().Debiter(vente.getQuantité() * vente.getPrixUnitaire());
                        vente.getVendeur().Crediter(vente.getQuantité() * vente.getPrixUnitaire());
                        achat.getAcheteur().faireOffreAchat(achat.getAcheteur(), achat.getPrixMin(), achat.getPrixMax(), achat.getQuantité() - vente.getQuantité(), achat.getProduit());
                    } else if (achat.getQuantité() - vente.getQuantité() < 0) {
                        achat.getAcheteur().Debiter(achat.getQuantité() * vente.getPrixUnitaire());
                        vente.getVendeur().Crediter(achat.getQuantité() * vente.getPrixUnitaire());
                        vente.getVendeur().mettreEnVente(vente.getVendeur(), vente.getPrixUnitaire(), vente.getQuantité() - achat.getQuantité(), vente.getProduit());
                    }
                }
            }
        }
    }
} // Controleur
