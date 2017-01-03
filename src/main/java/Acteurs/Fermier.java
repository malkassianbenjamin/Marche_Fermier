package Acteurs;

/**
 * Created by benjaminmalkassian on 12/12/2016.
 */
public abstract class Fermier implements Participant{

    private double Gain = 0;

    private String nom;
    private String prenom;
    private int codeFermier;
    private double argent;
    private ProduitFermier produit;
    private int quantite;

    public Fermier(String nom, String prenom, int codeFermier, double argent,ProduitFermier produit, int quantite) { //Jamais utilisé directement
        if (nom.equals(null)
                || prenom.equals(null)
                || codeFermier == 0
                || quantite == 0
                || argent ==0
                || produit == null) throw new IllegalArgumentException();
        this.nom = nom;
        this.prenom = prenom;
        this.codeFermier = codeFermier;
        this.argent = argent;
        this.produit = produit;
        this.quantite = quantite;

    }
    // --------------------------
    public void faireOffreAchat(Participant acheteur,double prixmin, double prixmax, int quantite, String produit) {

        OffreAchat a = new OffreAchat(acheteur, prixmin, prixmax, quantite, produit);

        GestionMarche.listeAchat.put(GestionMarche.getKeyAchatDispo(),a);
    }
    public void mettreEnVente(Participant vendeur, double prixUnit, int quantite, String produit) {
        OffreVente v = new OffreVente(vendeur ,produit, quantite, prixUnit);
        GestionMarche.listeVente.put(GestionMarche.getKeyVenteDispo(),v);
    }

    public void Crediter(double Balance){
        this.setArgent(getArgent()+Balance);
        this.addGain(Balance);
    }
    public void Debiter(double Balance){
        this.addArgent(Balance);
    }
    public void VenteDeProduit(int Quantite){
        this.setQuantite(getQuantite()-Quantite);
    }
    public void AchatDeProduit(int Quantite){
        this.setQuantite(getQuantite()+Quantite);
    }


    // GETTERS SETTERS
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
    private double getGain(){
        return Gain;
    }
    public void addGain(double g){
        this.Gain += g;
    }
    private double getArgent() {
        return argent;
    }
    public void addArgent(double qtt) {
        this.argent += qtt;
    }

    private void setArgent(double argent) {
        this.argent = argent;
    }
    private int getQuantite() {
        return quantite;
    }
    private void setQuantite(int quantite) {
        this.quantite = quantite;
    }

}
