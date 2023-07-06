package com.eduit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Parson extends Animal {
	
	private String name;
	private String lastName;
	private Date birthDate;
	private String country;
	
	// Constructores
	public Parson() {
		super();
	}

	public Parson(String name, String lastName, Date birthDate,
			String country) {
		List<Extremidad> ext = new ArrayList<>();
		ext.add(new Pierna());
		ext.add(new Pierna());
		ext.add(new Brazo());
		ext.add(new Brazo());
		new Parson(ext, "Persona", name, lastName, birthDate, country);
	}

	private Parson(List<Extremidad> extremidades, String type, String name, String lastName, Date birthDate,
			String country) {
		super(extremidades, type);
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.country = country;
	}



	// setter/getter/Metodos/funciones
	//S/G
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	// Metodos.... PUBLICOS
	public void gritarNombre() {
		gritar(getName());
	}
	
	public void gritarPais() {
		gritar(getCountry());
	}
	
	public void decirNombre() {
		System.out.println(getName());
	}
		
	protected void gritar(String txt) {
		System.out.println("¡¡¡" + txt.toUpperCase() + "!!!");
	}

	@Override
	public void jump() {
		System.out.println("Bend your knees and jump");
		
	}
}
