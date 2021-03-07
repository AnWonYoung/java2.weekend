package com.kita.second.level1;

public class Test {
	//ClassEx 테스트
	public static void main(String[] args) {
		ClassEx c1 = new ClassEx();
		int result = c1.sum(3,8,4,1,2); // 정수 배열 arr의 값을 준 것
		System.out.println("result: " + result); // 결과 값 출력

		int result2 = c1.sum(4,7,8,9,2,1,2);
		System.out.println("result2: " + result2); // 계속해서 내가 원하는 값의 합을 구할 수 있음
		
		// 계산기 생성
		Calc myCalc = new Calc();
		double pi = Calc.pi; // 미리 메모리에 있어서 클래스명으로 바로 접근
//		int num = Calc.num; 불가능 함
		int num = myCalc.num; // 메모리에 없으며 myCalc로 따로 접근
		myCalc.num = 15;
		System.out.println("myCalc.num: " + myCalc.num);
		
		Calc yourCalc = new Calc();
		System.out.println("yourCalc.num " + yourCalc.num);
		
		Calc.pi = 3.14; // final을 안붙였다면 수정이 가능함
		
		
		
		
		
		
	}
	

}
