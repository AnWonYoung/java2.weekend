package com.kita.second.level3;

public class MusicPlayer implements IUAlbum, BTSAlbum { // 여러 인터페이스를 받을 수 있음
	public void playIUAlbum() {					// public 같이 불여줘야 함
		System.out.println("아이유 앨범을 재생한다.");
	}
	
	public void playBTSAlbum() {
		System.out.println("BTS 앨범을 재생한다.") ;
	}
	

}
