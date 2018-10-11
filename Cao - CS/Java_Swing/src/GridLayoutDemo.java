import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutDemo extends JFrame{

	JButton but1, but2, but3, but4, but5, but6, 
	but7, but8, but9, but0, butPlus, butMinus, 
	clearAll;
	JTextField textResult;
	
	public static void main(String[] args) {
		
		new GridLayoutDemo();
	}
	
	public GridLayoutDemo(){
	
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Calculator");
		
		JPanel thePanel = new JPanel();
		//align evrything on top:
		
		//this.getContentPane().add(thePanel, BorderLayout.NORTH);
		
		
		
		//the number of rows( 0=  use as many rows as needed), 3 columns
		//-> help figure out how many rows, 2 pixels horizontal gap, vertical gap
		//thePanel.setLayout(new GridLayout(0,3,2,2));
		
		thePanel.setLayout(new GridBagLayout());
		
		//do all of these in 1 method
		GridBagConstraints gridConstraints = new GridBagConstraints();
		//define position by default for every component
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 1;
		gridConstraints.gridwidth = 1;//columns - how long
		gridConstraints.gridheight = 1;//rows - how high
		gridConstraints.weightx = 50;//give layout a hint how to adjust components
		//-> everything fixes into place; 0: fixed
		gridConstraints.weighty = 100;
		//handle padding around my component- 5 around all additional components
		gridConstraints.insets = new Insets(5,5,5,5);//top, left, bottom, right
		//where to place a component if they do not fill the space
		gridConstraints.anchor = GridBagConstraints.CENTER;
		//north,east, south, north east, north west etc
		//how a component can be stretched to fill different spaces- width and height
		gridConstraints.fill = GridBagConstraints.BOTH;//None, horizontal, vertical
		
		textResult = new JTextField("0", 20);//default value, length
		
		//change font
		Font font = new Font("Helvetica", Font.PLAIN, 18);//style, PLAIN/BOLD etc, length
		textResult.setFont(font);
		
		
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		butPlus = new JButton("+");
		but0 = new JButton("0");
		butMinus = new JButton("-");
		clearAll = new JButton("C");
		
		//panel and a whole punch of diff panels inside- grid
//		thePanel.add(but1);
//		thePanel.add(but2);
//		thePanel. add(but3);
//		thePanel.add(but4);
//		thePanel.add(but5);
//		thePanel.add(but6);
//		thePanel.add(but7);
//		thePanel.add(but8);
//		thePanel.add(but9);
//		thePanel.add(butPlus);
//		thePanel.add(but0);
//		thePanel.add(butMinus);
		
		/* GridBag*/
		thePanel.add(clearAll, gridConstraints);
		//change grid width to fill i textfield
		gridConstraints.gridwidth = 20;
		//change grid's x position
		gridConstraints.gridx = 5;//upper left hand- moved clearAll over
		thePanel.add(textResult, gridConstraints);
		gridConstraints.gridwidth = 1;
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 2;
		thePanel.add(but1, gridConstraints);
		//change x position every single time to align the buttons
        gridConstraints.gridx = 5;

		thePanel.add(but2, gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but3, gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 3;
		thePanel.add(but4, gridConstraints);
        gridConstraints.gridx = 5;
		thePanel.add(but5, gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but6, gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 4;
		thePanel.add(but7, gridConstraints);
        gridConstraints.gridx = 5;
		thePanel.add(but8, gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(but9, gridConstraints);
		gridConstraints.gridx = 1;
		gridConstraints.gridy = 5;
		thePanel.add(butPlus, gridConstraints);
        gridConstraints.gridx = 5;
		thePanel.add(but0, gridConstraints);
		gridConstraints.gridx = 9;
		thePanel.add(butMinus, gridConstraints);
	
		this.add(thePanel);
		this.setVisible(true);
	}
}
