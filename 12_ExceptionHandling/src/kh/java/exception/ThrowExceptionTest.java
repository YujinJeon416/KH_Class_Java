package kh.java.exception;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {
		ThrowExceptionTest t = new ThrowExceptionTest();
//		t.test1();
		t.test2();
		System.out.println("-----정상종료-----");

	}
	/**
	 * 예외를 통한 프로그램 흐름 분기
	 */
	
	public void test2() {
		try {
		checkAgeAndThrowException();
		}catch (Exception e) {
			e.printStackTrace();
			return;
		}
		System.out.println("성인 고스톱 게임을 시작합니다. 후방주의!");
		
	}
	/**
	 * 나이를 입력받고, 
	 * 미성년자인 경우에는 예외를 던지는 메소드
	 */
	public void checkAgeAndThrowException() throws UnderAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if(age < 20)
			throw new UnderAgeException(String.valueOf(age));
		
	}
	/**
	 * 성인 인증 해야 가능한 게임
	 * 1. 성인인증기능
	 * 2. 게임시작
	 */
	public void test1() {
		boolean isAdult = checkAge();
		
		if(!isAdult) {
			System.out.println("성인이 아닙니다. 게임을 종료합니다.");
			return;
		}
		
		System.out.println("성인 고스톱 게임을 시작합니다. 후방주의!");
		
	
	}
	
	public boolean checkAge() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		sc.nextInt();
		
		if(sc.nextInt()<20) 
			return false;
			return true;
		}
		
	}


