package acs.ase.ro.main;

import acs.ase.ro.clase.Autobuz;
import acs.ase.ro.clase.AutobuzBuilder;
import acs.ase.ro.clase.AutobuzBuilderV2;

public class Main {

	public static void main(String[] args) {
		Autobuz autobuz;
		AutobuzBuilder builder = new AutobuzBuilder();
		autobuz = builder.build();
		System.out.println(autobuz);
		
		Autobuz autobuz2 = new AutobuzBuilder().setIsNew(true).setNrInmatriculare("abcdef").setOpenDoors(true).build();
		System.out.println(autobuz2);	
		
		AutobuzBuilderV2 builderV2 = new AutobuzBuilderV2();
		Autobuz a1 = builderV2.setIsNew(true).setNrInmatriculare("abccghscvsw").build();
		Autobuz a2 = builderV2.setNumeSofer("Gigel").build();
		System.out.println(a1);
		System.out.println(a2);

	}

}
