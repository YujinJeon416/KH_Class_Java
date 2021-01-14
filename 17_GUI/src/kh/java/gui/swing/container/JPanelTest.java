package kh.java.gui.swing.container;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	
	public JPanelTest() {
		setSize(800,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JFrame의 기본 LayoutManager객체는 BorderLayout이다.
//		setLayout(new BorderLayout());
	     //null layout : layout manager객체를 사용하지 않고 직접 좌표를 지정함
		setLayout(null);
	
		
		//자식컴포넌트 추가
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(140, 52, 235));
		JLabel label1 = new JLabel("panel1");
		panel1.setBounds(100,50,300,400);
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.pink);JLabel label2 = new JLabel("panel2");
		panel2.setBounds(400,50,300,400);
		panel2.add(label2);
		
		
		
		//프레임에 패널 추가
		add(panel1);
		add(panel2);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new JPanelTest();
	}

}
