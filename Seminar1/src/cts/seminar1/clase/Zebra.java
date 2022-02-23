package cts.seminar1.clase;

public class Zebra extends Animal{

	public Zebra(String name) {
		super(name);
	}

	@Override
	public void mananca(String tipHrana) {
		System.out.println("Zebra " + getNume() + " a mancat " + tipHrana);
	}

}
