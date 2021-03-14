package com.kita.second.level3;

import java.util.Scanner;

// 예외처리
//int[] arr = new int[2];
//System.out.println(arr[2]);
public class TryCatch {
	public static void main(String[] args) {
		// 예외처리 기본형
		int[] arr = new int[2];
		try {
			// 에러가 날 수 있는 코드 넣기
			System.out.println(arr[2]);
		} catch(NullPointerException e) {
			System.out.println("NullPointer 오류가 발생했습니다.");
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		}
			// 예외 발생 시 처리할 코드 넣기
		 
			finally {
			System.out.println("예외처리 구간 끝");   		// 위의 코드가 맞든, 아니든 무조건 finally는 찍힘. 옵션의 종류
		}
		
		System.out.println("다음 코드");
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하시오.");
		
//		int num = scan.nextInt();
//		num = Integer.parseInt(scan.next());
		
		String strNum = scan.next();
		num = Integer.parseInt(strNum);
		arr[2] = num;
		
		// ㅇㅇ 오류가 발생했습니다. <- 2개 있음
		// 다른 모든 예외의 경우 -> 알 수 없는 오류가 발생했습니다.
		
		try {
			num = Integer.parseInt(strNum);
			arr[2] = num;
		}catch(NumberFormatException e) {
			System.out.println("NumberFormat 오류가 발생했습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds 오류가 발생했습니다.");
		}catch(Exception e) {
			System.out.println("알 수 없는 오류가 발생했습니다.");
		}
			
//		catch (Exception e) {
//			System.out.println("오류가 발생했습니다.");
//		}
//		System.out.println("알 수 없는 오류가 발생했습니다.");

	}
}



		
		
	
