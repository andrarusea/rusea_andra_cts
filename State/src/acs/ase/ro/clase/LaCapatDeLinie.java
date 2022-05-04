package acs.ase.ro.clase;

public class LaCapatDeLinie implements StareAutobuz {

	@Override
	public void modificaStare(Autobuz autobuz) {
		if (! (autobuz.getStare() instanceof LaCapatDeLinie)) {
			autobuz.setStare(this);
			System.out.println("Autobuzul nr " + autobuz.getNrAutobuz() + " a ajuns la acapat de linie.");
		} else {
			System.out.println("Autobuzul nr " + autobuz.getNrAutobuz() + " este deja la capat de linie.");
		}
	}

}
