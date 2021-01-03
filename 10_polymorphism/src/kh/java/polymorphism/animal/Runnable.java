package kh.java.polymorphism.animal;
/**
 * 
 * 컴파일된 결과는 Runnable.class로 클래스와 동일하다.
 *
 */
public interface Runnable {

	
	//상수 public static final이 자동추가
	 int LEGS = 4; //앞에 자동추가되어있는것
	
	//추상메소드 public abstract가 자동추가
	 void run(); 
}
