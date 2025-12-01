package ex2;

import java.util.Arrays;

public class ParcAttraction{
	String nom;
	protected int nb_attraction=0;
	Attraction[] lesAttraction;
public ParcAttraction(String nom,int nb_attraction, Attraction[] lesAttraction) {
		this.nb_attraction = nb_attraction;
		this.nom=nom;
		this.lesAttraction = lesAttraction;
	}


void ajouteAttraction (Attraction a) {
		lesAttraction[nb_attraction]=a;
		nb_attraction++;
	

}

public float getRecette(){
	int sum=0;
	for (Attraction p:lesAttraction) {
		if (p!=null) {
			sum+=((Attraction) p).getRecette();
		}

	}
	return sum;
	}
	

@Override
public String toString() {
	return "ParcAttraction [nom=" + nom + ", nb_attraction=" + nb_attraction + ", lesAttraction="
			+ Arrays.toString(lesAttraction) + ", getRecette()=" + getRecette() + "]";
}
public void affiche() {
	for (Attraction p:lesAttraction) {
		if (p!=null) {
			System.out.println(((Attraction) p).toString());
		}
	
}
}
}
