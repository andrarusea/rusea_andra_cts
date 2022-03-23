package acs.ase.ro;

public class AutobuzFactory implements MijlocDeTransportFactory{

	@Override
	public MijlocDeTransport creeazaMijlocDeTransport(String nrInmatriculare) {
		return new Autobuz(nrInmatriculare);
	}

	

}
