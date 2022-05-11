package acs.ase.ro.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import acs.ase.ro.clase.Matematica;

public class MatematicaTests {

	private Matematica matematica;

	@Before
	public void setUp() {
		matematica = new Matematica();
	}

	@Test
	public void testSumaCorecta() {
		int rezultat = matematica.suma(5, 5);
		assertEquals(10, rezultat);
	}

	@Test
	public void testRaportCorect() {
		double rezultat = matematica.raport(24, 6);
		assertEquals(4, rezultat, 0.001);
	}

	@Test
	public void testRaportCorectZecimal() {
		double rezultat = matematica.raport(27, 6);
		assertEquals(4.5, rezultat, 0.001);
	}

	@Test
	public void testRaportShouldThrowException() {
		try {
			matematica.raport(34, 0);
			fail("Metoda nu trebuia sa ajunga aici.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testEstePar() {
		assertTrue(matematica.estePar(2));
		assertTrue(matematica.estePar(24));
		assertTrue(matematica.estePar(4));
	}
	
	@Test
	public void testEsteNulaLista() {
		assertNotNull(matematica.nNumerePare(5));
	}
}
