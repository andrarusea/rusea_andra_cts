package acs.ase.ro.clase;

public class AutobuzBuilderV2 implements Builder{
	private String model;
	private String numeSofer;
	private String nrInmatriculare;
	private Boolean openDoors;
	private Boolean stop;
	private String text;
	private Boolean isNew;
	private Integer nrLinie;
	
	public AutobuzBuilderV2() {
		model = "Mercedes";
		numeSofer = "Dorel";
		nrInmatriculare = "afdcafafae";
		openDoors = false;
		stop = false;
		text = "bvhjbcasc";
		isNew = false;
		nrLinie = 5;
	}
	
	@Override
	public Autobuz build() {
		return new Autobuz(model, numeSofer, nrInmatriculare, openDoors, stop, text, isNew, nrLinie);
	}

	public AutobuzBuilderV2 setModel(String model) {
		this.model = model;
		return this;
	}

	public AutobuzBuilderV2 setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
		return this;
	}

	public AutobuzBuilderV2 setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
		return this;
	}

	public AutobuzBuilderV2 setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
		return this;
	}

	public AutobuzBuilderV2 setStop(Boolean stop) {
		this.stop = stop;
		return this;
	}

	public AutobuzBuilderV2 setText(String text) {
		this.text = text;
		return this;
	}

	public AutobuzBuilderV2 setIsNew(Boolean isNew) {
		this.isNew = isNew;
		return this;
	}

	public AutobuzBuilderV2 setNrLinie(Integer nrLinie) {
		this.nrLinie = nrLinie;
		return this;
	}
	
	

}
