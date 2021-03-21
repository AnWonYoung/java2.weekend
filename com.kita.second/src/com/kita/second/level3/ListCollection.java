package com.kita.second.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class ListCollection { //기존 배열의 복잡함을 최소화
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Dog> list2 = new ArrayList<Dog>();
	
		boolean result = list1.add("안녕"); // 삽입
		String result1 = list1.get(0); // 수정
		list1.set(0, "하이");
//		String result2 = list1.remove(0); 안에 든 값을 리턴해주는 것
		boolean result2 =  list1.remove("하이"); // 삭제
		int len = list1.size();
		
		
		// list1에 좋아하는 음식 5개 이상 입력하기
		// for문 사용하여 list1안의 값 출력
		// litst1의 3번째 인덱스 값을 싫어하는 음식으로 바꾸기
		// list1의 싫어하는 음식 값 삭제하기
		list1.add("음식1");
		list1.add("음식2");
		list1.add("음식3");
		list1.add("음식4");
		list1.add("음식5");
		for(int i=0; i<list1.size(); i++) {
			System.out.println("음식: " + list1.get(i));
		}
		for(String val : list1) {
			System.out.println("음식: " + val);
		}
		
		list1.set(3, "가지");
		for(String val : list1) {
			System.out.println("음식: " + val);
		}
		
		list1.remove("가지");
		for(String val : list1) {
			System.out.println("음식: " + val);
		}
		
		Dog d1 = new Dog ("누렁이");
		Dog d2 = new Dog ("흰둥이");
		Dog d3 = new Dog ("얼룩이");
		list2.add(d1);
		list2.add(d2);
		list2.add(d3);
				
		for(int i=0; i<list2.size(); i++) {
			Dog d = list2.get(1);
			String name = d.name;
			System.out.println("강아지 이름: " + list2.get(i).name);
		}
		
		list2.set(2, new Dog("까망이"));
	    list2.remove(0); //0번 째 인덱스 값 삭제
	}
	
	
	
	
	
		
//	int[] arr = new int[5];
//	
//	void method() {
//		int[] arr2 = new int[6];
//		for(int i=0; i<arr.length; i++) {
//			arr2[i] = i;
//		}
//		arr2[arr.length] = 6;
//	}

}
