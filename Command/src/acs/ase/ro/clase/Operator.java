package acs.ase.ro.clase;

import java.util.LinkedList;
import java.util.Queue;

public class Operator {
	private Queue<Comanda> listaComenzi;

	public Operator() {
		super();
		this.listaComenzi = new LinkedList<>();
	}

	public void adaugaComanda(Comanda comanda) {
		listaComenzi.add(comanda);
	}
	
	public void executaComanda() {
		if(listaComenzi.size() > 0) {
			listaComenzi.poll().executa();
		} else {
			System.out.println("Nu mai exista comenzi in asteptare");
		}
	}
}
