package com.tutorials.finalizer;

public class Finalization {

	static class BigObject {
		char [] tmp = new char[10000];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while(true){
			new BigObject();
			try {
				Thread.sleep(10);
			}catch( InterruptedException e) {
				if(i++%100==0){
					System.out.println("Total: "+ Runtime.getRuntime().totalMemory()+
							"; free: "+ Runtime.getRuntime().freeMemory());
				}
			}
		}
	}
	
}