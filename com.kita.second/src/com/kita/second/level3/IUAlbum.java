package com.kita.second.level3;
// 객체의 사용 방법을 정의한 것, 설계도 작성 양식
// 여러 객체에서 사용이 가능합
public interface IUAlbum {
	// 상수
	public static final String SINGER = "아이유";		// 절대 변하지 않는 값 static final < 인터페이스 안이라면 자동으로 생성
	
	// 추상메소드
	public abstract void playIUAlbum();				// 추상 타입 없어도 자동으로 추상 값으로 넣어줌

}
