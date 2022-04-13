package asc.ase.ro.main;

import asc.ase.ro.clase.CardBancar;
import asc.ase.ro.clase.SMS;
import asc.ase.ro.clase.Validator;

public class Main {

	public static void main(String[] args) {
		Validator validator = new Validator(25);
		validator.platestecalatorie();
		
		validator.setModPlata(new CardBancar());
		validator.platestecalatorie();
		
		validator.setModPlata(new SMS());
		validator.platestecalatorie();
	}

}
