package ex1;

import java.util.Objects;

public abstract class Propriété {
public Personne getResponsable() {
		return responsable;
	}

int id;
Personne responsable;
String adresse;
double surf;
@Override
public String toString() {
	return "Propriété [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surf=" + surf + "]";
}
public Propriété(int id, Personne responsable, String adresse, double surf) {
	this.id = id;
	this.responsable = responsable;
	this.adresse = adresse;
	this.surf = surf;
}
abstract double calcullimpot();

public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Propriété other = (Propriété) obj;
	return id == other.id;
}
}

