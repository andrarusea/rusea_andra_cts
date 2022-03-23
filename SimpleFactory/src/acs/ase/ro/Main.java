package acs.ase.ro;

public class Main {

	public static void main(String[] args) {
		MijlocDeTransport autobuz = CreatorMijlocDeTransport.creeazaMijlocDeTransport(TipMijlocTransport.Autobuz, "abcdef");
		System.out.println(autobuz);
		
		MijlocDeTransport tramvai = CreatorMijlocDeTransport.creeazaMijlocDeTransport(TipMijlocTransport.Tramvai, "xyzcvb");
		System.out.println(tramvai);

		MijlocDeTransport troleu = CreatorMijlocDeTransport.creeazaMijlocDeTransport(TipMijlocTransport.Troleu, "qwerty");
		System.out.println(troleu);

	}

}
