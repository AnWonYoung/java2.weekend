package com.kita.second.level1;

public class PrivateField {
	private int field1; // private로 외부접근 막기
	private String field2;

	// 생성자 private가 있어도 내부라 인스턴스 생성 후 값을 넣을 수 있음
	PrivateField(int field1, String field2) {
		this.field1 = field1;
		this.field2 = field2;
	}
	
	// set, get 예제 우클릭, general get set 누르면 자동 생성
	void setField1(int field1) { // 값을 넣는 생성자, 메소드같은 역할을 함
		this.field1 = field1;
	}
	
	int getField1() {			/* get은 return으로 돌려주고 앞에 본 필드의 타입을 적어주기 */
		return field1;
	}
	
	void setField2(String field2) {
		this.field2 = field2;
	}
	
	String getField2() {
		return field2;
	}
	
	
}
