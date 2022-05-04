package acs.ase.ro.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerAutobuz {
	private List<AutobuzMemento> autobuze;
	
	public ManagerAutobuz() {
		autobuze = new ArrayList<>();
	}
	
	public void adaugaMemento(AutobuzMemento memento) {
		autobuze.add(memento);
	}
	
	public AutobuzMemento getMemento(Integer id) {
		return autobuze.get(id);
	}
}
