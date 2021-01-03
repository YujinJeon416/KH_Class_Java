package kh.java.inherit.shape;

/**
 *Circle has a Point : has a 포함관계(연관관계)
 *Circle ──────────> Point
 *
 *Circle is a Shape  : is a 상속관계(일반화관계)
 *Circle ─────▷Shape 
 *
 *
 */
public class Circle extends Shape {

	private Point center;
	private int r;
	
	public Circle() {
		//아무런 필드 대입이 없다면, 기본값으로 세팅한다.
		this.center = new Point(100,100);
		this.r = 100;
		
	}
	
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	/**
	 * override 상속받은 메소드를 고쳐쓸 수 있다.
	 * 1. 메소드명, 파라미터선언부, 리턴타입 모두 동일해야한다.
	 * 		- @Override annotation
	 * 2. 접근제한자는 더 넣은 범위로 수정이 가능하다.
	 * 		- private(X)-default(x) - protected-public
	 * 		- private메소드는 오버라이드 불가
	 * 		- default메소드는 거의 없음
	 * 3. 메소드가 던지는 예외클래스는 줄이거나, 자식클래스로 변경가능
	 * 
	 */
	
	@Override
	public void draw() {
		System.out.println("중심점이" + center.toString() + "이고," 
				+ "반지름이" + r + "인 원을 그리고 있다. ");
	}
	
}
