package acs.ase.ro.clase;

public interface NodAbstract {
	public void afiseazaDescriere() throws Exception;

	public NodAbstract getNod(Integer pozitie) throws Exception;

	public void addNod(NodAbstract nod) throws Exception;

	public void remove(NodAbstract nod) throws Exception;
}
