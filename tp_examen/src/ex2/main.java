package ex2;

public class main {

	public static void main(String[] args) {
		Personne p1=new Personne(15,1.70,"test");
		Personne p2=new Personne(20,1.55,"testsdf");
		ConditionAge cond=new ConditionAge(20);
		Attraction[] tab_att=new Attraction[20];
		Attraction att11=new Attraction(p1,"test",10,cond,10,10.5);
		ParcAttraction patt=new ParcAttraction("nahli",0,tab_att);
		patt.ajouteAttraction(att11);
		patt.affiche();

	}

}
