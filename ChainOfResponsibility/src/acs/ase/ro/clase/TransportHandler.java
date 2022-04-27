package acs.ase.ro.clase;

public abstract class TransportHandler {
	protected TransportHandler nextHandler;
	protected Integer limitaSuperioara;
	
	public void setNextHandler(TransportHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract void deplaseazaRequest(Integer distanta);
	
	public TransportHandler(Integer limita) {
		limitaSuperioara = limita;
		nextHandler = null;
	}
}
