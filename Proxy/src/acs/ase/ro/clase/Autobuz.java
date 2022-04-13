package acs.ase.ro.clase;

public class Autobuz implements MijlocDeTransport{
	private Integer nrCalatori;
	private String model;
	
	public Autobuz(Integer nrCalatori, String model) {
		super();
		this.nrCalatori = nrCalatori;
		this.model = model;
	}

	@Override
	public void opresteInStatie() {
		System.out.println("Autobuzul s-a oprit in statie cu " + nrCalatori + " calatori.");
	}

	@Override
	public Integer getNrCalatori() {
		return nrCalatori;
	}

}
