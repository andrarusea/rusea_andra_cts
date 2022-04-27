package acs.ase.ro.clase;

public class MetrouHandler extends TransportHandler{

	public MetrouHandler(Integer limita) {
		super(limita);
	}

	@Override
	public void deplaseazaRequest(Integer distanta) {
			System.out.println("Merge cu metroul.");
	}
}
