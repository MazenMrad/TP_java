package ex2;

public class Compte {
private int numero;
public static int compte;
private double solde=0;


public Compte(){
	compte++;
	this.solde=0;
	this.numero=compte;			
}
public void deposer(double m) {
	this.solde+=m;
}

public void retirer(float m) {
	if (this.solde<m){
		System.out.println("sold insuffisant");
	}
	else {
		this.solde-=m;
	}
	
}

public void avoirsolde() {
	System.out.println(this.solde);
}
public void transferer(float m,Compte c) {
	this.solde-=m;
	c.solde+=m;
}
public void affiche() {
	if (this.solde==0) {
		System.out.println("compte en rouge Solde:"+solde+"   numero:"+numero);
	}
	else {
		System.out.println("Solde:"+solde+"   numero:"+numero);
	}

}
}

