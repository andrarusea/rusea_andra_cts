package acs.ase.ro.main;

import acs.ase.ro.clase.Printer;
import acs.ase.ro.clase.PrinterBilet;
import acs.ase.ro.decoratori.Decorator;
import acs.ase.ro.decoratori.DecoratorOcazional;

public class Main {

	public static void main(String[] args) {
		Printer printer = new PrinterBilet();
		printer.printeazaBilet();

		Decorator printerOcazional = new DecoratorOcazional("La multi ani!", printer);
		printerOcazional.printeazaBilet();
		printerOcazional.printeazaMesaj();
	}
}
