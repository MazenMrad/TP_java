package ex2;

public class Arbre extends Plante{
	String type_feuillage;
	final double AbsorMoyenne=22;
	
	public Arbre(String nom, int hauteur, int age, double prix,String type_feuillage) {
		super(nom, hauteur, age, prix);
		this.type_feuillage=type_feuillage;
	}
	
	public String toString() {
		return "Arbre [type_feuillage=" + type_feuillage + ", AbsorMoyenne=" + AbsorMoyenne + ", nom=" + nom
				+ ", hauteur=" + hauteur + ", age=" + age + ", prix=" + prix + "]";
	}
	
	public void description() {
		System.out.println(toString());
	}
	public double absormoyenne() {
		if (super.hauteur>50){
			return AbsorMoyenne+3;
		}
		else {
			return AbsorMoyenne;
		}
	}

}
