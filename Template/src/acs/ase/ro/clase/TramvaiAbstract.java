package acs.ase.ro.clase;

public abstract class TramvaiAbstract {
	public abstract void opresteStatie1();
	public abstract void opresteStatie2();
	public abstract void opresteStatie3();

	public final void parcurgeTraseu() {
		opresteStatie1();
		opresteStatie2();
		opresteStatie3();
	}
	
	public final void parcurgeTraseuInvers() {
		opresteStatie3();
		opresteStatie2();
		opresteStatie1();
	}
}
