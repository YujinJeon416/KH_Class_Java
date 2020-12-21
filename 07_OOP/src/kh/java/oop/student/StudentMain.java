package kh.java.oop.student;

import kh.java.oop.encapsulation.account.Account;

public class StudentMain {

	
	public static void main(String[] args) {
		//학생 클래스를 바탕으로 new연산자를 이용 객체로 생성.
		Student s1 = new Student();
//		s1.name = "홍길동";
//		s1.point = 90;
//		s1.printStudentInfo();
		
		
		
		s1.setName("홍길동");
		s1.setPoint(90);
		s1.printStudentInfo();
//		System.out.println(s1.getName() + ": " + s1.getPoint() + "점" );
		
		
		Student s2 = new Student();
//		s1.name = "신사임당";
//		s1.point = 87;
//		s1.printStudentInfo();
		
		s2.setName("신사임당");
		s2.setPoint(87);
		s2.printStudentInfo();
//		System.out.println(s2.getName() + ": " + s2.getPoint() + "점" );
		
		Speaker speaker1 = new Speaker();
		speaker1.brand = "JBL";
		speaker1.color = "red";
		speaker1.volume = 5;
		speaker1.maxvolume = 10;
		System.out.println(speaker1.info());
		
		Speaker speaker2 = new Speaker();
		speaker2.brand = "하만카돈";
		speaker2.color = "투명";
		speaker2.volume = 50;
		speaker2.maxvolume = 100;
		System.out.println(speaker2.info());
	}
}
