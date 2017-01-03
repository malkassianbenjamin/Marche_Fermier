package Acteurs;
/*
 * Created by Pierre Hofer - pHmaitre 
 */

public class Horticulteur extends Fermier {
	
	public Horticulteur(String nom, String prenom, int codeFermier, int argent, ProduitFermier produit, int quantite){

		
		if (!isFleur(produit)) throw new IllegalArgumentException;
		super();
	}
	

	public static boolean isFleur(ProduitFermier produit){
		if (produit  instanceof <produit>) return true;
		else return false;
	}
		
}
