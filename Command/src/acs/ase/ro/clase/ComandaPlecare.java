package acs.ase.ro.clase;

public class ComandaPlecare implements Comanda{
	private Integer linie;
	private Autobuz autobuz;
	
	public ComandaPlecare(Integer linie, Autobuz autobuz) {
		super();
		this.linie = linie;
		this.autobuz = autobuz;
	}

	@Override
	public void executa() {
		autobuz.pleaca(linie);
	}

}
