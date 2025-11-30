package tp_classe_abstract_interface;

public abstract class Employe {
double salaire;
String nom;
String prenom;
int age;
int date;

public abstract void calculer();

public String getNom() {
	return nom +prenom;
}

public Employe(String nom, String prenom, int age, int date) {
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.date = date;
}


}
