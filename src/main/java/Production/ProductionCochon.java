package Production;
import Produit.*;


public class ProductionCochon extends ProductionViandes {

	@Override
	public ProduitFermier Produire(int prix, String nomProprio) {
		return new Cochon(prix, nomProprio);
	}

}
