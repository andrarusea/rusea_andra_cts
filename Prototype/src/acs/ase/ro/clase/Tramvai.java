package acs.ase.ro.clase;

public class Tramvai extends MijlocTransport{
	private String vatman;
	
	public Tramvai(String numar, String vatman) {
		super(numar);
		this.vatman = vatman;
	}

	public String getVatman() {
		return vatman;
	}

	public void setVatman(String vatman) {
		this.vatman = vatman;
	}

	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport) this.clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tramvai [vatman=");
		builder.append(vatman);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
