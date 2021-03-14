package com.kita.second.level3;
// 다양한 객체에 사용할 수 있도록 하는 인터페이스
public class Tv implements RemoteControl, Bluetooth {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume > RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	@Override
	public void connect() {
		System.out.println("TV에 블루투스를 연결합니다.");
	}

}
