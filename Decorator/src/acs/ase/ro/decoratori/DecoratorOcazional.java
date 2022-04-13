package acs.ase.ro.decoratori;

import acs.ase.ro.clase.Printer;

public class DecoratorOcazional extends Decorator{

	private String mesaj;
	
	public DecoratorOcazional(String mesaj, Printer printer) {
		super(printer);
		this.mesaj = mesaj;
	}

	public void setMesaj(String mesaj) {
		this.mesaj = mesaj;
	}

	@Override
	public void printeazaMesaj() {
		System.out.println(mesaj);
	}

}
