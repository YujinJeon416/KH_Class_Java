package kh.java.gui.swing.container;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * JFrame객체 생성
 * 1. new JFrame() 직접 객체 생성하기
 * 
 * 2. JFrame을 상속한 커스텀 클래스 작성 후 객체 생성하기
 * 
 *
 */
public class JFrameTest1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//제목 지정
		f.setTitle("Hello Swing");
		
		//윈도우 크기 위치 지정
		f.setSize(300,200);
//		f.setLocation(500,0);
		
		//스크린 가운데 띄우기
		f.setLocationRelativeTo(null);
		
		//x버튼 ->프로그램 종료처리
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//자식 컴포넌트: 컨테이너에 포함된 컴포넌트
		f.add(new JLabel("안녕"));
		
		//시각화처리(맨 마지막에 작성) 중요!!! 항상마지막에! 
		f.setVisible(true);
	}

}
