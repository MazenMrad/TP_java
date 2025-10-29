package ex2;

public class Plante {
String nom;
int hauteur;
int age;
double prix;


public Plante(String nom, int hauteur, int age, double prix) {
	this.nom = nom;
	this.hauteur = hauteur;
	this.age = age;
	this.prix = prix;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

@Override
public String toString() {
	return "Plante [nom=" + nom + ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
}

public void description() {
	System.out.println(toString());
}

}
