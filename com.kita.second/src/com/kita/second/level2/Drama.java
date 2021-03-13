package com.kita.second.level2;

public class Drama extends Netflix{
	public Drama(int maxChapter) {	// 자식 클래스에서도 부모 클래스와 같은 생성자를 불러야 오류 방지. 자동 생정자 처리 불가능.
		super(maxChapter);
	}
	
	@Override
	boolean watch() {
		++chapter;
		if(chapter <= maxChapter) {
			System.out.println("드라마를 시청한다.");
			return true;
		}
		System.out.println("드라마를 이미 다 시청했다.");
		return false;
	}
	
	

}
