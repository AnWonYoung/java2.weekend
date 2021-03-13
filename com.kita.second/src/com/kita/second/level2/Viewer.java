package com.kita.second.level2;

public class Viewer {
	Netflix nf1;
	Netflix nf2;
	Netflix nf3;
	
	public Viewer() {
		this.nf1 = new Netflix(2);
		this.nf2 = new Netflix(3);
		this.nf3 = new Netflix(4);
	}
	
	int watchNetflix() {
		boolean result1 = nf1.watch();
		if(false == result1) {
			stopWatching();
			return 1;
		}
		if(false == nf2.watch()) {
			stopWatching();
			return 2;
		}
		if(false == nf3.watch()) {
			stopWatching();
			return 3;
		}
		return 0;
	}
	void chooseNew() {
		for(int i=1; i<=10; i++) {
			System.out.println(i+"회 반복중");
			int result = this.watchNetflix();
			
			switch(result) {	// if와 달리 변수가 들어감
			case 1:
				this.nf1 = new Drama(4); // 4편짜리 드라마
				System.out.println("새 드라마를 골랐다.");
				break;
			case 2:
				this.nf2 =  new Movie(5);
				System.out.println("새 영화를 골랐다.");
				break;
				
			case 3:
				this.nf3 = new Netflix(6);
				System.out.println("새 넷플릭스 작품을 골랐다.");
				break;
			}
			System.out.println("--------------------");
		}
	}
	
	void stopWatching() {
		System.out.println("시청을 그만둔다.");
	}

}
