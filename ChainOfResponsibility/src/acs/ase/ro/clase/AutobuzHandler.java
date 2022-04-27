package acs.ase.ro.clase;

public class AutobuzHandler extends TransportHandler{

	public AutobuzHandler(Integer limita) {
		super(limita);
	}

	@Override
	public void deplaseazaRequest(Integer distanta) {
		if(distanta < super.limitaSuperioara) {
			System.out.println("Merge cu autobuzul.");
		} else {
			this.nextHandler.deplaseazaRequest(distanta);
		}
	}

}
