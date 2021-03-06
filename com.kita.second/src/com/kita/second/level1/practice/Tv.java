package com.kita.second.level1.practice;

public class Tv {
	// 전원(isPowerOn) 채널(channel) 볼륨(volume)
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	// 생성자
	public Tv () {
		isPowerOn = false;
		channel = 1;
		volume = 0;
	}
	
	// 메소드
	void powerOn() {
		if(isPowerOn) {
			System.out.println("전원이 이미 켜져있습니다.");
			return; // 리턴 주면서 메소드가 끝남
		}
		isPowerOn = true;
		System.out.println("전원 켜기");
	}
	
	void powerOff() {
		if(!isPowerOn) {
			System.out.println("전원이 이미 꺼져있습니다.");
			return;
		}
		isPowerOn = false;
		System.out.println("전원 끄기");
	}
	
	void channelUP() {
		channel++;
		System.out.println("채널 올리기");
	}
	
	void channelDown() {
		if(channel<2) {
			System.out.println("최소 채널입니다.");
			return;
		}
		System.out.println("채널 내리기");
	}
	
	void volumUP() {
		volume++;
		System.out.println("볼륨 높이기");
	}
	
	void volumDown() {
		if(volume<0) {
			System.out.println("최소 전원입니다.");
			return; // 리턴 주면서 메소드가 끝남
		}
		System.out.println("볼륨 내리기");
	}

}
