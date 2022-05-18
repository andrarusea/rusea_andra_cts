package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.IPersoana;
import clase.Persoana;

public class GetSexTest {

	@Test
	public void getSex() {
		IPersoana persoanaF = new Persoana("Andra", "6000603035280");
		assertEquals("F", persoanaF.getSex());

		IPersoana persoanaM = new Persoana("Dorel", "5000603035280");
		assertEquals("M", persoanaM.getSex());
	}

	@Test
	public void getSexBoundary() {
		IPersoana persoanaM = new Persoana("Dorel", "1000603035280");
		assertEquals("M", persoanaM.getSex());
		IPersoana persoanaF = new Persoana("Ana", "6000603035280");
		assertEquals("F", persoanaF.getSex());
	}

	@Test
	public void crossCheckGetSex() {
		Persoana persoanaF = new Persoana("Dorel", "3000603035280");
		assertEquals(persoanaF.CNP.charAt(0) % 2 == 0 ? "F" : "M", persoanaF.getSex());
	}

	@Test(expected = IllegalArgumentException.class)
	public void errorCheckGetSex() {
		Persoana persoanaF = new Persoana("Dorel", "0000603035280");
		persoanaF.getSex();
	}

	@Test(timeout = 100)
	public void performanceGetSex() {
		Persoana persoanaF = new Persoana("Dorel", "6000603035280");
		persoanaF.getSex();
	}

	@Test
	public void formatCheckGetSex() {
		Persoana persoanaF = new Persoana("Dorel", "2000603035280");
		Persoana persoanaM = new Persoana("Dorel", "5000603035280");

		assertEquals("F", persoanaF.getSex());
		assertEquals("M", persoanaM.getSex());
	}
	
	@Test
	public void checkRangeGetSex() {
		Persoana persoanaF = new Persoana("Dorel", "7000603035280");
		Persoana persoanaM = new Persoana("Dorel", "8000603035280");

		assertEquals("N/A", persoanaF.getSex());
		assertEquals("N/A", persoanaM.getSex());
	}
	
	@Test(expected = NullPointerException.class)
	public void existanceGetSex() {
		Persoana persoanaF = new Persoana("Dorel", null);
		persoanaF.getSex();
	}
}
