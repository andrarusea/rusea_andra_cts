package cts.seminar1.main;

import cts.seminar1.clase.Girafa;
import cts.seminar1.clase.IngrijitorZOO;
import cts.seminar1.clase.ZOO;
import cts.seminar1.clase.Zebra;

public class Main {

	public static void main(String[] args) {
		IngrijitorZOO ingrijitor = new IngrijitorZOO("ingr1");
		Zebra zebra1 = new Zebra("zebra1");
		Girafa girafa1 = new Girafa("girafa1");
		
		ZOO zoo = new ZOO("Zoo1", ingrijitor);
		
		zoo.adaugaAnimal(zebra1);
		zoo.adaugaAnimal(girafa1);
		
		zoo.hranesteAnimale("mancare");
	}

}
