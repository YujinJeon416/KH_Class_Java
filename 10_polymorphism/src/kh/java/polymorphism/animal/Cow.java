package kh.java.polymorphism.animal;

public class Cow extends Animal{
	
	
	@Override
	public void attack() {
		voice();
	}
	public void voice() {
		System.out.println("음메~");
	}
}
