package com.kita.second.level3;

public class RCUser {
//	RemoteControl re = new RemoteControl();			인터페이스는 실제 인스턴트로 만드는 게 불가능
	RemoteControl rc = new Audio();
	
	RCUser() {}

	RCUser(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(0);
	}
	
	void useRC() {
		RemoteControl rc = new Audio();
	}
	
	void useRC(RemoteControl rc) {
		rc.turnOn();
	}
 }
