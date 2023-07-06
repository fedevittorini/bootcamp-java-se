package com.eduit;

import java.util.Date;
import java.util.List;

public class Cat extends Animal {

	public static final String CAT_DNA = Animal.BASE_DNA + "gggag";
	
	private String name;
	private Date birthDate;
	
	
	
	public Cat(List<Extremidad> extremidades, String type, String name, Date birthDate) {
		super(extremidades, type);
		this.name = name;
		this.birthDate = birthDate;
	}



	@Override
	public void jump() {
		

	}

}
