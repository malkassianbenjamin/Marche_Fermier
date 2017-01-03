package Production;

import Produit.ProduitFermier;

public abstract class ProductionFruits implements UniteProduction {

	@Override
	public abstract ProduitFermier Produire(int prix, String nomProprio);
	

}
