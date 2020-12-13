package com.kh.test;
/*
각 자료형별 변수를 만들고 초기화한 후 그 값을 출력하는 코드를 작성해 보자.

	- 정수형 100, 9999억, 
	- 실수 486.520(float), 567.890123
	- 문자 A
	- 문자열 Hello world, 
	- 논리 true
 
    단, 변수를 이용하여 출력하시오 .

*/
public class Test1 {

	public static void main(String[] args) {
		Test1 t = new Test1();
		t.test1();
		t.test2();
		
	}

    /**
	 * @실습문제 : 형변환
	 * == 비교연산자
	 * != 부정비교연산자
	 */
	public void test2(){
		System.out.println("A = " + ('A' + 0));
		// A=65
		
		System.out.println("0 =" + ('0' + 0) );
		// 0 = 48
		
		System.out.println("(char)65 = " + (char)65);
		// (char)65 = A
		
		byte bt1 = 125;
		char ch1 = 'C';
		int it1 = bt1 - ch1;
		System.out.println("it1 = "+it1);
		//it1 = 58
		
		
		boolean bool = false;
		
		bool = (2.0 == (5 / 2));//자동형변환이 이루어진후 값이 같다면, true 이다.
		System.out.println("bool = " + bool);
		//bool = true
		
		bool = ('C' == 67);//자동형변환이 이루어진후 값이 같다면, true 이다.
		System.out.println("bool = " + bool);
		//bool = true
		
		bool = (9 == 011); //10진수 9 와 8진수 011은 같다.
		//0x123 16진수
		System.out.println("bool = " + bool);
		//bool = true
		
		bool = ('A' == 'B'-1);//65 == 66-1
		System.out.println("bool = " + bool);
		//bool = true
		
		bool = ('a' != 97 );//부정연산자
		System.out.println("bool = " + bool);
		//bool = false
	}

	public void test1() {
		int num1 = 100;
		long num2 = 999_900_000_000L;
		
		float f = 234.567f;
		double d = 567.12345;
		
		char c = 'A';
		String str = "Hello world";
		
		boolean b = true;
		
		System.out.println("num1="+num1); 
		System.out.println("num2="+num2);
		
		System.out.println("f="+f); 
		System.out.println("d="+d); 
		
		System.out.println("c="+c); 
		System.out.println("str="+str); 
		
		System.out.println("b="+b); 
	}

}
