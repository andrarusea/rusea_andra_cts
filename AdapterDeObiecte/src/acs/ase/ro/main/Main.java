package acs.ase.ro.main;

import acs.ase.ro.adapter.Adapter;
import acs.ase.ro.validatoareSubterane.ValidatorMetrou;
import acs.ase.ro.validatoareSubterane.ValidatorSubteran;
import acs.ase.ro.validatoareTerestre.ValidatorAutobuz;
import acs.ase.ro.validatoareTerestre.ValidatorTerestru;

public class Main {

	public static void valideazaBilet(ValidatorTerestru validatorTerestru) {
		validatorTerestru.valideazaBilet();
	}

	public static void main(String[] args) {
		ValidatorSubteran validatorMetrou = new ValidatorMetrou();
		ValidatorTerestru validatorTerestru = new ValidatorAutobuz();
		valideazaBilet(validatorTerestru);
		ValidatorTerestru adapter = new Adapter(validatorMetrou);
		valideazaBilet(adapter);
	}

}
