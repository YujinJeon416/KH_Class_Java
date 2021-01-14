package kh.java.gui.swing.container.layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import kh.java.gui.util.MyUtil;

public class FlowLayoutTest extends JFrame {

	public FlowLayoutTest(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//JPanel의 기본 LAyout객체
		JPanel panel = new JPanel();
		//정렬기준제시 LEFT, RIGHT, CENTER
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		for(int i = 0; i<15; i++) {
			panel.add(new JButton((i+1) + "번"));
			
		}
		
		add(panel);
		
		
	}

	public static void main(String[] args) {
		new FlowLayoutTest(500,500,"FlowLayoutTest").setVisible(true);
		

	}

}
