package asc.ase.ro.clase;

public class SMS implements ModPlata{

	@Override
	public void plateste(Integer suma) {
		System.out.println("Plata a fost realizata prin SMS.");
	}

}
