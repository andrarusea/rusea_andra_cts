package acs.ase.ro.facade;

import acs.ase.ro.clase.Autobuz;

public class Facade {
	private Autobuz autobuz;

	public Facade(Autobuz autobuz) {
		this.autobuz = autobuz;
	}

	public void deschideUsi() {
		autobuz.deschideUsaFata();
		autobuz.deschideUsaMijloc();
		autobuz.deschideUsaSpate();
	}

	public void inchideUsi() {
		autobuz.inchideUsaFata();
		autobuz.inchideUsaMijloc();
		autobuz.inchideUsaSpate();
	}
}
