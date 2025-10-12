package ex3;

public class TestMaison {

	public static void main(String[] args) {
		Maison m1=new Maison("duplex","Tunis",4,210); 
		Maison m2=new Maison("duplex","Tunis",4); 
		m1.toChaine();
		m2.toChaine();
		m2.setSurface(230);
		float prix = m2.calculPrix();
		m2.toChaine();
	}

}
