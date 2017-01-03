package Production;

import Produit.Fromage;
import Produit.ProduitFermier;

public class ProductionFromage extends ProductionProdLaitiers {

	@Override
	public ProduitFermier Produire(int prix, String nomProprio) {
		return new Fromage(prix, nomProprio);
	}
	
}
