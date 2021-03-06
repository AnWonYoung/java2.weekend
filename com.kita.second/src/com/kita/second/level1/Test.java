package com.kita.second.level1;

public class Test {
	//ClassEx 테스트
	public static void main(String[] args) {
		ClassEx c1 = new ClassEx();
		int result = c1.sum(3,8,4,1,2); // 정수 배열 arr의 값을 준 것
		System.out.println("result: " + result); // 결과 값 출력
		
		int result2 = c1.sum(4,7,8,9,2,1,2);
		System.out.println("result2: " + result2); // 계속해서 내가 원하는 값의 합을 구할 수 있음
	}
	

}
