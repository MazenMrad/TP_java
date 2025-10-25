package ex2;

public class Enfant extends Personne{
	private static int idEnfant=1;
	int nextidenfant=1;
	private String classe;

	public Enfant(String nom,String prenom,int age, String classe) {
		super(nom,prenom,age);
		this.classe=classe;
		nextidenfant=idEnfant;

		idEnfant++;
		
	}	
	
	public String getClasse(){
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public void afficherinfos() {
		System.out.println(getNom()+" "+ getPrenom() +" agé " +getage()+" id : "+nextidenfant+"Class: "+classe);
		
	}
	

	
}
