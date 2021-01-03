package kh.java.io.byte_.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * byte기반의 표준입출력
 * System.in : 사용자 키보드입력
 * System.out : 콘솔 
 * 
 *
 */
public class SystemIOTest {

	public static void main(String[] args) {
		SystemIOTest s = new SystemIOTest();
//		s.test1();
		s.test2();
		
	}
	
	/**
	 * 2004년 JDK1.5버전이 나오기전
	 * Scanner클래스가 등장전의 사용자 입력값처리는 다음과 같다.
	 */
	public void test2() {
		//보조스크림 : 기본스트림에 연결해서 사용, 보조스트림 여러개를 연결할 수 있다.
		//마지막 연결된 보조스트림으로 입출력 제어 및 자우너 반납을 한다.
		//System.in ->브릿지스트림(보조) ->보조스트림 
		BufferedReader br = 
				new BufferedReader (new InputStreamReader(System.in));
		String data = "";
		
		System.out.println("키보드로 입력하세요 : ");
		try {
			int sum = 0;
			while((data = br.readLine()) != null){
//				System.out.println(data);
				sum += Integer.parseInt(data);
				System.out.println(sum);
			
		}
		}catch (IOException e) {
			e.printStackTrace();
		} finally {
			//자원반납
			//표준입출력을 사용하는 스트림클래스는 반납하면 안된다.
			//한번 닫힌 표준 입출력은 재사용할 수 없다.
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		
	}
	/**
	 * System.in
	 * 
	 * read() : int -> 대상으로 부터 1byte를 읽어와서 int로 리턴하는 메소드
	 * 256가지(0~255) + 1(-1 : 읽어올 값이 없는 경우)
	 * 
	 * 이클립스에서는 ctrl + z 입력하면 -1을 리턴 -> 종료
	 * 
	 */
	public void test1() {
		  
		System.out.println("키보드로 입력값을 주세요 : ");
		int data = 0; //읽어온 값을 처리할 변수
		
		
		try {
		while((data = System.in.read()) != -1){
			System.out.println("input = " + data);
			
		}
		
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("-----실행종료-----");
		}
	   
		
		
	}


