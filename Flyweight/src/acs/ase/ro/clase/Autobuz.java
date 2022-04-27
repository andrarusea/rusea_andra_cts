package acs.ase.ro.clase;

public class Autobuz {
	private String model;
	private Integer anFabricatie;
	private Integer nrLocuri;
	
	public Autobuz(String model, Integer anFabricatie, Integer nrLocuri) {
		super();
		this.model = model;
		this.anFabricatie = anFabricatie;
		this.nrLocuri = nrLocuri;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" model=");
		builder.append(model);
		builder.append(", anFabricatie=");
		builder.append(anFabricatie);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append("]");
		return builder.toString();
	}
	
	
}
