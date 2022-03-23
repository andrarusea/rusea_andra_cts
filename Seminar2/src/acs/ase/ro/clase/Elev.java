package acs.ase.ro.clase;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Elev ");
		builder.append(super.toString());
		builder.append(", clasa=");
		builder.append(clasa);
		builder.append(", tutore=");
		builder.append(tutore);
		builder.append("]");
		return builder.toString();
	}

	public Elev() {
		super();
	}
}
