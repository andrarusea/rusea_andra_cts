package cts.seminar1.clase;

public class IngrijitorZOO {
	private String nume;

	public void hranesteAnimal(Animal animal, String hrana) {
		animal.mananca(hrana);
	}
	
	public IngrijitorZOO(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
}
