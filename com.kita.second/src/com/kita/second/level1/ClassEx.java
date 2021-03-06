package com.kita.second.level1;
// 클래스 3가지 다시 복습
public class ClassEx {
	// 필드
	int filed1;
	String filed2;
	int[] filed3;
	
	// 생성자 (필드를 초기화 시키기 위한 목적, 메소드를 넣고 찍을 때 사용)
	public ClassEx() { // << 만약, 만들지 않아도 디폴트 값으로 컴파일러가 넣어줄 수 있음
		
	}
	
	public ClassEx(int filed1) {
		this.filed1 = filed1; // 필드와 매개변수의 명이 같을 때 this.으로 언급
	}
// 	오버로딩하기
	public ClassEx(int filed1, String filed2) {
		this(filed1); // filed1 값을 그대로 가져오는 것 this.~ 코드의 반복을 막을 수 있음
		this.filed2 = filed2;
	}
	
	public ClassEx(int filed1, String filed2, int[] filed3) {
		this(filed1, filed2); // filed1의 값을 그대로 가져오는 것, 소괄호로 데려올 때 가장 첫 줄에 명시
		this.filed3 = filed3;
	}
	
	// 메소드(동작)
	public int sum(int n1, int n2) {
		int result = n1 + n2;
		return n1 + n2; // 리턴 값 명시하기
	}
	
	int sum(int n1, int n2, int n3) {
		int result = sum(n1,n2) + n3;
//		int result = n1 + n2 + n3 과 같은 식
		return n1 + n2 + n3; // 리턴 값 명시하기
	}
	
	int sum(int...arr) {
		int total = 0;
		// 실행코드
		// 몇 칸짜리인지 모르는 정수 배열 만들기
		for(int i=0; i<arr.length; i++) {
			total += arr[i]; // arr 안의 i를 모두 더해주는 것
		}		
		return total; // 리턴 안에 total값이 모두 들어감 / 리턴 값을 줘야 위의 실행코드에서 빨간 오류가 안뜸
	}
	
	// 매개변수의 1.타입 2.개수 3.위치
	
	
}
