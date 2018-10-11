import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Textfield extends JFrame implements ActionListener{
/*
 * dong thong tin ngan, 1 dong
 * getText, setText
 * bat su kien, ban phim- thay doi chu, an nut
 */
	private JTextField tfName;
	private JButton bHit;
	
	public Textfield(){
		this.setSize(400,250);
		setLocation(500,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tfName = new JTextField();
		add(tfName, "North", 0);//***
		bHit = new JButton("Hit me");
		add(bHit, "South", 0);
		bHit.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Textfield text = new Textfield();
			text.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((JButton)e.getSource() == bHit){

			JOptionPane.showMessageDialog(null, tfName.getText());
			//tfName.setText("Study and Share");
		}
	}

}
