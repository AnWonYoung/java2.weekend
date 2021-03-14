package com.kita.second.level3;

public abstract class Phone {
	String model;
	int memory;
	String ai;
	
	public Phone(String model, int memory, String ai) {
		this.model = model;
		this.memory = memory;
		this.ai = ai;
	}
	
    abstract void callAI();
	
}
