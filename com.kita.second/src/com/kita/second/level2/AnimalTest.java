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
		
		Animal ani = new Animal("흰둥이");
		ani = new Cat("까미"); // ani는 부모 클래스라 cat이란 자식 클래스가 들어갈 수 있음, 따라서 동일한 클래스 외에도 자식까지 포함이 가능함
		ani.cry();	
		ani = new Dog("점박이");
		ani.cry();
//		ani.barking(); 			Dog타입인데도 불가능함, 앞에 타입이 이미 ani이며 부모 클래스 안에 없어서 dog까지 갈 수 없어 전달이 불가능함
		
		Dog d = (Dog)ani;
		d.barking(); 			// 강제 형변환으로 부모 타입을 자식타입으로 바꿔서 자식 클래스 메소드를 사용
		
	}
}



//double num = 10; 				 int 타입이지만 큰 타입으로 적어두면 강제 변환으로 들어감
//int num2 = (int)10.5;
