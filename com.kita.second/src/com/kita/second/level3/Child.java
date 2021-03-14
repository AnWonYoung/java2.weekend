package com.kita.second.level3;
// 예외처리 넘기기
public class Child extends Parent {
	void method2() throws Exception {	// 다음 클래스로 넘기기
		method();
	}
}
