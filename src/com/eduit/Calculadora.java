package com.eduit;

public class Calculadora {

	private boolean debugEnable = true;
	
	public Calculadora() {
		this.debugEnable = false;
	}
	
	public Calculadora(boolean theDebugEnable) {
		this.debugEnable = theDebugEnable;
	}
	
	public Double calc(Double a, Double b, String op) {
		if (debugEnable) {
			System.out.println("Debug enabled");
			System.out.println("Selected op:" + op);
		}
		Double ret = 0D;
		switch (op) {
			case "S":
				ret = sumar(a, b);
			break;
			case "R":
				ret = a - b;
			break;
			case "M":
				ret = a * b;
			break;
			case "D":
				ret = a / b;
			break;
		}
		
		return ret;
	}
	
	private Double sumar(Double a, Double b) {
		if (debugEnable) {
			System.out.println("Sumando ");
		}
		return a + b;
	}
	
	
	
	public String toString() {
		return "S";
	}
	
}
