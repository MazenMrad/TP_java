package ex2;

public class ProgrammeParrainage {

public static void main(String[] args) {
	double som=0.0;
	Parrain[] parrains = new Parrain[10];
	parrains[0] = new Parrain("Ali", " Ben Ali",40);
	parrains[1] = new Parrain("Salah", " Ben Salah", 35);
	parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 100.0);
	
	Enfant[] enfants = new Enfant[1025];
	enfants[0] = new Enfant("Farah", "ben Farah", 10, " quatrième année");
	enfants[1] = new Enfant("Amel", "ben Amel", 12, "Sixième année");
	enfants[2] = new Enfant("Fedy", "Ben Fedy", 11, "Sixième année");
	enfants[3] = new Enfant("Sarra", "Ben Sarra", 9, "Troisième année");
	parrains[0].ajouterEnfant(enfants[0]);
	parrains[2].ajouterEnfant(enfants[1]);
	parrains[2].ajouterEnfant(enfants[2]);
	parrains[2].ajouterEnfant(enfants[2]);
	parrains[2].afficherinfos();
	for (Parrain p:parrains) {
		if (p!=null) {
				p.afficherinfos();
		}
	}
	System.out.println("Nombre total des parrainés :"+parrains[2].getNombreEnfantsParraines());
	
	for (Enfant e:enfants) {
	if (e!=null){
		if (e.getClasse()=="Sixième année")
			e.afficherinfos();
	}
	}
	for (Parrain p: parrains) {
		if (p!=null && p instanceof ParrainMensuel){
			ParrainMensuel pm=(ParrainMensuel) p;
			som=som+pm.calculerVirementTotal(pm.getVirementMensuel());
		}
	}
	System.out.println(som);
}
}
