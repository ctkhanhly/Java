import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Confirm_Dialog extends JFrame{

	public Confirm_Dialog(){
		
		this.setSize(400,250);
		setLocation(500,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel("Message Dialog");
		add(label);
		JButton button = new JButton("Hit me");
		add(button, "North", 1);
		button.addActionListener( new ActionListener(){
			
			public void actionPerformed(ActionEvent e ){
				//JOptionPane.showConfirmDialog(null, "Is Ducky handsome");
//			int click = JOptionPane.showConfirmDialog(null, "Is Ducky handsome");
//			if(click == JOptionPane.YES_OPTION){
//				JOptionPane.showMessageDialog(null, "Click Yes");
//			}
//			if(click == JOptionPane.NO_OPTION){
//				JOptionPane.showMessageDialog(null, "Click No");
//			}
//			if(click == JOptionPane.CANCEL_OPTION){
//				JOptionPane.showMessageDialog(null, "Click Cancel");
//			}
//			if(click == JOptionPane.CLOSED_OPTION){
//				JOptionPane.showMessageDialog(null, "Click Closed");
//			}
				int click = JOptionPane.showConfirmDialog(null, "Is Ducky Handsome?", "Question", JOptionPane.YES_NO_CANCEL_OPTION);
			System.out.println(click);//0,1,2
			String[] answer= {"Yes", "No", "Cancel"};
			JOptionPane.showMessageDialog(null, "Click " + answer[click]);
			System.exit(0);
				//parent object, object mess, tittle, command?
			}
			});
		}
	
		public static void main(String[] args){
			Confirm_Dialog mess = new Confirm_Dialog();
			mess.setVisible(true);
		}

}
