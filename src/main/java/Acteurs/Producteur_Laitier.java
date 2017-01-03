package Acteurs;



public class Producteur_Laitier implements IFermier {
	private String nom;
	private String prenom;
	private int codeFermier;
	private int argent;
	private ProduitFermier produit;
	private int quantite;
	


	public Producteur_Laitier(String nom, String prenom, int codeFermier,int argent,ProduitFermier produit, int quantite){
		if (nom.equals(null) || prenom.equals(null) || codeFermier == 0||quantite == 0 || argent ==0) throw new IllegalArgumentException();
		this.nom = nom;
		this.prenom = prenom;
		this.codeFermier = codeFermier;
		this.argent = argent;
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public static boolean isLaitier(ProduitFermier produit){ 
		if (produit  instanceof Fromage || produit instanceof Lait) return true;
		else return false;
	}

	public String getFileName() {
		return nom + "_" + prenom + "_" + codeFermier;
	}
	public void Crediter(int Balance){
		this.setArgent(getArgent()+Balance);
	}
	public void Debiter(int Balance){
		this.setArgent(getArgent()-Balance);
	}
	public void VenteDeProduit(int Quantite){
		this.setQuantite(getQuantite()-Quantite);	
	}
	public void AchatDeProduit(int Quantite){
		this.setQuantite(getQuantite()+Quantite);
	}
	
	// ------ [ GETTERS / SETTERS ]------- //
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getCodeFermier() {
		return codeFermier;
	}	
	public ProduitFermier getProduit() {
		return produit;
	}

	
	public int getArgent() {
		return argent;
	}
	private void setArgent(int argent) {
		this.argent = argent;
	}
	private int getQuantite() {
		return quantite;
	}
	private void setQuantite(int quantite) {
		this.quantite = quantite;
	}


}
