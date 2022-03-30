package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.MijlocTransport;
import acs.ase.ro.clase.Tramvai;

public class Main {
	public static void main(String[] args) {
		Autobuz autobuz = new Autobuz("abcwgvdw", "Dorel");
		System.out.println("Original: " + autobuz);
		Tramvai tramvai = new Tramvai("qwertyui", "Gigel");
		System.out.println("Original: " + tramvai);

		try {
			MijlocTransport autobuzCopie = autobuz.copiaza();
			System.out.println("Copie: " + autobuzCopie);
			MijlocTransport tramvaiCopie = tramvai.copiaza();
			System.out.println("Copie: " + tramvaiCopie);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
