package acs.ase.ro.decoratori;

import acs.ase.ro.clase.Printer;

public abstract class Decorator implements Printer {
	public Printer printer;
	
	public Decorator(Printer printer) {
		super();
		this.printer = printer;
	}

	@Override
	public void printeazaBilet() {
		printer.printeazaBilet();
	}
	
	public abstract void printeazaMesaj();
}
