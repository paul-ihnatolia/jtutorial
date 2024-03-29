package com.tutorial.patterns.abstract_factory;

public interface ResultSet {
	
	public boolean next();
	
	public int getInt(int index);
	
	public String getString(int index);
	
	public Double getDouble(int index);
}
