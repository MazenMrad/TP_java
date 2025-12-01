package ex2;

public class Attraction extends Personne{

	String nom;
	float cout;
	ConditionAge condage ;
	int nb_personne=0;
	double recette;



	public Attraction(Personne p, String nom2, float cout, ConditionAge condage, int nb_personne,
		double recette) {
		super(p.age, p.taille, p.nom);
		this.nom = nom2;
		this.cout = cout;
		this.condage = condage;
		this.nb_personne = nb_personne;
		this.recette = recette;
	}

	public String toString() {
		return "Attraction [nom=" + nom + ", cout=" + cout + ", condage=" + condage + ", nb_personne=" + nb_personne
				+ ", recette=" + recette + "]";
	}



	public double getRecette() {
		return this.recette;
	}

	public void setRecette(float recette) {
		this.recette = recette;
	}

	public void afficher() {
		System.out.println(toString());
	}
	
	public void utilise(Personne p) throws AccesInterditException{
		if (accesPossible(p)){
			throw new AccesInterditException("ACCé interdit");
			
		}
		else {
			System.out.println("INVALID");
		}
		
	}
}
