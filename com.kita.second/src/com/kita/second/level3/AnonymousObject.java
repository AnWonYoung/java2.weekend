package com.kita.second.level3;
// 익명 객체
public class AnonymousObject { 
	public static void main(String[] args) {
		ParentAO p = new ChildAO();
		p.parentMethod();
//		p.childMethod(); 불가능 함
		ChildAO c = (ChildAO)p;
		c.childMethod();		// 강제 형변환 후 사용 가능
		
		ParentAO p2 = new ParentAO() {
			int childFiled;		// 익명의 자식 객체 만들기
			
			@Override
			void parentMethod() {}
			
			void childMethod() {}
		};
	}

}

class ParentAO {
	int parentFiled;
	
	void parentMethod() {}
}

class ChildAO extends ParentAO {
	int childFiled;
	
	@Override
	void parentMethod() {}
	
	void childMethod() {}
}