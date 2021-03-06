package com.kita.second.level2;

public class AnimalTest {
	public static void main(String[] args) {
		Dog d1 = new Dog("누렁이");
		System.out.println("d1의 이름은 " + d1.name);
		d1.cry();
		d1.barking();
		
		Animal a1 = new Animal("미미");
		System.out.println("a1의 이름은 " + a1.name);
		a1.cry();
	}
}
