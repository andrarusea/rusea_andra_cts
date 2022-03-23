package acs.ase.ro;

public class MicrobuzFactory implements MijlocDeTransportFactory{

	@Override
	public MijlocDeTransport creeazaMijlocDeTransport(String nrInmatriculare) {
		return new Microbuz(nrInmatriculare);
	}

}
