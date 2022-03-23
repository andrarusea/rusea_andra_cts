package acs.ase.ro;

public abstract class MijlocDeTransport {
	private String nrInmatriculare;

	public MijlocDeTransport(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}
	
	public String getNrInamtricualre() {
		return this.nrInmatriculare;
	}
	
	
}
