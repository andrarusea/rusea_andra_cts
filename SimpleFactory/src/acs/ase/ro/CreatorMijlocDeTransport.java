package acs.ase.ro;

public class CreatorMijlocDeTransport {
	public static MijlocDeTransport creeazaMijlocDeTransport(TipMijlocTransport tipMijlocTransport, String nrInmatriculare) {
		switch(tipMijlocTransport) {
		case Autobuz:
			return new Autobuz(nrInmatriculare);
		case Tramvai:
			return new Tramvai(nrInmatriculare);
		default:
			return new Troleu(nrInmatriculare);	
			
		}
	}
}
