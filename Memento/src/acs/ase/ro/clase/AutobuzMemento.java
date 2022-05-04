package acs.ase.ro.clase;

public class AutobuzMemento {
	private String nume;
	private Double consum;

	public AutobuzMemento(String nume, Double consum) {
		this.nume = nume;
		this.consum = consum;
	}
	
	public String getNume() {
		return nume;
	}

	public Double getConsum() {
		return consum;
	}
}
