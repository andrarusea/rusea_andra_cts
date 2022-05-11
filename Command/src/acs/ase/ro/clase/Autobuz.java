package acs.ase.ro.clase;

public class Autobuz {
	private String nrInmatriculare;
	
	public Autobuz(String nrInmatriculare) {
		super();
		this.nrInmatriculare = nrInmatriculare;
	}

	public void pleaca(Integer linie) {
		System.out.println("Autobuzul " + nrInmatriculare + " a plecat pe linia " + linie);
	}
}
