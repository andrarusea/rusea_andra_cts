package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;

public class Main {
	public static void main(String[] args) {
		Autobuz a1 = new Autobuz(123);
		System.out.println(a1);
		
		a1.ajungeLaCapatDeLinie();
		a1.pleacaInCursa();
		a1.trimiteInService();
		a1.ajungeLaCapatDeLinie();
		a1.trimiteInService();
	}
}
