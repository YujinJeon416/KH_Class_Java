package kh.java.gui.swing.container;

import javax.swing.JFrame;

public class JFrameTest2 extends JFrame {
	
	public JFrameTest2() {
		setTitle("두번째 프레임");
//		setSize(300,200);
//		setLocation(200,200);
		setBounds(200,200,300,200);
		
		//리사이즈방지
		setResizable(false);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest2();
	}
}
