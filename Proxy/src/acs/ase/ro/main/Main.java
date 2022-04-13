package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.AutobuzDeNoapte;
import acs.ase.ro.clase.MijlocDeTransport;

public class Main {
	public static void main(String[] args) {
		MijlocDeTransport autobuz = new Autobuz(0, "A1");
		autobuz.opresteInStatie();
		
		MijlocDeTransport autobuzDeNoapte = new AutobuzDeNoapte(autobuz);
		autobuzDeNoapte.opresteInStatie();
	}
	
}
