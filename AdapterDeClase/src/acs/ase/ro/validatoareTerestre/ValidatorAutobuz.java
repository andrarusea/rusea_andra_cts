package acs.ase.ro.validatoareTerestre;

public class ValidatorAutobuz implements ValidatorTerestru{

	@Override
	public void valideazaBilet() {
		System.out.println("A fost validat biletul de autobuz.");
	}

	@Override
	public void valideazaAbonament() {
		System.out.println("A fost validat abonamentul de autobuz.");
	}

}
