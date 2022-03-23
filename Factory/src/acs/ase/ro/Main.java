package acs.ase.ro;

public class Main {
	
	public static void creeazaMijlocTransport(String nrInmatriculare, MijlocDeTransportFactory factory) {
		MijlocDeTransport mijlocDeTransport = factory.creeazaMijlocDeTransport(nrInmatriculare);
		System.out.println(mijlocDeTransport);
	}
	
	public static void main(String[] args) {
		MijlocDeTransportFactory factory = new AutobuzFactory();
		creeazaMijlocTransport("abcedf", factory);
		
		factory = new TramvaiFactory();

		
		factory = new TroleuFactory();

}
}
