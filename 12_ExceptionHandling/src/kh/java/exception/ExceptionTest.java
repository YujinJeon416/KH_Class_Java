package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Exception
 * 예외처리를 통해서 정상복구될 수 있는 오류
 * 
 * 1. checked exception : RunTimeException의 후손클래스가 아님, 예외처리 강제화
 * 2. unchecked exception : RunTimeException의 후손클래스 
 * 
 *
 */
public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
//		e.test1();
//		e.test2();
//		e.test3();
//		e.test4();
		try {
		e.test5();
		}catch(IOException e1) {
		
		}
		System.out.println("-----정상종료-----");
	}
	/**
	 * CheckedException
	 * 예외처리 강제화
	 * 1. try~catch
	 * 2. throw절 통해 회피
	 *       - 복수개의 예외를 던지는게 가능하다.
	 *       - 다형성을 적용할 수 있다.
	 * 
	 */
	public void test5() throws FileNotFoundException, IOException {
		//1.try~catch처리
//		try {
//		FileReader fr = new FileReader("test.txt");
//		System.out.println("파일을 찾았습니다.");
//		
//		}catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		//2.throw를 통해 예외회피
		
			FileReader fr = new FileReader("test.txt");
			System.out.println("파일을 찾았습니다.");
			
		
		}
	
	
	/**
	 * 사용자로부터 정수2개를 입력받고, 합을 출력하는 프로그램을 만드세요.
	 * 부정입력이 있다면 처음부터 다시 입력 받으세요. 
	 */
	public void test4() {
		while(true) {
			
			try {
			
			int i, j;
			Scanner	sc = new Scanner(System.in);
			
			System.out.print("더하기 할 첫번째 수를 입력하세요==>");
			i = sc.nextInt();
			System.out.print("더하기 할 두번째 수를 입력하세요==>");
			j = sc.nextInt();
			int sum;
			sum = i + j;
			System.out.print( i + "와" + j +"을 더하면" + sum + "입니다");

			
			
			break;
			
		} catch(Exception e) {
		System.out.println("올바른 정수를 입력하세요.");
			
		}
	}
}
	
	
	/**
	 * 사용자의 입력에 대해 예외 처리하기
	 * 
	 */
	public void test3() {
		
		while(true) {
			
			Scanner sc = new Scanner(System.in);
		try {
		
		System.out.println("정수 :");
		System.out.println(sc.nextInt()); // java.util.InputMismatchException
	
		// 정상입력한경우
		break;
		
		} catch(Exception e) {
		System.out.println("올바른 정수를 입력하세요.");
		sc.next(); //사용자의 잘못된 입력값이 남겨진 버퍼값 비우기
		continue;
	}
		
	}
	}
	
	/**
	 * 처리순서
	 * 
	 * finally절 : try절에서 예외가 던져지든 아니든 무조건실행되는 코드
	 * 			  자원반납 등의 목적으로 사용.
	 *           조기리턴시에도 실행됨.
	 */
	public void test2() {
		System.out.println(1);
		try {
			System.out.println(2);
			
			if(true)
				return;
			
			int[] arr = new int[3];
			System.out.println(arr[3]);
			//java.lang.ArrayIndexOutOfBoundsException:
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(4);
		}finally {
		System.out.println(5);
	    }
		System.out.println(6);
		}
	/**
	 * try절
	 * catch절
	 *   - 여러개의 예외클래스를 처리할 수 있도록 catch절을 여러개 작성할 수 있다.
	 *   - 부모 예외클래스 타입의 catch절로 통합해서 처리할 수도 있다. (다형성)
	 *   - 여러개의 예외클래스 타입의 catch절을 사용하는 경우 자식-부모타입 순으로 작성한다.
	 */
	public void test1() {
		

		//예외처리
		try {
			//예외가 발생할 수 있는 코드
			String s = null;
			System.out.println(s.length()); // java.lang.NullPointerException
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("정수입력 : ");
			int num = sc.nextInt(); // java.util.InputMismatchException
		
			System.out.println(num / 0); //수를 0으로 나눌 수 없다.
			// java.lang.ArithmeticException: / by zero
			
			
//		} catch(InputMismatchException e){
//			//해당 예외가 발생했을 경우 처리코드
//			System.out.println("정확한 값을 입력해주세요.");
//			
//		}catch(ArithmeticException e) {
//			System.out.println("수를 0으로 나눌 수 없습니다.");
//		
//		}catch(NullPointerException e) {
//			System.out.println("NPE 발생!");
//			
////			System.out.println(e);
//			e.printStackTrace(); //예외가 발생했을때의 콜스택의 상황
//		}
			//catch절에도 
	}catch(RuntimeException e) {
		e.printStackTrace();}
	}

}
