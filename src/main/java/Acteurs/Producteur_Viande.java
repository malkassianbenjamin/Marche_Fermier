package Acteurs;


public class Producteur_Viande implements IFermier {
	private String nom;
	private String prenom;
	private int codeFermier;
	private int argent;
	private ProduitFermier produit; 
	private int quantite;
	

	public Producteur_Viande(String nom, String prenom, int codeFermier,int argent,ProduitFermier produit, int quantite) throws IllegalArgumentException{
		if (nom.equals(null) 
			|| prenom.equals(null) 
			|| codeFermier == 0
			||quantite == 0 
			|| argent ==0 
			|| isViande(produit)== false ) throw new IllegalArgumentException();
		this.nom = nom;
		this.prenom = prenom;
		this.codeFermier = codeFermier;
		this.argent = argent;
		this.quantite = quantite;
		this.produit = produit;
		CreerFichier();

	}
	public static boolean isViande(ProduitFermier produit){
		if (produit  instanceof Vache || produit instanceof Cochon) return true;
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

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getCodeFermier() {
		return codeFermier;
	}	
	
	public int getArgent() {
		return argent;
	}
	public void setArgent(int argent) {
		this.argent = argent;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public ProduitFermier getProduit() {
		return produit;
	}

}
