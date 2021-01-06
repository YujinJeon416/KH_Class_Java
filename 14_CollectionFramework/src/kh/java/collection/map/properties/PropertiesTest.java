package kh.java.collection.map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Properties 
 * HashTable을 상속한 map의 예전 클래스
 * key,value 타입을 String, String으로 제한한 map 
 * 설정정보를 표현하는데 최적화
 * 파일 입출력메소드를 지원
 *
 */
public class PropertiesTest {

	public static void main(String[] args) {
		PropertiesTest p = new PropertiesTest();
		p.test1();
		p.test2();
	}

	/**
	 * 입력
	 */
	private void test2() {
		Properties prop = new Properties();
		
		try {
//			prop.load(new FileReader("userInfo.properties"));
			prop.loadFromXML(new FileInputStream("userInfo.xml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		System.out.println(prop);
		//1. 요소 가져오기
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		
	     System.out.println(url);
	     System.out.println(username);
	     System.out.println(password);
	     
	     
	     //2. 전체열람메소드 
	     //Enumeration 타입
	     Enumeration<?> en = prop.propertyNames(); //name(key)모음
			while(en.hasMoreElements()) {
				String name = (String)en.nextElement();
		//		System.out.println(name);
				String value = prop.getProperty(name);
				System.out.println(name + " = " + value);
			}
	     
	     System.out.println("username = " + username);
		System.out.println("password = " + password);
		System.out.println("url = " + url);
		
	}

	
/**
 * 출력
 */
	public void test1() {
		Properties prop = new Properties();
		prop.setProperty("url", "http://localhost:9090/kh-java");
		prop.setProperty("username", "honggd");
		prop.setProperty("password", "1234!@#$");
		
		System.out.println(prop);
		
		//파일에 저장
		//.properties
		//.xml
		try {
//			prop.store(new FileWriter("userInfo.properties"), "userInfo.properties");
			
			//xml : 사용자 정의태그 파일(형식)
			prop.storeToXML(new FileOutputStream("userInfo.xml"), "userInfo.xml");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("prop 저장완료!");
	}
	
		
	}

