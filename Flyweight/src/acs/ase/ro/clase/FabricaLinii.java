package acs.ase.ro.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaLinii {
	private Map<Integer, AutobuzLinie> linii;
	
	public FabricaLinii() {
		linii = new HashMap<>();
	}
	
	public AutobuzLinie getLinie(Integer linie) {
		if(linii.containsKey(linie)) {
			return linii.get(linie);
		} else {
			linii.put(linie, new Linie(linie, "Statia 1", "Statia n"));
			return linii.get(linie); 
		}
	}
}
