package acs.ase.ro.clase;

public class InCursa implements StareAutobuz {

	@Override
	public void modificaStare(Autobuz autobuz) {
		if (autobuz.getStare() instanceof LaCapatDeLinie) {
			autobuz.setStare(this);
			System.out.println("Autobuzul nr " + autobuz.getNrAutobuz() + " a plecat in cursa.");
		} else {
			System.out.println("Autobuzul nr " + autobuz.getNrAutobuz() + " nu poate sa plece in cursa.");
		}

	}

}
