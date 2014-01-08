package com.tutorial.patterns.abstract_factory;

public interface Connection {
	
/*	abstract factory implementation
	it creates several interfaces without
	specifying type, it can be connection for
	MySql or some other
*/	
	public Statement createStatement();
	
	public PreparedStatement prepareStatement(String sql);
	
	public CallableStatement prepareCall(String sql);
}
