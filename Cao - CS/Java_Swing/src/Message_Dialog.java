import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * hien thi len man hinh cau ngan gon, thong bao cho ng dung
 * 
 */
public class Message_Dialog extends JFrame {
//or System.out.println()
	
		public Message_Dialog(){
			
		this.setSize(400,250);
		setLocation(500,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Message Dialog");
		add(label);
		JButton button = new JButton("Hit me");
		//add(button, "North", 0); 
		add(button, "North", 1); 
		button.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent e ){
				JOptionPane.showMessageDialog(null, "This is a message dialog", "haha", JOptionPane.QUESTION_MESSAGE);
				//String m = JOptionPane.showInputDialog("Enter an input");
				//JOptionPane.showMessageDialog(null, m);
				
				//icon: information(i), question mark(?)
				//JOptionPane.showMessageDialog(null, "This is a message dialog");
				//parent object, object- message
			}
			});
		}
		public static void main(String[] args){
			Message_Dialog mess = new Message_Dialog();
			mess.setVisible(true);
		}
}
