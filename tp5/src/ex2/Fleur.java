package ex2;

public class Fleur extends Plante{
	String couleur;
	int moisF;
	
	

	
	public Fleur(String nom, int hauteur, int age, double prix,String couleur,int moisF) {
		super(nom,hauteur,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}


public String toString() {
	return "Fleur [couleur=" + couleur + ", moisF=" + moisF + ", nom=" + nom + ", hauteur=" + hauteur +"cm"+ ", age=" + age
			+ ", prix=" + prix + "]";
}
public void description() {
	System.out.println(toString());
}

public void fleurir() {
	if (this.moisF==4 || this.moisF==5 || this.moisF==6) {
		System.out.println("En fleurs");
	}
	else {
		System.out.println("n'est pas En fleurs");
	}
}




public String getCouleur() {
	return couleur;
}




public void setNom(String nom) {
	this.nom=nom;
	
}




public String getNom() {
	return nom;
}
}

