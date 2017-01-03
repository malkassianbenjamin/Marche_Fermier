package GestionMarche;
import Acteurs.*;

/**
 * Created by benjaminmalkassian on 28/11/2016.
 */
public class OffreAchat {

    OffreAchat(Participant acheteur, double prixMin, double prixMax, int quantité, String produit){
        this.acheteur = acheteur;
        this.quantité = quantité;
        this.prixMin = prixMin;
        this.prixMax = prixMax;
        this.produit = produit;
    }

    double prixMin;
    double prixMax;
    String produit;
    Participant acheteur;
    int quantité;

    public double getPrixMax() {
        return prixMax;
    }

    public double getPrixMin() {
        return prixMin;
    }

    public int getQuantité() {
        return quantité;
    }

    public Participant getAcheteur() {
        return acheteur;
    }

    public String getProduit() {
        return produit;
    }
}
