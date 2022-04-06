package acs.ase.ro.clase;

import java.util.ArrayList;
import java.util.List;

public class Grup implements NodAbstract {
	private List<NodAbstract> listaNoduri;
	private String denumire;

	public Grup(String denumire) {
		super();
		this.listaNoduri = new ArrayList<NodAbstract>();
		this.denumire = denumire;
	}

	@Override
	public void afiseazaDescriere() throws Exception {
		System.out.println(denumire);
		for (NodAbstract nod : listaNoduri) {
			nod.afiseazaDescriere();
		}

	}

	@Override
	public NodAbstract getNod(Integer pozitie) throws Exception {
		return listaNoduri.get(pozitie);
	}

	@Override
	public void addNod(NodAbstract nod) throws Exception {
		listaNoduri.add(nod);
	}

	@Override
	public void remove(NodAbstract nod) throws Exception {
		listaNoduri.remove(nod);
	}
}
