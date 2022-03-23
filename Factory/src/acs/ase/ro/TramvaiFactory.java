package acs.ase.ro;

public class TramvaiFactory implements MijlocDeTransportFactory{

	@Override
	public MijlocDeTransport creeazaMijlocDeTransport(String nrInmatriculare) {
		return new Tramvai(nrInmatriculare);
	}

}
