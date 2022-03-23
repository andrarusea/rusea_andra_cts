package acs.ase.ro.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return anStudii;
	}
	public void setAn_studii(int anStudii) {
		this.anStudii = anStudii;
	}

	public Student() {
		super();	
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student ");
		builder.append(super.toString());
		builder.append(", facultate=");
		builder.append(facultate);
		builder.append(", anStudii=");
		builder.append(anStudii);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
