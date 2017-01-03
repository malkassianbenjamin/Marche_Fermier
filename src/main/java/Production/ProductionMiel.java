package Production;

import Produit.Miel;
import Produit.ProduitFermier;

public class ProductionMiel extends UniteProduction {

	@Override
	public ProduitFermier Produire(int prix, String nomProprio) {
		return new Miel(prix, nomProprio);
	}

}
