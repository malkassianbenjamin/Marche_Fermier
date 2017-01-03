package Acteurs;

/**
 * Created by benjaminmalkassian on 12/12/2016.
 */
public interface Participant {

    public void Crediter(double Balance);

    public void Debiter(double Balance);

    public void faireOffreAchat(Participant acheteur, double prixmin, double prixmax, int quantite, String produit);

    public void mettreEnVente(Participant vendeur, double prixUnit, int quantite, String produit);
}
