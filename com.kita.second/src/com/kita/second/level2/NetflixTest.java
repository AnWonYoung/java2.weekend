package com.kita.second.level2;

public class NetflixTest {
	public static void main(String[] args) {
		// 넷플 테스트
		Viewer rv = new Viewer();
		rv.chooseNew();
		
		
		// 게임 테스트
		ProGamer aw = new ProGamer();
		Game gm = new Game();
		BattleGround bg = new BattleGround();
		Overwatch ow = new Overwatch();
		// 부모타입 변수 자리에 그대로 자식타입을 형변환 없이 넣을 수 있음
		aw.work(gm);
		aw.work(bg);
		aw.work(ow);
	}
}
