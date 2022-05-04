package acs.ase.ro.clase;

public class Autobuz {
	private StareAutobuz stare;
	private Integer nrAutobuz;

	public Autobuz(Integer nrAutobuz) {
		super();
		this.stare = new LaCapatDeLinie();
		this.nrAutobuz = nrAutobuz;
	}

	public StareAutobuz getStare() {
		return stare;
	}

	protected void setStare(StareAutobuz stare) {
		this.stare = stare;
	}

	public Integer getNrAutobuz() {
		return nrAutobuz;
	}

	public void setNrAutobuz(Integer nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}

	public void pleacaInCursa() {
		new InCursa().modificaStare(this);
	}

	public void ajungeLaCapatDeLinie() {
		new LaCapatDeLinie().modificaStare(this);
	}

	public void trimiteInService() {
		new LaReparat().modificaStare(this);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [stare=");
		builder.append(stare);
		builder.append(", nrAutobuz=");
		builder.append(nrAutobuz);
		builder.append("]");
		return builder.toString();
	}
	
	

}
