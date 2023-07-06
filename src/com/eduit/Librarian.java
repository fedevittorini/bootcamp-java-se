package com.eduit;

public class Librarian extends Parson {
	
	
	public void doYourThing() {
		super.jump();
		super.decirNombre();
	}
	
	@Override
	protected void gritar(String txt) {
		System.out.println("¡" + txt + "!");
	}

}
