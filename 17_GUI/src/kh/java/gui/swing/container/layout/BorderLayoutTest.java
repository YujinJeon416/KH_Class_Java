package kh.java.gui.swing.container.layout;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class BorderLayoutTest extends JFrame{
	
	public BorderLayoutTest(int w, int h, String title) {
		MyUtil.init(this,w,h,title);
		
		JPanel north = new BorderPanel("북", Color.YELLOW);
		JPanel south = new BorderPanel("남", Color.blue);
		JPanel east = new BorderPanel("동", Color.DARK_GRAY);
		JPanel west = new BorderPanel("서", Color.ORANGE);
		JPanel center = new BorderPanel("가운데", Color.white);
		
		//JFrame객체의 기본 Layout은 BorderLayout이다.
		
		add(north,BorderLayout.NORTH);
		add(south,BorderLayout.SOUTH);
		add(east,BorderLayout.EAST);
		add(west,BorderLayout.WEST);
		add(center);
		
	}
	/**
	 * 내부클래스
	 * 외부클래스에서 자유롭게 가져다 사용할 수 있다.
	 * 
	 */
	public class BorderPanel extends JPanel{
		
		public BorderPanel(String title, Color c) {
			setBackground(c);//배경색 지정
			JLabel label = new JLabel(title);
			add(label); //현재 JPanel객체에 추가
			
		}
		
	}

	public static void main(String[] args) {
		new BorderLayoutTest(500,500,"Border LayoutTest").setVisible(true);

	}

}
