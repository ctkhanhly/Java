import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Calculator_22_23 extends JFrame{
	
	JButton button1;
	JLabel label1, label2, label3;
	JTextField textField1, textField2;
	JCheckBox dollarSign, commaSeparator;
	JRadioButton addNums, subtractNums, multNums, divideNums;
	JSlider howManyTimes;
	
	double number1, number2, totalCalc;
	
	public static void main(String[] args){
		new Calculator_22_23();
	}
	public Calculator_22_23(){
		
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Third Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Calculate");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		label1 = new JLabel("Number 1");
		thePanel.add(label1);
		//"" : I dont want any default text in my tf
		textField1 = new JTextField("", 5);//5 characters in length
		thePanel.add(textField1);
		
		label2 = new JLabel("Number 2");
		thePanel.add(label2);
		textField2 = new JTextField("", 5);
		thePanel.add(textField2);
		
		//checkbox- whether shows up as currency/ commaSeparator
		dollarSign = new JCheckBox("Dollar");
		commaSeparator = new JCheckBox("Commas");
		
		thePanel.add(dollarSign);
		thePanel.add(commaSeparator, true);//true: check by default
		
		//only rbutton selected
		addNums = new JRadioButton("Add");
		subtractNums = new JRadioButton("Subtract");
		multNums = new JRadioButton("Multiply");
		divideNums = new JRadioButton("Divide");
		
		//add all them to a group so whenever 1 of them is selected
		//the other one of them is deselected
		ButtonGroup operation = new ButtonGroup();
		
		operation.add(addNums);
		operation.add(subtractNums);
		operation.add(multNums);
		operation.add(divideNums);
		
		//add this group to a panel that lies on top of the frame
		//-> need to add another panel: to put a border around all these guys
		JPanel operPanel = new JPanel();
		
		//surround all these with a border
		Border operBorder = BorderFactory.createTitledBorder("Operation");
		operPanel.setBorder(operBorder);
		
		//cannot add group to panel, has to add each rbutton at a time
		operPanel.add(addNums);
		operPanel.add(subtractNums);
		operPanel.add(multNums);
		operPanel.add(divideNums);
		
		//select one of these guys by default
		addNums.setSelected(true);
		thePanel.add(operPanel);
		
		label3 = new JLabel("Perform How Many TImes");//show what this slider does
		thePanel.add(label3);
		howManyTimes = new JSlider(0,99,1);//,min, max, initial value
		//put little tick every 1 space
		howManyTimes.setMinorTickSpacing(1);
		howManyTimes.setMajorTickSpacing(10);
		//draw the ticks on the string
		howManyTimes.setPaintTicks(true);
		//number display
		howManyTimes.setPaintLabels(true);
		ListenForSlider lForSlider = new ListenForSlider();
		//alert me everysingle time the slider is changed
		howManyTimes.addChangeListener(lForSlider);
		thePanel.add(howManyTimes);
		this.add(thePanel);
		this.setVisible(true);
		textField1.requestFocus();
	}
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			//make sure that the button is the actual action that 
			//we are dealing with here
			if(e.getSource() == button1){
				try{
					number1 = Double.parseDouble(textField1.getText());
					number2 = Double.parseDouble(textField1.getText());
				}
				//protect if s.o throw a letter in -> cannot be converted into a number
				catch(NumberFormatException excep){
					//show error message
					JOptionPane.showMessageDialog(Calculator_22_23.this, "Please Enter the Right Infor", "Error", JOptionPane.ERROR_MESSAGE);
					//what frame this is gonna be tied to, info, title for the popup window, what type of icon
					//icons: WARNING_MESSAGE, QUESTION_MESSAGE, PLAIN_MESSAGE
					System.exit(0);
				}
				if(addNums.isSelected()){
					totalCalc = addNumbers(number1, number2, howManyTimes.getValue());
				}
				else if(subtractNums.isSelected()){
					totalCalc = subtractNumbers(number1, number2, howManyTimes.getValue());
				}
				else if(multNums.isSelected()){
					totalCalc = multiplyNumbers(number1, number2, howManyTimes.getValue());
				}
				else{//isSelected
					totalCalc = divideNumbers(number1, number2, howManyTimes.getValue());
				}
				//if none is selected
				if(dollarSign.isSelected()){
					NumberFormat numFormat = NumberFormat.getCurrencyInstance();//get dollar sign and commas and all that stuff
					JOptionPane.showMessageDialog(Calculator_22_23.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(commaSeparator.isSelected()){
					NumberFormat numFormat = NumberFormat.getNumberInstance();//get comma but not dollar or any other signs
					JOptionPane.showMessageDialog(Calculator_22_23.this, numFormat.format(totalCalc), "Solution", JOptionPane.INFORMATION_MESSAGE);
				}//otherwise just print out the plain number with no format
				else{
					JOptionPane.showMessageDialog(Calculator_22_23.this, totalCalc, "Solution", JOptionPane.INFORMATION_MESSAGE);
				}
			}
			
		}
	}
		private class ListenForSlider implements ChangeListener{

			public void stateChanged(ChangeEvent e) {
				if(e.getSource() == howManyTimes){
					label3.setText("Perform How Many Times? " + howManyTimes.getValue());
				}
				
			}
			
		}
		
	
	public static double addNumbers(double number1, double number2, int howManyTimes){
		double total = 0;
		int i = 1;
		while(i<= howManyTimes){
			total += (number1 + number2);
			i++;
		}
		return total;
	}
	public static double subtractNumbers(double number1, double number2, int howManyTimes){
		double total = 0;
		int i = 1;
		while(i<= howManyTimes){
			total = total + (number1 - number2);
			i++;
		}
		return total;
	}
	public static double multiplyNumbers(double number1, double number2, int howManyTimes){
		double total = 0;
		int i = 1;
		while(i<= howManyTimes){
			total = total + (number1 * number2);
			i++;
		}
		return total;
	}
	public static double divideNumbers(double number1, double number2, int howManyTimes){
		double total = 0;
		int i = 1;
		while(i<= howManyTimes){
			total = total + (number1 / number2);
			i++;
		}
		return total;
	}
}
