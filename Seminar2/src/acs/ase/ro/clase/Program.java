package acs.ase.ro.clase;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Reader reader = new AngajatiReader("angajati.txt");

		try {
			listaAngajati = reader.readAplicanti();
			for (Aplicant angajat : listaAngajati) {
				System.out.println(angajat.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
