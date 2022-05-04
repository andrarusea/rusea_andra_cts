package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.ManagerAutobuz;

public class Main {

	public static void main(String[] args) {
		Autobuz a1 = new Autobuz("Dorel", 250.0, "Model1", 2015, 20);
		ManagerAutobuz manager = new ManagerAutobuz();
		manager.adaugaMemento(a1.genereazaMemento());
		
		a1.setNume("Ion");
		manager.adaugaMemento(a1.genereazaMemento());
		a1.setConsum(200.0);
		System.out.println(a1);
		a1.revineLaOStareAnterioara(manager.getMemento(0));
		System.out.println(a1);
	}

}
