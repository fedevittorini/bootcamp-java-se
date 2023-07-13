package com.otro;

public class DemoImpl implements Demo {

	private String name;
	
	public DemoImpl(String theName) {
		name = theName;
	}
	
	@Override
	public String str() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" name[");
		if (name != null) {
			sb.append(name);
		}
		
		sb.append("]");
		
		
		return sb.toString();
	}		
	
	
}
