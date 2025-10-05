package ex2;

public class point {
		private String nom ;
		private int abs;
		private int ord;
		public point(String n) {
			nom = n;
		}
		public point(int a, int o) {
			abs = a;
			ord=o;
		}
		public point(String n, int a , int o) {
			nom=n;
			abs = a;
			ord=o;
		}
		
		public void affiche() {
			System.out.println(this.nom+"("+this.abs+","+this.ord+")");
			
		}
		public void transhoriz(int a) {
			abs+=a;
		}
			public void transvert (int a) {
			 ord += a ; 
		}
		public void translation (int a,int b) {
				 transhoriz(a);
				 transvert(b);
			}
		public boolean coincide(point p) {
			if (this.abs==p.abs && this.ord==p.ord) {
				return true;
			}
			else {
				return false;
			}
		}
		public String getNom(){
			return this.nom;
		}
		public int getAbscisse() {
			return this.abs;
		}
		public int getOrdonne() {
			return this.ord;
		}
		public void setNom(String ch) {
			this.nom=ch;
		}
		public void setAbscisse(int a) {
			this.abs=a;
		}
		public void setOrdonne(int a) {
			this.ord=a;
		}

}