package com.kita.second.level1;
// Phone 실행 클래스
import java.util.Scanner;
public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 참조변수 찍어내서 설계도를 사용할 수 있도록 하기
		// phone 클래스에 static을 붙이지 않아서 new Phone로 찍어내주기
		// static을 설계도에 이미 찍어두면 미리 저장소에 올라가는 식, 메모리 차지가 커짐
		
		Phone myPhone = new Phone(); 
		myPhone.call("엄마");
//		myPhone.~으로 치면 phone의 속성이 모두 뜨고, 값을 넣을 수 있음
//		myPhone.color = "파랑";
//		myPhone.phoneName = "아이폰 12";
//		myPhone.owner = "안원영";
//		myPhone.memory = 512;
		
		Phone p1 = new Phone("갤럭시 s20", "빨강", 256);
//		Phone p2 = new Phone(phoneName, owner, color, memory, phoneNumber);
//		int p1Memory = p1.getMemory();
//		System.out.println("p1의 메모리는" + p1Memory);		
//		p1.setMemory(512);
//		p1Memory = p1.getMemory();
//		System.out.println("p1의 메모리는" + p1Memory);
				
// 나의 폰의 각각의 인스턴스, 설계도에는 변동이 없음
		
	}

}
