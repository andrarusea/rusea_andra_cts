package cts.seminar1.clase;

public abstract class Animal {
	private String nume;
	
	public Animal(String name) {
		this.nume = name;
	}
	
	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public abstract void mananca(String tipHrana);
}
