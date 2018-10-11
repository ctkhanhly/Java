import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;//abstract -> allows to ask question of the OS

import javax.swing.JFrame;
import javax.swing.JLabel;
//can put all those things in a frame but it's bad => want to use a panel

public class Intro_HelloWorld extends JFrame{
	public Intro_HelloWorld(){//ham khoi tao, goi ngay khi khoi tao
		//frame
		
		setSize(200,150);//width, height
		//or this.setSize();
		//this.setLocationRelativeTo(null);//put the screen in the center 
		setVisible(true);//de hien thi cai frame, ko the thieu
		//hoac viet o main
		
		setResizable(false);// ko the thay doi kich thuoc dc nua

		
		/*
		 * day chu vao
		 * account,password,textbox, it khi thay doi text -> setText
		 * hien thi cac anh
		 */
		JLabel label = new JLabel("Hello World");
		// or JPattern, JTextArea, JTextField?=> components of Swing
		//add vao frame, dat label len cai frame
		add(label);
		
		//location- where it appears on the screen
		setLocation(500,300);//y down( from left corner of the frame: 300
		//x to the right( from the left side of the frame): 500
		
		label.setText("Vietnam");//replace with Hello World.
		label.setToolTipText("A beautiful country");//chu thich cai gi do
		//Tool tip method nay co trong tat ca thanh phan cua Swing
		label.setForeground(Color.BLUE);
		//hien thi h/anh dung size h/anh -> set size frame
	}
	
	public static void main(String[] args){
		Intro_HelloWorld hello = new Intro_HelloWorld();
		//hello.setVisible(true);
	}
	
}
