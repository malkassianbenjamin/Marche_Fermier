package Production;

import Produit.ProduitFermier;

public abstract class ProductionProdLaitiers implements UniteProduction {
	
	@Override
	public abstract ProduitFermier Produire(int prix, String nomProprio);

}
