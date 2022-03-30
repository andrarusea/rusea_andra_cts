package acs.ase.ro.clase;

public class Autobuz {
	private String model;
	private String numeSofer;
	private String nrInmatriculare;
	private Boolean openDoors;
	private Boolean stop;
	private String text;
	private Boolean isNew;
	private Integer nrLinie;

	public Autobuz() {
		model = "Mercedes";
		numeSofer = "Dorel";
		nrInmatriculare = "afdcafafae";
		openDoors = false;
		stop = false;
		text = "bvhjbcasc";
		isNew = false;
		nrLinie = 5;
	}

	public Autobuz(String model, String numeSofer, String nrInmatriculare, Boolean openDoors, Boolean stop, String text,
			Boolean isNew, Integer nrLinie) {
		super();
		this.model = model;
		this.numeSofer = numeSofer;
		this.nrInmatriculare = nrInmatriculare;
		this.openDoors = openDoors;
		this.stop = stop;
		this.text = text;
		this.isNew = isNew;
		this.nrLinie = nrLinie;
	}

	public String getModel() {
		return model;
	}

	void setModel(String model) {
		this.model = model;
	}

	public String getNumeSofer() {
		return numeSofer;
	}

	void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	public String getNrInmatriculare() {
		return nrInmatriculare;
	}

	void setNrInmatriculare(String nrInmatriculare) {
		this.nrInmatriculare = nrInmatriculare;
	}

	public Boolean getOpenDoors() {
		return openDoors;
	}

	void setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
	}

	public Boolean getStop() {
		return stop;
	}

	void setStop(Boolean stop) {
		this.stop = stop;
	}

	public String getText() {
		return text;
	}

	void setText(String text) {
		this.text = text;
	}

	public Boolean getIsNew() {
		return isNew;
	}

	void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	public Integer getNrLinie() {
		return nrLinie;
	}

	void setNrLinie(Integer nrLinie) {
		this.nrLinie = nrLinie;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [model=");
		builder.append(model);
		builder.append(", numeSofer=");
		builder.append(numeSofer);
		builder.append(", nrInmatriculare=");
		builder.append(nrInmatriculare);
		builder.append(", openDoors=");
		builder.append(openDoors);
		builder.append(", stop=");
		builder.append(stop);
		builder.append(", text=");
		builder.append(text);
		builder.append(", isNew=");
		builder.append(isNew);
		builder.append(", nrLinie=");
		builder.append(nrLinie);
		builder.append("]");
		return builder.toString();
	}

}
