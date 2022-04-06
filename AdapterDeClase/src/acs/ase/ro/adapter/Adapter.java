package acs.ase.ro.adapter;

import acs.ase.ro.validatoareSubterane.ValidatorMetrou;
import acs.ase.ro.validatoareTerestre.ValidatorTerestru;

public class Adapter extends ValidatorMetrou implements ValidatorTerestru{

	@Override
	public void valideazaBilet() {
		super.valideazaCalatorie();
	}

}
