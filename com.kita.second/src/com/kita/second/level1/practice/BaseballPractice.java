package com.kita.second.level1.practice;

import java.util.Scanner;

public class BaseballPractice {
	public static void main(String[] args) {
		// 숫자야구게임
		Scanner sc = new Scanner(System.in);
		final int LEN = 3; // 게임 칸 개수
		int[] rArr = new int[LEN]; // 컴퓨터가 뽑는 값 배열
		int[] myArr = new int[LEN]; // 내가 입력한 값 배열
		// 랜덤 숫자 범위
		int max = 9;
		int min = 1;
		// 내가 맞힌 숫자
		int strike;
		int ball;
//		int out; // LEN - strike - ball
		int cnt=0;
		
		System.out.println("숫자야구게임 시작!");
		// 컴퓨터가 랜덤한 정수값을 뽑아서 rArr에 담기
		// 중복 허용 x
		
		
		// strike==LEN일 때까지 반복  while(true)문 이용
		while(true) {
			strike=0;
			ball=0;
			// 내가 정수값 3개 입력받아서 myArr에 넣기
			
			
			// S와 B과 O 개수 체크
			
			
			if(strike==LEN) {
				break;
			}
			// s, b, o 개수 출력
		}
		
		System.out.println("게임종료");
	}
}
