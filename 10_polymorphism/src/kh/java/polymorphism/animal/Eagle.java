package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	@Override
	public void attack() {
		System.out.println("독수리가 공격!");
	}
	
	
	@Override
	public void fly(String sound){
	System.out.println("독수리가 납니다." + sound);
	
}
}
