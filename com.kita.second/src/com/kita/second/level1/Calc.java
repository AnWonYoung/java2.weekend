package com.kita.second.level1;
// 계산기 설계도
public class Calc {
	static double pi = 3.141592; // 항상 공통적으로 가지는 값은 static으로 고정시켜주기
	int num;
	
	public Calc () {
		super();
		num = 10; // num이라는 숫자는 현재 없지만, static이 붙은 pi의 값은 이미 메모리에 올라감
	}			  // 실제로 num을 만들어 주려면 Calc 설계도 뿐만이 아니라 (TEST클래스 참고) myCalc생성자를 만들어야 함
				  // 생성이 가능해야 접근이 된다는 개념, 다만 static은 바로 사용이 가능

}

