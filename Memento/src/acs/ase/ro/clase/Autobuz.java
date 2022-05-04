package acs.ase.ro.clase;

public class Autobuz {
	private String nume;
	private Double consum;
	private String model;
	private Integer anFabricatie;
	private Integer nrLocuri;
	
	public Autobuz(String nume, Double i, String model, Integer anFabricatie, Integer nrLocuri) {
		super();
		this.nume = nume;
		this.consum = i;
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.nrLocuri = nrLocuri;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public Double getConsum() {
		return consum;
	}

	public void setConsum(Double consum) {
		this.consum = consum;
	}
	
	public AutobuzMemento genereazaMemento() {
		return new AutobuzMemento(nume, consum);
	}

	public void revineLaOStareAnterioara(AutobuzMemento memento) {
		this.nume = memento.getNume();
		this.consum = memento.getConsum();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [nume=");
		builder.append(nume);
		builder.append(", consum=");
		builder.append(consum);
		builder.append(", model=");
		builder.append(model);
		builder.append(", anFabricatie=");
		builder.append(anFabricatie);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append("]");
		return builder.toString();
	}
	
	
}
