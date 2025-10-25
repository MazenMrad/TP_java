package ex2;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	public Personne(String nom,String prenom,int age) {
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
	}

	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public int getage() {
		return age;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void afficherinfos() {
		System.out.println("nom: "+this.nom+" prenom: "+ this.prenom + " age  "+ this.age);
	}
	

	
}
