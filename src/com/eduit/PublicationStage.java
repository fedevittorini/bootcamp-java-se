package com.eduit;

public enum PublicationStage {
	//Work in progress stage
	WIP(""),
	// Pending stage
	PENDING(""),
	REVISION(""),
	PUBLISHED(""),
	CANCELED(""),
	CANCELED_DUE_TIME("", CANCELED),
	CANCELED_DUE_MONEY("", CANCELED);
	
	private String path="";
	
	private PublicationStage parent;
	
	PublicationStage(String path) {
		this.path = path;
	}
	
	PublicationStage(String path, PublicationStage parent) {
		this.path = path;
		this.parent = parent;
	}
	
	public String getPath() {
		return path;
	}
	
	public PublicationStage getParent() {
		return parent;
	}
	
	public Boolean isParent(PublicationStage parent) {
		return (this.parent.name().equals(parent.name()));
	}
	
}
