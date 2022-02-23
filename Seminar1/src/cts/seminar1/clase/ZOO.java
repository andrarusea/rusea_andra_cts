package cts.seminar1.clase;

import java.util.ArrayList;
import java.util.List;

public class ZOO {
	private String nume;
	private IngrijitorZOO ingrijitor;
	private List<Animal> animale;

	public ZOO(String nume, IngrijitorZOO ingrijitor) {
		this.nume = nume;
		this.ingrijitor = ingrijitor;
		this.animale = new ArrayList<>();
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public IngrijitorZOO getIngrijitor() {
		return ingrijitor;
	}

	public void setIngrijitor(IngrijitorZOO ingrijitor) {
		this.ingrijitor = ingrijitor;
	}

	public void adaugaAnimal(Animal animal) {
		animale.add(animal);
	}

	public List<Animal> getAnimale() {
		return animale;
	}

	public void hranesteAnimale(String hrana) {
		for (Animal animal : animale) {
			ingrijitor.hranesteAnimal(animal, hrana);
		}
	}

}
