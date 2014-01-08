package com.tutorial.patterns.abstract_factory;

public interface Driver {
/*	When we establish connection with db
	we send all information as a String
	such as: login, password
*/	
	public Connection connect(String url);
	
	public boolean acceptsURL(String url);
}
