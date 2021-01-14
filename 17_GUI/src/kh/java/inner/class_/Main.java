package kh.java.inner.class_;

public class Main {

	public static void main(String[] args) {
		new OuterClass();
		
		OuterClass outer = new OuterClass();
		OuterClass.A a= outer.new A();//멤버 내부클래스
		a.aaa();
		
		OuterClass.B b = new OuterClass.B();//static 내부클래스
		b.bbb();
		
		//지역내부클래스는 외부에서 절개 접근할 수 없다. 
		outer.test();
		

	}

}
