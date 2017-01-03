package GestionMarche;

public class CotisationFixe implements ICotisation {

	public double calculerCotisation(double gain) {
		return (gain*0.05);
	}

}
