package teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import clase.IPersoana;
import clase.Persoana;
import exceptii.ExceptieCNPGresit;

public class GetVarstaTest {
	@Test
	public void getVarsta() {
		IPersoana persoana = new Persoana("Andra", "6000603035280");
		assertEquals(21, persoana.getVarsta());
	}
	
	@Test
	public void getVarstaLeftBoundary() {
		IPersoana persoana1 = new Persoana("Dorel", "3000202222324");
		assertEquals(222, persoana1.getVarsta());
	}
	
	@Test
	public void getVarstaRightBoundary() {
		IPersoana persoana2 = new Persoana("Ana", "6220103035280");
		assertEquals(0, persoana2.getVarsta());
	}
	
	@Test(expected = ExceptieCNPGresit.class)
	public void errorCheckGetVarsta() {
		Persoana persoanaF = new Persoana("Dorel", "62500603035280");
		persoanaF.getVarsta();
	}
	
	@Test(expected = NumberFormatException.class)
	public void error2GetVarsta() {
		Persoana persoanaF = new Persoana("Dorel", "asxfxfdxrxerrxr");
		persoanaF.getVarsta();
	}
	
	@Test(timeout = 100)
	public void performanceGetVarsta() {
		Persoana persoanaF = new Persoana("Dorel", "6000603035280");
		persoanaF.getSex();
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void errorCheckLengthGetVarsta() {
		Persoana persoanaF = new Persoana("Dorel", "62500");
		persoanaF.getVarsta();
	}
	
	@Test
	public void getVarstaOrder() {
		IPersoana persoana1 = new Persoana("Ana", "1980103035280");
		IPersoana persoana2 = new Persoana("Ana", "6000103035280");

		assertTrue(persoana1.getVarsta() > persoana2.getVarsta());
	}
	
	@Test(expected = NullPointerException.class)
	public void existanceGetVarsta() {
		Persoana persoanaF = new Persoana("Dorel", null);
		persoanaF.getVarsta();
	}
	
	
}
