package Production;

import Produit.ProduitFermier;
import Produit.Vache;

public class ProductionVache extends ProductionViandes {

	@Override
	public ProduitFermier Produire(int prix, String nomProprio) {
		return new Vache(prix, nomProprio);
	}

}
