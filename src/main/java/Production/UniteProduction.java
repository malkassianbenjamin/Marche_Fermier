package Production;

import Produit.ProduitFermier;

public interface UniteProduction {
	public abstract ProduitFermier Produire(int prix, String nomProprio);
}
