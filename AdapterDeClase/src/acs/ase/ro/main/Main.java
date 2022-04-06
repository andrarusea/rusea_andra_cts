package acs.ase.ro.main;

import acs.ase.ro.adapter.Adapter;
import acs.ase.ro.validatoareTerestre.ValidatorAutobuz;
import acs.ase.ro.validatoareTerestre.ValidatorTerestru;

public class Main {
	public static void main(String[] args) {
		ValidatorTerestru validatorAutobuz = new ValidatorAutobuz();
		validatorAutobuz.valideazaBilet();
		validatorAutobuz.valideazaAbonament();
		
		ValidatorTerestru validatorMetrou = new Adapter();
		validatorMetrou.valideazaBilet();
		validatorMetrou.valideazaAbonament();
	}
	
}
