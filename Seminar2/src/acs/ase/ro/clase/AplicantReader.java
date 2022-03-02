package acs.ase.ro.clase;

import java.util.Scanner;

public abstract class AplicantReader implements Reader {
	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		aplicant.setNume(nume);
		String prenume = scanner.next();
		aplicant.setPrenume(prenume);
		int varsta = scanner.nextInt();
		aplicant.setVarsta(varsta);
		int punctaj = scanner.nextInt();
		aplicant.setPunctaj(punctaj);
		int nr = scanner.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner.next();
		aplicant.setDenumiriProiecte(nr, vect);

	}
}
