//dimension: easily store diff width and height
//jspinner to use date- editor for jspinner, easily increment thru dates
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SpinnerDemo extends JFrame{

	JButton button1; 
	JSpinner spinner1, spinner2, spinner3, spinner4, rotorI;
	String outputString = "";
	char h;
	
	public static void main(String[] args) {
		
		new SpinnerDemo();
	}

	public SpinnerDemo(){
this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fifth Frame");
		
		JPanel thePanel = new JPanel();
		button1 = new JButton("Get Answer");
		
		ListenForButtons lForButton = new ListenForButtons();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		//default spinner - increment 1->9
		spinner1 = new JSpinner();
		thePanel.add(spinner1);
		
		spinner2 = new JSpinner(new SpinnerNumberModel(1,1,100,1));
		//initial number, min, max, how much it's gonna increment
		//each time s.o hits the button
		thePanel.add(spinner2);
		//create spinner that uses diff default values
		String[] weekDays = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
		spinner3 = new JSpinner(new SpinnerListModel(weekDays));
		spinner3.setValue("Wed");
		
		//change dimension of the spinner until it is big enough
		Dimension d = spinner3.getPreferredSize();
		d.width = 80;
		spinner3.setPreferredSize(d);
		thePanel.add(spinner3);
		
		//how to work with dates
		Date todaysDate = new Date();
		//default date, min, max, increment
		spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));//YEAR, MONTH
		//handle and edit dates based on interraction w user.
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yy");// spinner, how I want to display
		spinner4.setEditor(dateEditor);
		
		thePanel.add(spinner4);
		
//		ListenForSpinner lForSpinner = new ListenForSpinner();
//		spinner4.addChangeListener(lForSpinner);
		
		//only String works bc spinner is comprised of textfield 
		//which takes string? -> harder to convert into a Character
		 String[] alphabet = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		 //Character[] alphabet = {(Character)'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		 //Character[] alphabet = {new Character('a'),new Character('b'),new Character('c'),new Character('d'),new Character('e'),new Character('f'),new Character('g'),new Character('h'),new Character('i'),new Character('j'),new Character('k'),new Character('l'),new Character('m'),new Character('n'),new Character('o'),new Character('p'),new Character('q'),new Character('r'),new Character('s'),new Character('t'),new Character('u'),new Character('v'),new Character('w'),new Character('x'),new Character('y'),new Character('z')};
	      
		 
		 rotorI = new JSpinner(new SpinnerListModel(alphabet));
		 Dimension d1 = rotorI.getPreferredSize();
			d1.width = 30;
			rotorI.setPreferredSize(d);
			ListenForChange lForChange = new ListenForChange();
			rotorI.addChangeListener(lForChange);
	      thePanel.add(rotorI);
	      
	      
		this.add(thePanel);
		this.setVisible(true);

	}
	private class ListenForButtons implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == button1){
				//cannot edit spinner
				outputString += "Spinner 1 value: " + spinner1.getValue() + "\n";
				outputString += "Spinner 2 value: " + spinner2.getValue() + "\n";
				outputString += "Spinner 3 value: " + spinner3.getValue() + "\n";
				outputString += "Spinner 4 value: " + spinner4.getValue() + "\n";
				h = Character.toLowerCase((Character)rotorI.getValue());
				
				JOptionPane.showMessageDialog(SpinnerDemo.this, outputString+ " " + h, "Information", JOptionPane.INFORMATION_MESSAGE);
				outputString = "";
			}
		}
	}
	private class ListenForChange implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			System.out.println(rotorI.getValue());
			
		}
		
	}
	class SpinnerCharacterModel extends SpinnerListModel{
		ArrayList<Character> alphabet = new ArrayList<Character>();
		 private ChangeListener l;
		 int currentIndex;

		public SpinnerCharacterModel(Object[] items){
			super(items);
			for(int i = 0 ; i< items.length; i++){
				alphabet.add((Character)items[i]);
			}
		}
		public Object getNextValue(){
			currentIndex = alphabet.indexOf((Character)getValue());
			 if(l != null) {
		            l.stateChanged(new ChangeEvent(this));
		        }
			return alphabet.get(currentIndex+1);
		}
		public void setValue(Object value){
			if( alphabet.contains((Character)value)){
				 currentIndex = alphabet.indexOf((Character)value);
				fireStateChanged();
			}
		}
		public Object getPreviousValue(){
			currentIndex = alphabet.indexOf((Character)getValue());
			return alphabet.get((currentIndex+26-1)%26);
		}
	}
	private class ListenForSpinner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			if(e.getSource() == spinner1){
				
			}
		}
	}
}
