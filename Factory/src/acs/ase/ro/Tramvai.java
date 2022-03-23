package acs.ase.ro;

public class Tramvai extends MijlocDeTransport {

	public Tramvai(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tramvai [getNrInamtricualre()=");
		builder.append(getNrInamtricualre());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	

}
