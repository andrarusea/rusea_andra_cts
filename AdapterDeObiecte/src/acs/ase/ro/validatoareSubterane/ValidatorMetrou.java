package acs.ase.ro.validatoareSubterane;

public class ValidatorMetrou implements ValidatorSubteran{

	@Override
	public void valideazaCalatorie() {
		System.out.println("A fost validata calatoria cu metroul.");
	}

	@Override
	public void valideazaAbonament() {
		System.out.println("A fost validat abonamentul de metrou.");
	}

}
