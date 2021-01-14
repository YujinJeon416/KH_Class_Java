package kh.java.inner.class_;

/**
 * 내부클래스
 * 1. static 내부클래스
 * 2. non-static 내부클래스
 * 3. 지역 내부클래스
 * 
 * 
 * 목적
 * -외부클래스 안에서만 사용할때.
 * -외부클래스의 자원(private자원)에 쉽게 접근하기 위해.
 * 
 * 
 *
 */
public class OuterClass {

	private int num = 100;
	private static int snum = 99;
	
	public OuterClass() {
		new A().aaa();
		
		new B().bbb();
		
		test();
	}
	
	public class A{
		public void aaa() {
			System.out.println(num);
			System.out.println(snum);
		}
	}
	public static class B{
		public void bbb() {
//			System.out.println(num); //non-static 자원 접근 불가
			System.out.println(snum);
		}
	}	
	/**
	 * 지역내부클래스는 지역변수와 마찬가지로 
	 * 접근제한자를 가질 수 없다.
	 */
	public void test() {
		class C {
			public void ccc() {
				System.out.println(num);
				System.out.println(snum);
				
			}
		}
		C c = new C();
		c.ccc();
	} 
	public static void main(String[] args) {
		
		new OuterClass();
		
		

	}

	
	}


