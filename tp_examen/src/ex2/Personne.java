package ex2;

public class Personne implements ConditionAccess{
	int age;
	double taille;
	String nom;
public Personne(int age, double d,String nom) {
		this.age = age;
		this.taille = d;
		this.nom=nom;
	}

public boolean accesPossible(Personne p) {
	if (p.age>=this.age){
		return true;
	}
	else {
		return false;
	}
}

public int getAge() {
	return age;
}


}
