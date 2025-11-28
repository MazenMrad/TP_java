package ex1;

public class PropriétéPrivée extends Propriété {
	int nbPieces;
	static int nbpiecetotal;
	public PropriétéPrivée(int id, Personne responsable, String adresse, double surf,int nbPieces) {
		super(id, responsable, adresse, surf);
		this.nbPieces=nbPieces;
		
	}
public void affiche_nb_piéce() {
	nbpiecetotal+=this.nbPieces;
	System.out.println(nbpiecetotal);
}
	double calcullimpot(){
		return surf*(50.0/100.0)+(10.0*nbPieces);
	}
public String toString() {
	return "PropriétéPrivée [nbPieces=" + nbPieces + ", id=" + id + ", responsable=" + responsable + ", adresse="
			+ adresse + ", surf=" + surf + ", calcullimpot()=" + calcullimpot() + "]";
}
public int getNbPieces() {
	return nbPieces;
}
public Personne getResponsable() {
	return responsable;
}

public void afficher() {
	
	System.out.println(toString());
}
}