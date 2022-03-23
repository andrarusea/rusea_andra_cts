package acs.ase.ro.clase;

import java.util.Arrays;

public abstract class Aplicant {
	public static int pragPunctaj = 80;

	protected String nume;
	protected String prenume;
	protected Integer varsta;
	protected Integer punctaj;
	protected Integer nrProiecte;
	protected String[] denumireProiect;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public void setVarsta(Integer varsta) {
		this.varsta = varsta;
	}

	public static void setPragPunctaj(Integer pragPunctaj) {
		Aplicant.pragPunctaj = pragPunctaj;
	}

	public void afiseazaStatus() {
		System.out.println(
				"Aplicantul " + nume + " " + prenume + (punctaj >= pragPunctaj ? " " : " nu ") + "a fost acceptat.");
	}

	public void setPunctaj(Integer punctaj) {
		this.punctaj = punctaj;
	}

	public Aplicant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aplicant(String nume, String prenume, Integer varsta, Integer punctaj, Integer nrProiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.nrProiecte = nrProiecte;
		this.denumireProiect = denumireProiect;
	}

	public void setDenumiriProiecte(Integer nrProiecte, String[] denumiri) {
		this.nrProiecte = nrProiecte;
		this.denumireProiect = new String[this.nrProiecte];
		for (int i = 0; i < this.nrProiecte; i++) {
			this.denumireProiect[i] = denumiri[i];
		}
	}

	public void afiseazaFinantarePeZi(Integer sumaPeZi) {
		System.out.println(
				"Aplicantul " + getNume() + " " + getPrenume() + " primeste " + sumaPeZi + " Euro/zi in proiect.");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nrProiecte=");
		builder.append(nrProiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		return builder.toString();
	}
	
	

}
