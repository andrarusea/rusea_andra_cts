package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.facade.Facade;

public class Main {

	public static void main(String[] args) {
		Facade facade = new Facade(new Autobuz());
		facade.deschideUsi();
		facade.inchideUsi();
	}

}
