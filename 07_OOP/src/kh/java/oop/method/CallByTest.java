package kh.java.oop.method;
/**
 * 
 * call by value : 값을 전달(기본형)
 * 
 * call by reference : 주소값을 전달 (참조형)
 *
 *
 *
 *기본형 타입 변수와 참조형 타입 변수가 있는데 
둘 다 상관없이 call by value 방식으로 메소드에서 받아진다.

대신 기본형 타입은 그 값을 복사 해서 주지만
참조형 타입은 값의 래퍼런스(주소)가 저장되는 것이므로 
그 값의 래퍼런스가 복사 되어진다
 */
public class CallByTest {

	public static void main(String[] args) {
		
		int a = 10;
		int[] arr = {1, 2, 3, 4, 5};
		
		CallByTest c = new CallByTest();
		c.test1(a);//call by value
		System.out.println(a);

		c.test2(arr); //call by reference
		System.out.println(arr[0]);
		
		String s = "안녕";
		c.test3(s);// call by reference
	     System.out.println(s);//안녕이 출력된다. immutable이라서
	
	     Sample sp = new Sample();
	     sp.num = 99;
	     
	     c.test4(sp);
	     System.out.println(sp.num);
	}
	
	public void test4(Sample s) {
		s.num *= 100;
	}
	public void test3(String str) {
		str = "잘가";
	}
	
	
	public void test2(int[] arr) {
		arr[0] *= 100; 
	}
	
	public void test1(int x) {
//		System.out.println(x);
		x = 20;
	}

}

class Sample {
	int num;
}
