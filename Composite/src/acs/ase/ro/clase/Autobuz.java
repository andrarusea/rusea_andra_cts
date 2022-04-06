package acs.ase.ro.clase;

import java.util.concurrent.ExecutionException;

public class Autobuz implements NodAbstract {
	private String producator;
	private String model;
	private Integer nrLocuri;

	public Autobuz(String producator, String model, Integer nrLocuri) {
		super();
		this.producator = producator;
		this.model = model;
		this.nrLocuri = nrLocuri;
	}

	public String getProducator() {
		return producator;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getNrLocuri() {
		return nrLocuri;
	}

	public void setNrLocuri(Integer nrLocuri) {
		this.nrLocuri = nrLocuri;
	}

	@Override
	public void afiseazaDescriere() throws Exception {
		System.out.println(this.toString());
	}

	@Override
	public NodAbstract getNod(Integer pozitie) throws Exception {
		throw new Exception("Nu este implementata");
	}

	@Override
	public void addNod(NodAbstract nod) throws Exception {
		throw new Exception("Nu este implementata");
	}

	@Override
	public void remove(NodAbstract nod) throws Exception {
		throw new Exception("Nu este implementata");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [producator=");
		builder.append(producator);
		builder.append(", model=");
		builder.append(model);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append("]");
		return builder.toString();
	}

	
}
