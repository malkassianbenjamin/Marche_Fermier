package GestionMarche;

import Produit.ProduitFermier;

public class Transaction {

    public ProduitFermier m_objet;
    public double m_prix;
    public IFermier m_vendeur;  // String -> fermier
    public IFermier m_acheteur; // String -> fermier
    public int m_quantité;

    public Transaction (ProduitFermier objet, double prix, IFermier vendeur, IFermier acheteur, int quantité) {
        m_objet = objet;
        m_prix = prix;
        m_vendeur = vendeur;
        m_acheteur = acheteur;
        m_quantité = quantité;
    }

    public String toString() {
        return  "Objet : " +  m_objet + "\n" +
                "Prix : " + m_prix + "€\n" +
                "Vendeur : " + m_vendeur + "\n" +
                "Acheteur : " + m_acheteur + "\n" +
                "Quantité : " + m_quantité;
    }

}
