package acs.ase.ro.clase;

public abstract class MijlocTransport implements Cloneable {
	private String numar;

	public MijlocTransport(String numar) {
		this.numar = numar;
	}

	public String getNumar() {
		return numar;
	}

	public void setNumar(String numar) {
		this.numar = numar;
	}

	public abstract MijlocTransport copiaza() throws CloneNotSupportedException;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" numar=");
		builder.append(numar);
		builder.append(" ");
		return builder.toString();
	}
}
