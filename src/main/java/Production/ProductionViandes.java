package Production;

import Produit.ProduitFermier;

public abstract class ProductionViandes implements UniteProduction {

	@Override
	public abstract ProduitFermier Produire(int prix, String nomProprio);

}
