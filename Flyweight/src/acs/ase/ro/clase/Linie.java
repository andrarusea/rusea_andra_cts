package acs.ase.ro.clase;

public class Linie implements AutobuzLinie{
	private Integer nrLinie;
	private String primaStatie;
	private String ultimaStatie;
	
	public Linie(Integer nrLinie, String primaStatie, String ultimaStatie) {
		super();
		this.nrLinie = nrLinie;
		this.primaStatie = primaStatie;
		this.ultimaStatie = ultimaStatie;
	}
	
	public Integer getNrLinie() {
		return nrLinie;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[nrLinie=");
		builder.append(nrLinie);
		builder.append(", primaStatie=");
		builder.append(primaStatie);
		builder.append(", ultimaStatie=");
		builder.append(ultimaStatie);
		builder.append(", ");
		return builder.toString();
	}

	@Override
	public void afiseazaDescriere(Autobuz autobuz) {
			System.out.println("AutobuzLinie: " + this.toString() + autobuz.toString());
	}

}
