package com.kita.second.level1.practice;

public class Practice01 {
	// 구구단 2단 찍기 메소드
	/* 2 * 1 = 2
	   2 * 2 = 4
	    ...*/
	
//	  public static void main(String[] args) { 
//	  printGugudan();
//	  System.out.println(); 
//	  printGugudan2(3); // ()안에 원하는 단의 값을 넣어주면 됨
//	  System.out.println();
//	  
//	  printStars(3,5);
	
//	  }
	  
	  int result = sum(1, 2);
	  int result2 = sum(result, 3);
	  
	  public static int sum(int n1, int n2) {
			int result = n1+n2;
			return result;
		}
	 


	public static void printGugudan() { // 2단만 찍기, 매개변수 필요X
		for (int i = 1; i < 10; i++) {
			System.out.printf("2 * %d = %d\n", i, i*2);
		}	
	}
	// 집어 넣어주는 값으로 구구단 찍기
	// 오버로딩(Overloading) : 같은 이름의 메소드명을 매개변수를 달리 하여 여러 번 같은 코드를 사용할 수 있도록 하는 것
	
	public static void printGugudan2(int dan) { // 값을 넣어야 하기 때문에 매개변수가 필요, 매개변수가 달라서 Gugudan2로 숫자를 바꿀 필요는 사실 없음
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, i*dan);
		}	
	}
	
	/*
	 * public static void printGugudan2(int dan, int max) { // 같은 메소드명이라도 받는 변수가 달라서
	 * 가능 (두 개를 찍고 싶을 때) for (int i = 1; i < 10; i++) {
	 * System.out.printf("%d * %d = %d\n", dan, i, i*dan); } }
	 * 
	 * //String 값의 매개변수일 때 순서가 바뀌어도 가능 public static void printGugudan2(String max,
	 * int dan) { // 같은 메소드명이라도 받는 변수가 달라서 가능 (두 개를 찍고 싶을 때) for (int i = 1; i < 10;
	 * i++) { System.out.printf("%d * %d = %d\n", dan, i, i*dan); } }
	 */

	// 별찍기 메소드
	// 내가 입력하는 값에 따라 line(줄)과 star(별 개수)가 달라지도록
	// line : 3, star: 5

	
	/* 
	 * public static void printStars() { 
	 * for(int i = 0; i < 3; i++) { 
	 * for(int j = 0;j < 5; j++) { 
	 * System.out.print("*"); 
	 * } 
	 * 
	 * System.out.println(); 
	 *  }
	 * }
	 */
	
	public static void printStars(int line, int star) {
		for(int i = 0; i< line; i++) {
			for(int z = 0; z < star; z++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	

}
	
	
	
	
	
