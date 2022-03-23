package acs.ase.ro.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AplicantReader implements Reader {
	protected Scanner scanner;	
	
	public AplicantReader(String file) {
		super();
		try {
			this.scanner = new Scanner(new File(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readAplicant(Scanner scanner2, Aplicant aplicant) {
		String nume = scanner2.next();
		aplicant.setNume(nume);
		String prenume = scanner2.next();
		aplicant.setPrenume(prenume);
		int varsta = scanner2.nextInt();
		aplicant.setVarsta(varsta);
		int punctaj = scanner2.nextInt();
		aplicant.setPunctaj(punctaj);
		int nr = scanner2.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = scanner2.next();
		aplicant.setDenumiriProiecte(nr, vect);

	}
}
