package Production;

import Produit.Lait;
import Produit.ProduitFermier;

public class ProductionLait extends ProductionProdLaitiers {

	@Override
	public ProduitFermier Produire(int prix, String nomProprio) {
		return new Lait(prix, nomProprio);
	}
	
}
