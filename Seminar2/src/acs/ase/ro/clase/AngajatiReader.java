package acs.ase.ro.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {
	public AngajatiReader(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			readAplicant(scanner, angajat);
			int salariu = scanner.nextInt();
			angajat.setSalariu(salariu);
			String ocupatie = scanner.next();
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}

}
