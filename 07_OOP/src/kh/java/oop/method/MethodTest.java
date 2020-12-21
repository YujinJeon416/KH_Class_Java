package kh.java.oop.method;
/**
 * 
 * -static method(클래스 메소드) : 클래스명.메소드명 으로 호출
 *    static 자원(field, method)만 접근 가능
 * -non static method(멤버 메소드, 인스턴스 메소드) : 객체.메소드명 으로 호출
 *    non-static, static자원 모두 접근 가능
 */
public class MethodTest {

	private int num = 100;
	private static int snum = 99;
	
	public static void main(String[] args) {
		MethodTest.a();
		
		MethodTest m = new MethodTest();
		m.b();
		
		
		
		System.out.println(MyUtil.add(100, 7));
		System.out.println(MyUtil.add(80 , 3));
		
//		System.out.println(num);//static메소드라서 에러
	}
	//공유
	public static void a() {
		System.out.println("a!");
//	   System.out.println(num); // static으로 가는 참조를 만들수없다.
	  System.out.println(snum);
//	  b(); //static으로 가는 참조를 만들수없다.
	}
	
	public void b() {
		System.out.println("b!");
		System.out.println(num);
		System.out.println(snum);
		a();
	}
	
	
	
}
