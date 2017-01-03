package Acteurs;

import Produit.ProduitFermier;

public class Arboriculteur extends Fermier {

	public Arboriculteur(String nom, String prenom, int codeFermier, double argent, ProduitFermier produit, int quantite){
		super(nom, prenom, codeFermier, argent, produit, quantite);
		if (!isFruit(produit))
			throw new IllegalArgumentException();
	}
	
	public static boolean isFruit(ProduitFermier produit){ 
		if (produit  instanceof IFruit) return true;
		else return false;
	}
}
