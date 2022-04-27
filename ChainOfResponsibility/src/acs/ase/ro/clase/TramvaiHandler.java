package acs.ase.ro.clase;

public class TramvaiHandler extends TransportHandler{

	public TramvaiHandler(Integer limita) {
		super(limita);
	}

	@Override
	public void deplaseazaRequest(Integer distanta) {
		if(distanta < super.limitaSuperioara) {
			System.out.println("Merge cu tramvaiul.");
		} else {
			this.nextHandler.deplaseazaRequest(distanta);
		}
	}

}
