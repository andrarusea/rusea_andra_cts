package acs.ase.ro.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EleviReader extends AplicantReader{

	public EleviReader(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		scanner.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Elev elev = new Elev();
			readAplicant(scanner, elev);
			int clasa = scanner.nextInt();
			elev.setClasa(clasa);
			String tutore = scanner.next();
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		scanner.close();
		return elevi;
	}

}
