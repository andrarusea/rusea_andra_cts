package acs.ase.ro;

public class Troleu extends MijlocDeTransport{

	public Troleu(String nrInmatriculare) {
		super(nrInmatriculare);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Troleu [getNrInamtricualre()=");
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
