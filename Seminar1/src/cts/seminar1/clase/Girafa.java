package cts.seminar1.clase;

public class Girafa extends Animal {

	public Girafa(String name) {
		super(name);
	}

	@Override
	public void mananca(String tipHrana) {
		System.out.println("Girafa " + getNume() + " a mancat " + tipHrana);
	}

}
