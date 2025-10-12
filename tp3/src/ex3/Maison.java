package ex3;

public class Maison {
	String type;
	String adr;
	int nbchambre;
	float surface;
	public Maison(String t,String a ,int n) {
		this.type=t;
		this.adr=a;
		this.nbchambre=n;
		
	}
	public Maison(String t,String a ,int n,float s) {
		this.type=t;
		this.adr=a;
		this.nbchambre=n;
		this.surface=s;
	}
	public void setSurface(float s) {
		this.surface=s;
	}
	public float calculPrix(float pmc) {
		return pmc*surface;
	}
	public float calculPrix() {
		return 2100*surface;
	}
	public void toChaine() {
		System.out.println("Un "+type+" de "+surface+" a "+adr+" avec  "+nbchambre+ "  chambre");
		
		
	}
}
