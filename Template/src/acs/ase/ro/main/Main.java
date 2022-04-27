package acs.ase.ro.main;

import acs.ase.ro.clase.Tramvai;
import acs.ase.ro.clase.TramvaiAbstract;
import acs.ase.ro.clase.TramvaiProbe;

public class Main {
	public static void main(String[] args) {
		TramvaiAbstract tramvai = new Tramvai();
		tramvai.parcurgeTraseu();
		tramvai.parcurgeTraseuInvers();
		
		TramvaiAbstract tramvaiProbe = new TramvaiProbe();
		tramvaiProbe.parcurgeTraseu();
		tramvaiProbe.parcurgeTraseuInvers();
	}
}
