package Produit;

public abstract class ProduitFermier {
	
	protected String proprietaire;
	protected int prix;
	
	public ProduitFermier(int prix, String proprietaire ){
		this.prix = prix;
		this.proprietaire = proprietaire;
	}
	
	public String getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void valider(){
		
	}
	
	

}
