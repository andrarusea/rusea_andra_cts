package acs.ase.ro.clase;

public class AutobuzDeNoapte implements MijlocDeTransport {
	private MijlocDeTransport autobuz;
	
	public AutobuzDeNoapte(MijlocDeTransport autobuz) {
		super();
		this.autobuz = autobuz;
	}

	@Override
	public void opresteInStatie() {
		if(autobuz.getNrCalatori() == 0) {
			System.out.println("Autobuzul nu va opri in statie.");
		} else {
			autobuz.opresteInStatie();
		}
	}

	@Override
	public Integer getNrCalatori() {
		return autobuz.getNrCalatori();
	}
	
	
}
