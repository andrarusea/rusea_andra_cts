package asc.ase.ro.clase;

public class Validator {
	private ModPlata modPlata;
	private Integer pret;
	
	public Validator(Integer pret) {
		super();
		this.modPlata = new CardCalatorie();
		this.pret = pret;
	}

	public void platestecalatorie() {
		modPlata.plateste(pret);
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
}
