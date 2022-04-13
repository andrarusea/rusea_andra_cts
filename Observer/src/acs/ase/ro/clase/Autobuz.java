package acs.ase.ro.clase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Autobuz implements Subject {
	private Integer nrLinie;
	private Set<Observer> calatori;

	public Autobuz(Integer nrLinie) {
		super();
		this.calatori = new HashSet<>();
		this.nrLinie = nrLinie;
	}

	@Override
	public void aboneaza(Observer observer) {
		calatori.add(observer);
	}

	@Override
	public void dezaboneaza(Observer observer) {
		calatori.remove(observer);
	}

	@Override
	public void notifica(String mesaj) {
		for (Observer observer : calatori) {
			observer.primesteMesaj(nrLinie, mesaj);
		}
	}

	public void pleacaDeLaCapat() {
		notifica("Autobuzul pleaca de la capat");
	}

}
