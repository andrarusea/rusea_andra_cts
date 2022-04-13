package asc.ase.ro.clase;

public class CardBancar implements ModPlata{

	@Override
	public void plateste(Integer suma) {
		System.out.println("Plata a fost realizata cu un card bancar.");
	}

}
