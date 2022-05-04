package acs.ase.ro.clase;

public class LaReparat implements StareAutobuz{

	@Override
	public void modificaStare(Autobuz autobuz) {
		if (autobuz.getStare() instanceof LaCapatDeLinie) {
			autobuz.setStare(this);
			System.out.println("Autobuzul nr " + autobuz.getNrAutobuz() + " a ajuns in service.");
		} else {
			System.out.println("Autobuzul nr " + autobuz.getNrAutobuz() + " nu poate sa treaca in service.");
		}
	}

}
