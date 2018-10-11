package Game;

import javax.swing.JFrame;
import java.awt.Dimension;

public class MainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Snake");
		frame.setContentPane(new GamePanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);//true-> can resize basically :)))
		frame.pack();
		frame.setPreferredSize(new Dimension(GamePanel.WIDTH, GamePanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);//false: u cannot see
	}

}
