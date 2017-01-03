package Production;

import Produit.Pomme;
import Produit.ProduitFermier;

public class ProductionPomme extends ProductionFruits {

	@Override
	public ProduitFermier Produire(int prix, String nomProprio) {
		return new Pomme(prix, nomProprio);
	}

}
