package kh.java.oop.access.modifier.field.run;

import kh.java.oop.access.modifier.field.Kiwi;

public class KiwiRun {

	
	public static void main(String[] args) {
		
		Kiwi kw = new Kiwi();
		System.out.println(kw.publicNum); //항상 ok
		System.out.println(kw.protectedNum);
		System.out.println(kw.defaultNum);//다른 패키지에서 접근할수 없다.
//		System.out.println(kw.privateNum); //다른 클래스라서 접근할 수 없다.
	}
}
