//Chapter 3 Question 12 (a)

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;// event is not capitalized
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Morning extends JFrame
 					implements ActionListener
 {

  private EasySound Moo, roost;
  private int time; //time : variable, dont need
  private int flag;

  public Morning() // there can only be 1 public Morning
  {
	    super("Morning");
	    roost = new EasySound("roost.wav");
	    Moo = new EasySound("Moo.wav");
	    

	    //Container c = getContentPane();
	    //c.setBackground(Color.WHITE);
	    flag = 1;
	 
    time = 0;
    Timer clock = new Timer(5000, this);// in miliseconds, timer object
    clock.start();// this is method
  }
  public void actionPerformed(ActionEvent e)
  {
	  //System.out.println("Ly Cao");
   // time+=5;
	  //every 5 seconds, play this command
	  
	roost.play();
    Moo.play();
    Container c = getContentPane();
	
	if(flag == 0){
		roost.play();
		c.setBackground(Color.WHITE);
		flag = 1;
	}
	else{
		Moo.play();
		c.setBackground(Color.BLACK);
		flag = 0;
	}
  }

 
  public static void main(String[] args)
  {
    Morning morning = new Morning();
    morning.setSize(300, 150);
    morning.setDefaultCloseOperation(EXIT_ON_CLOSE);
    morning.setVisible(true);

  }
}  
