package acs.ase.ro.clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentiReader extends AplicantReader{

	public StudentiReader(String file) {
		super(file);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student = new Student();
			readAplicant(scanner, student);
			int an_studii = scanner.nextInt();
			student.setAnStudii(an_studii);
			String facultate = (scanner.next()).toString();
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}

}
