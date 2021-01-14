package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame {

	public static CustomPanel[] panels = new CustomPanel[3]; 
		
	public MainFrame(int w, int h, String title) {
	  MyUtil.init(this, w, h, title);
	  
	  //panels 객체 할당
	  panels[0] = new CustomPanel(this, Color.yellow , "pane10");
	  panels[1] = new CustomPanel(this, Color.gray , "pane11");
	  panels[2] = new CustomPanel(this, Color.WHITE , "pane12");
	  
	  
	  add(panels[0]);//시작페이지

	}

}
