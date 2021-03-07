package com.kita.second.level2;

public class Singleton {
	private static Singleton sg = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(sg == null) {
			sg = new Singleton();
		}
		return sg;
	}

}
