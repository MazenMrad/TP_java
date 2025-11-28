package ex1;

public class Appartement extends PropriétéPrivée{
int numEtage;

public Appartement(int id, Personne responsable, String adresse, double surf, int nbPieces, int numEtage) {
	super(id, responsable, adresse, surf, nbPieces);
	this.numEtage = numEtage;
	nbpiecetotal+=nbPieces;
}


@Override
public String toString() {
	return "Appartement [numEtage=" + numEtage + ", nbPieces=" + nbPieces + ", id=" + id + ", responsable="
			+ responsable + ", adresse=" + adresse + ", surf=" + surf + ", calcullimpot()=" + calcullimpot() + "]";
}


public void afficher() {
	System.out.println(toString());
}

double calcullimpot(){
	return surf*(50.0/100.0)+(10.0*nbPieces);
}
}
