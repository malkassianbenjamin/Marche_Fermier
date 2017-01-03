package GestionMarche;

import Produit.ProduitFermier;

public class Moyenne {

    Moyenne() {}

    public static double get_moyenne (ProduitFermier produit) {

        String s1 = "" + produit;
        getByNom(s1);
        return 1;
        // Chercher la moyenne du produit
    }

    public static ProduitFermier getByNom(String nom) {

        ProduitFermier c = null;

        try {
            Class<?> obj =  Class.forName(nom);
            c = (ProduitFermier) obj.newInstance();

            System.out.println(nom);
        }
        catch (InstantiationException ie) {
            ie.printStackTrace();
        }
        catch (IllegalAccessException ia) {
            ia.printStackTrace();
        }
        catch (ClassNotFoundException e) {

            System.out.println("Ce n'est pas un produit fermier.");

        }
        return c;
    }
}
