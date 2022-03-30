package acs.ase.ro.clase;

public class Autobuz extends MijlocTransport {
	private String sofer;

	public Autobuz(String numar, String sofer) {
		super(numar);
		this.sofer = sofer;
	}

	public String getSofer() {
		return sofer;
	}


	public void setSofer(String sofer) {
		this.sofer = sofer;
	}

	@Override
	public MijlocTransport copiaza() throws CloneNotSupportedException {
		return (MijlocTransport) this.clone();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [sofer=");
		builder.append(sofer);
		builder.append(", ");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
