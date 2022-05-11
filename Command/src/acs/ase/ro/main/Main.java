package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.Comanda;
import acs.ase.ro.clase.ComandaPlecare;
import acs.ase.ro.clase.Operator;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz1 = new Autobuz("153154");
		Autobuz autobuz2 = new Autobuz("469461");

		Operator operator = new Operator();
		operator.adaugaComanda(new ComandaPlecare(2, autobuz2));
		operator.adaugaComanda(new ComandaPlecare(1, autobuz1));
		operator.adaugaComanda(new ComandaPlecare(3, autobuz2));
		operator.adaugaComanda(new ComandaPlecare(2, autobuz1));

		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();
		operator.executaComanda();

	}
}
