package acs.ase.ro;

public class TroleuFactory implements MijlocDeTransportFactory{

	@Override
	public MijlocDeTransport creeazaMijlocDeTransport(String nrInmatriculare) {
		return new Troleu(nrInmatriculare);
	}
	
}
