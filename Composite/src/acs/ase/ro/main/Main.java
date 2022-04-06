package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.Grup;
import acs.ase.ro.clase.NodAbstract;

public class Main {
	public static void main(String[] args) {
		NodAbstract grupMic = new Grup("Grup mic");
		NodAbstract grupMare = new Grup("Grup mic");
		NodAbstract flota = new Grup("Flota");
		NodAbstract a1 = new Autobuz("Prod1", "A1", 12);
		NodAbstract a2 = new Autobuz("Prod1", "A2", 7);
		NodAbstract a3 = new Autobuz("Prod1", "A3", 45);
		
		try {
			grupMic.addNod(a1);
			grupMic.addNod(a2);
			grupMare.addNod(a3);
			flota.addNod(grupMic);
			flota.addNod(grupMare);
			flota.afiseazaDescriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
