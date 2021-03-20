package com.kita.second.level3;

public class BasicAPI {
	public static void main(String[] args) {
		String str1 = "자바 프로그래밍";
		char c1 = str1.charAt(3);
		System.out.println("c1: " + c1);
		
		String addr = "123452-3456789";
		// charAt으로 성별값을 뽑은 다음 switch문으로 "남자입니다" 혹은 "여자입니다" 출력
		char c2 = addr.charAt(7);
		switch (c2) {
		case '1': case '3':
			System.out.println("남자입니다");
			break;
		case '2': case '4':
			System.out.println("여자입니다");
		}
		
		String str2 = "자바스크립트 프로그래밍";
		boolean result1 = str2.equals(str1);
		System.out.println("result1: " + result1);
		
//		int idx1 = str1.indexOf("프로그래밍"); O
		int idx1 = str1.indexOf("스크립트"); // 오류
		System.out.println("idx1: " + idx1);
		
		String str3 = "안녕하세요 반갑습니다.";
		//indexOf를 사용해서 "안녕"이 들어가면 "있습니다"출력, 안들어가면 "없습니다"출력
		int idx2 = str3.indexOf("안녕");
		if(idx2 != -1) { // indexOf 찍고, 값을 토대로 조건문 작성
			System.out.println("있습니다");
		}else {
			System.out.println("없습니다");
		}
		
		int len = str3.length();
		System.out.println("str3의 길이는: " + len);
		
		String str4 = "오늘은 날씨가 좋다.";
		String result2 = str4.replace("날씨가", "기분이"); // 특정한 곳만 바꾸기
		System.out.println("result2: " + result2);
		System.out.println("str4: " + str4); // 원본은 바뀌지 않음
		
		String result3 = str4.substring(4); // 4자리부터 찍어줌
		System.out.println("result3: " + result3);
		String result4 = str4.substring(4, 7); // 시작과 끝을 정해주기
		System.out.println("result4: " + result4);
		
		String str5 = "Hello~ I'm fine thank you and you?";
		String result5 = str5.toLowerCase(); // 소문자
		String result6 = str5.toUpperCase(); // 대문자
		System.out.println("result5: " + result5);
		System.out.println("result6: " + result6);
		
		String str6 = "         java programming        ";
		String result7 = str6.trim();
		System.out.println("str6: " + str6);
		System.out.println("result7: " + result7); // 문자열 사이의 공백은 살이있음
		
		int num = 5;
		double num2 = 3.4;
		String str7 = String.valueOf(5);
		System.out.println("str7: " + str7);
		
		double r = Math.random(); // math.random은 double 타입, 0.0 <= r < 1.0
//		int rNum = (int)(Math.random() * (max - min +1) + min); 그래서 정수로 형변환하여 사용
		
		double d1 = Math.ceil(5.6);
		System.out.println("d1: " + d1);
		
		double d2 = Math.floor(5.6);
		System.out.println("d2: " + d2);
		
		double d3 = Math.round(5.6);
		System.out.println("d3: " + d3);
	}

}
