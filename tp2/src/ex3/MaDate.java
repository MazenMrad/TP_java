package ex3;

public class MaDate {
private int jours;
private int mois;
private int annee;
public MaDate(int j,int m , int a) {
	this.jours=j;
	this.mois=m;
	this.annee=a;
}
public MaDate(int a) {
	this.annee=a;
}
public int getJours(){
	return this.jours;
}
public int getMois(){
	return this.mois;
}
public int getAnnee(){
	return this.annee;
}
public void setJours(int a) {
	this.jours=a;
}
public void setMois(int a) {
	this.mois=a;
}
public void setAnnee(int a) {
	this.annee=a;
}

public String toString(){
	return jours+"/"+mois+"/"+annee;
}
public void ajouterUnjour(){
	if (jours==31 && (mois==1 ||mois==5||mois==7|| mois==8||mois==10||mois==12 )) {
		jours=1;
		mois++;
		if (mois==12){
			mois=1;
		}
	}
	else if(jours==30 && (mois==4||mois==6||mois==9||mois==11 ) ) {
		jours=1;
		mois++;
			
		}
	else if ( mois==2) {
		if (annee%4==0) {
			if (jours==29) {
				jours=1;
				mois++;
			}
		}
		else {
			if (jours==28){
				jours=1;
				mois++;
			}
			
		}
	}
	else {
		jours++;
	}	
}

public void ajouterPlusiersJours(int n){
for (int i=0;i<n;i++) {
	ajouterUnjour(); 
}

}

public void ajouterunmois() {
	mois++;
	if (mois==13){
		mois=1;
		annee++;
	}
}

public void ajouterunannee() {
	annee++;

}
}



