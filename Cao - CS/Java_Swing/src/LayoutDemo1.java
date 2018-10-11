import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutDemo1 extends JFrame{
	
	JButton button1, button2, button3, button4, button5;
	
	public static void main(String[] args) {
		new LayoutDemo1();

	}
	public LayoutDemo1(){

		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Seventh Frame");
		
		/* FLOW LAYOUT */
		//JPanel thePanel = new JPanel();
		//align the layout to the left/right/center
		//every component justified to the left
		//setLayout(): flowlayout is default
		////thePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
		//alignment, horizontal, vertical gap - pixel that separates different components
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		
////		thePanel.add(button1);
////		thePanel.add(button2);
////		
		/* BORDER LAYOUT*/
		//put the panel in north east, or south or center of the fra,e
		//both button in the north - only button2 shows up-> overrides
		
		//thePanel.setLayout(new BorderLayout());
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		
//		thePanel.add(button1, BorderLayout.NORTH);
//		thePanel.add(button2, BorderLayout.SOUTH);
//		thePanel.add(button3, BorderLayout.EAST);
//		thePanel.add(button4, BorderLayout.WEST);
//		thePanel.add(button5, BorderLayout.CENTER);//biggest area
		
		//put 2 north buttons in another panel
		
		//JPanel thePanel2 = new JPanel();
		
		//thePanel2.add(button1);
		//thePanel2.add(button2);
		
		//thePanel.add(thePanel2, BorderLayout.NORTH);

		//this.add(thePanel);
//		this.setVisible(true);
		/* BOX LAYOUT -> avoid panel*/
		//horizontal and vertical rows of component
		//delete all JPanel for this one
		Box theBox = Box.createHorizontalBox();
		theBox.add(button1);
		//separate buttons
		theBox.add(Box.createHorizontalStrut(4));//distance 4 pixels between these components
		theBox.add(button2);
		theBox.add(Box.createHorizontalStrut(4));
		theBox.add(button3);
		//glue: move the component the most it can in the screen, contained
		theBox.add(Box.createHorizontalGlue());
		//theBox.add(button4);
		//horizontal, vertical space apart
		theBox.createRigidArea(new Dimension(30,20));
		
		
		this.add(theBox);
		this.setVisible(true);
	}

}
