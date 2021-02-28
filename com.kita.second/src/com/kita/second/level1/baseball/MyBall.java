package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
	// 내가 숫자값 입력하고 예외 처리하는 클래스
	// 필드
	private int[] myArr;
	private Scanner scan;
	
	public MyBall (int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
		
	}

}
