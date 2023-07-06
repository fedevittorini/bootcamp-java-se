package com.eduit;

import java.util.List;

public abstract class Animal {

	public static final String BASE_DNA = "TGGTATGGA"; 
	
	private List<Extremidad> extremidades;
	
	private String type;
	
	public abstract void jump();
	
	public Animal() {
		
	}

	public Animal(List<Extremidad> extremidades, String type) {
		this.extremidades = extremidades;
		this.type = type;
	}

	public List<Extremidad> getExtremidades() {
		return extremidades;
	}

	public void setExtremidades(List<Extremidad> extremidades) {
		this.extremidades = extremidades;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public static Boolean isLeg(String extremidad) {
		return extremidad.equals("Pierna");
	}
	
}
