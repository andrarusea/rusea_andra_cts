package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.Calator;
import acs.ase.ro.clase.Observer;
import acs.ase.ro.clase.Subject;

public class Main {

	public static void main(String[] args) {
		Subject autobuz = new Autobuz(12);
		Observer calator1 = new Calator("Dorel");
		autobuz.aboneaza(calator1);
		Observer calator2 = new Calator("Gigel");
		autobuz.aboneaza(calator2);
		Observer calator3 = new Calator("Marcel");
		autobuz.aboneaza(calator3);

		((Autobuz)autobuz).notifica("Autobuzul a ajuns la capatul liniei");;
		
		
	}

}
