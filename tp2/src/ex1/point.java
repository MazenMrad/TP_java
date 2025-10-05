package ex1;

public class point{
	private char id ;
	private double abs;
	public point(char c, double x) {
		id = c ;
		abs = x;
	}
	public void affiche() {
		System.out.println("Point identifié par "+this.id+" d'abscisse "+this.abs);
		
	}
		public void translate (double dx) {
		 abs += dx ; 
	}
		public static void main (String args[]) {
			point a = new point('A',2.5) ;
			a.affiche() ;
			point b = new point('B', 5.25) ;
			b.affiche() ;
			b.translate(2.25) ;
			b.affiche() ;
			}
		}
	

