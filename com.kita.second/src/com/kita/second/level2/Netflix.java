package com.kita.second.level2;

public class Netflix {
	int chapter = 0;
	int maxChapter; // 작품의 최대 편 수 , 도달하면 시청 끝
	
	public Netflix(int maxChapter) {	//최대 편수를 매개변수로 받기
		this.maxChapter = maxChapter;
	}
	
	boolean watch() {	// boolean 값으로 리턴 시키기  
		++chapter;	
		if(chapter <= maxChapter) {	
			System.out.println("넷플릭스를 시청한다.");
			return true;
		}
		System.out.println("넷플릭스를 이미 다 시청했다.");
		return false;	// 최대 쳅터보다 더 크면 중단
	}
		
	
	

}
