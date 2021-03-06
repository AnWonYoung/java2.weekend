package com.kita.second.level1.baseball;

public class Baseball {
	// 컴퓨터가 랜덤으로 숫자 뽑은 클래스
	// 필드
	private int[] rArr;
	
	// 생성자
	public Baseball (int gameCnt) {
		rArr = new int[gameCnt];
		setRandoms();
	}
	
	// 메소드
	// 1)랜덤값을 배열 안에 set해주기 setRandoms()
	// 2) 배열 안의 랜덤값 하나 뽑기 getRnum()
	
	
//	for(int i=0; i<arr.length; i++) {
//		arr[i] = (int)(Math.random() * (max - min + 1) + min);
//		for(int z=0; z<i; z++) { // z<=i-1
//			if(arr[i] == arr[z]) {
//				i--;
//				break;
//			}
//		}
//	}
	
	// 1) 중복되지 않게 배열해주기
	
	private void setRandoms() { //private로 외부에서 사용 차단하기, 랜던값을 바꾸지 못하도록
		int max = 9;
		int min = 1;
		for(int i=0; i<rArr.length; i++) {
			rArr[i] = (int)(Math.random() * (max - min + 1) + min);
			 for(int z=0; z<i; z++) { // 중복 방지 for문
				 if(rArr[i] == rArr[z]) {
					 i--;
					 break;
				 }
			 }
		}
		
	}
	
	// 2) 하나의 값만 getRNum()
	
	int getRnum(int idx) {
		return rArr[idx];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
