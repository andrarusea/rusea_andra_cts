package acs.ase.ro.clase;

public class TramvaiProbe extends TramvaiAbstract{

	@Override
	public void opresteStatie1() {
		System.out.println("Tramvaiul pleaca de la capat de linie.");
	}

	@Override
	public void opresteStatie2() {
		System.out.println("Tramvaiul nu opreste in statie.");
	}

	@Override
	public void opresteStatie3() {
		System.out.println("Tramvaiul ajunge in capat de linie.");

	}

}
