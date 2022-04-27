package acs.ase.ro.main;

import acs.ase.ro.clase.AutobuzHandler;
import acs.ase.ro.clase.MetrouHandler;
import acs.ase.ro.clase.TramvaiHandler;
import acs.ase.ro.clase.TransportHandler;

public class Main {

	public static void main(String[] args) {
		TransportHandler tramvaiHandler = new TramvaiHandler(3);
		TransportHandler autobuzHandler = new AutobuzHandler(5);
		TransportHandler metrouHandler = new MetrouHandler(10);

		tramvaiHandler.setNextHandler(autobuzHandler);
		autobuzHandler.setNextHandler(metrouHandler);
		
		tramvaiHandler.deplaseazaRequest(4);
		
		TransportHandler tramvaiHandler2 = new TramvaiHandler(2);
		TransportHandler autobuzHandler2 = new AutobuzHandler(10000);
		tramvaiHandler2.setNextHandler(autobuzHandler2);

		tramvaiHandler2.deplaseazaRequest(1);
	}

}
