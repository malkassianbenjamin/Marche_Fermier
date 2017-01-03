package GestionMarche;
import Acteurs.*;

/**
 * Created by benjaminmalkassian on 28/11/2016.
 */
public class OffreVente {

    OffreVente(Participant vendeur, String produit, int quantité, double prixUnitaire){
        this.vendeur = vendeur;
        this.produit = produit;
        this.quantité = quantité;
        this.prixUnitaire = prixUnitaire;
    }

    Participant vendeur;
    String produit;
    int quantité;
    double prixUnitaire;

    public String getProduit() {
        return produit;
    }

    public int getQuantité() {
        return quantité;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }

    public Participant getVendeur() {
        return vendeur;
    }
}
