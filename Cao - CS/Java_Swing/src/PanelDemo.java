import java.awt.Dimension;
import java.awt.Toolkit;

//* includes everything
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

;//surround all the components you put in
public class PanelDemo extends JFrame{
	public PanelDemo(){
		this.setSize(400, 400);
		//this.setLocationRelativeTo(null);//put the screen in the center 
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		
		int xPos = (dim.width / 2) - (this.getWidth() / 2);
		int yPos = (dim.height / 2) - (this.getHeight()/ 2);
		
		this.setTitle("My frame");
		this.setLocation(xPos, yPos);// => in the center of the screen
		
		JPanel thePanel = new JPanel();
		
		JLabel label1 = new JLabel("Tell me something");
		
		label1.setText("New Text");
		
		label1.setToolTipText("Doesn't do anything");
		thePanel.add(label1);
		
		JButton button1 = new JButton("Send");
		//hide the button border
		button1.setBorderPainted(false);
		//get rid of background for the button
		button1.setContentAreaFilled(false);
		button1.setText("New Button");
		button1.setToolTipText("It's a button");
		
		thePanel.add(button1);
		
		//parameter: what's inside by default, and the size of it(how wide)
		JTextField textField1 = new JTextField("Type here", 15);
		//change size
		textField1.setColumns(10);
		textField1.setText("Type again");
		textField1.setToolTipText("It's a field");
		thePanel.add(textField1);
		
		JTextArea textArea1 = new JTextArea(15,20);
		textArea1.setText("This is Tex tArea");
		//skip to second line at the end of every line
		textArea1.setLineWrap(true);
		textArea1.setWrapStyleWord(true);
		
		int numOfLines = textArea1.getLineCount();
		textArea1.append(" number of lines: " + numOfLines);
		
		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		thePanel.add(scrollbar1);
		
		this.add(thePanel);
		this.setVisible(true);
		//after frame, pane, components created
		textField1.requestFocus();
		
	}
	public void main(String[] args){
		new PanelDemo();
	}
}
