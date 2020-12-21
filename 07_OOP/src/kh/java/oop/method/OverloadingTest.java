package kh.java.oop.method;
/**
 * 
 * method overloading
 * 메소드명은 직관적으로 작성할 것.
 * 보통 동사 (+ 명사)의 형태가 많다.
 * 예 ) setUserName, getUserName, printInfo, add(int,int)등....
 * add(double, double) 같은 기능을 가지면 동일한 이름을 갖도록 하자. 
 *
 *
 * 메소드명은 동일해야한다.
 * 매개변수 선언부는 달라야한다.(타입, 갯수, 순서등)
 * 
 * 매개변수명, 접근제한자, 리턴타입은 상관하지 않는다.
 * 
 */
public class OverloadingTest {
	
	public static void main(String[] args) {
		System.out.println(123);//public void println(int x)
		System.out.println(true);//public void println(boolean b)
		System.out.println('a');//println(char ch)
		System.out.println(123.456);
	}
	
	public void test() {}
	public void test(int i) {}
	public void test(String s) {}
	private void test(String s) {}//접근제한자가 다른것은 오버로딩이 아니다.
	public void test(int i, int j ) {}//매개변수명이 다른것은 오버로딩이 아니다.
	public String test(String s, int i) {}//리턴타입이 다르것은 오버로딩이 아니다.
	public void test(int[][] arr) {}
	
}
