package com.tutorial.patterns.chain_of_responsibility;

public interface Filter {
	
	public void doFilter(
							ServletRequest request, 
							ServletResponse response, 
							FilterChain chain);
}
