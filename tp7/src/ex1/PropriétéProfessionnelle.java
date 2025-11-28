package ex1;

public class PropriétéProfessionnelle extends Propriété {
int nbEmployés;
boolean estEtatique;
public PropriétéProfessionnelle(int id, Personne responsable, String adresse, double surf, int nbEmployés,
		boolean estEtatique) {
	super(id, responsable, adresse, surf);
	this.nbEmployés = nbEmployés;
	this.estEtatique = estEtatique;
}

@Override
public String toString() {
	return "PropriétéProfessionnelle [nbEmployés=" + nbEmployés + ", estEtatique=" + estEtatique + ", id=" + id
			+ ", responsable=" + responsable + ", adresse=" + adresse + ", surf=" + surf + ", calcullimpot()="
			+ calcullimpot() + "]";
}
public void afficher() {
	System.out.println(toString());
}
@Override
double calcullimpot() {
	if (estEtatique) {
		return 0;
	}
	else {
		return surf*(100/100)+30*nbEmployés;
	}
}
}
