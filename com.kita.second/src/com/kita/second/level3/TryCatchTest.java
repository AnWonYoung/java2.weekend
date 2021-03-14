package com.kita.second.level3;
public class TryCatchTest {
	public static void main(String[] args) {
		Child c = new Child();
		try {
			c.method2();
		} catch(Exception e) {
			System.out.println("");
		}
	}

}
