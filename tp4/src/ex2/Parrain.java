package ex2;

public class Parrain extends Personne {
	int nbenfant=0;
	static int idParrain=1;
	int nextid=1;
	static int nombreEnfantsParraines=0;
	final int max=100;
	String nomEnfant;
	String prenomEnfant;
	int age;
	Enfant[] mesEnfants=new Enfant[max];

	public Parrain(String nom,String prenom,int age) {
		super(nom,prenom,age);
		nextid=idParrain;
		idParrain++;
		
		
		
	}
	void ajouterEnfant(Enfant enfant) {
		this.mesEnfants[nbenfant]=enfant;
			nomEnfant=enfant.getNom();
			prenomEnfant=enfant.getPrenom();
			age=enfant.getage();
			nombreEnfantsParraines++;
			nbenfant++;

	}
	public void afficherinfos() {
		super.afficherinfos();
		System.out.println("idParrain: "+nextid+" nombreEnfantsParraine: "+ this.nbenfant+" parrainne  "+nomEnfant+ " "+ prenomEnfant + " "+ age);
	}
	public int getNombreEnfantsParraines() {
		return Parrain.nombreEnfantsParraines;
	}

}
