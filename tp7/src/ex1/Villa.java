package ex1;

public class Villa extends PropriétéPrivée {
boolean avecPiscine;

public Villa(int id, Personne responsable, String adresse, double surf, int nbPieces, boolean avecPiscine) {
	super(id, responsable, adresse, surf, nbPieces);
	this.avecPiscine = avecPiscine;
	nbpiecetotal+=nbPieces;
}

double calcullimpot() {
	if (avecPiscine) {
		return (surf*(50.0/100.0)+(10.0*nbPieces))+200;
	}
	else {
	return (surf*(50.0/100.0)+(10.0*nbPieces));
	}
}
@Override
public String toString() {
	return "Villa [avecPiscine=" + avecPiscine + ", nbPieces=" + nbPieces + ", id=" + id + ", responsable="
			+ responsable + ", adresse=" + adresse + ", surf=" + surf + ", calcullimpot()=" + calcullimpot() + "]";
}

public void afficher() {
	System.out.println(toString());
}
}
