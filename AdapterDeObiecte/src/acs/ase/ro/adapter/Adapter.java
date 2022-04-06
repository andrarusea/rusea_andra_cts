package acs.ase.ro.adapter;

import acs.ase.ro.validatoareSubterane.ValidatorMetrou;
import acs.ase.ro.validatoareSubterane.ValidatorSubteran;
import acs.ase.ro.validatoareTerestre.ValidatorTerestru;

public class Adapter implements ValidatorTerestru {
	private ValidatorSubteran validatorMetrou;

	public Adapter(ValidatorSubteran validatorMetrou) {
		this.validatorMetrou = validatorMetrou;
	}
	
	@Override
	public void valideazaBilet() {
		validatorMetrou.valideazaCalatorie();
	}

	@Override
	public void valideazaAbonament() {
		validatorMetrou.valideazaAbonament();
	}

}
