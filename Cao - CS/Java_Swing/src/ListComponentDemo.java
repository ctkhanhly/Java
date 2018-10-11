import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ListComponentDemo extends JFrame{
	
	JButton button1;
	String infoOnComponent = "";
	JList favoriteMovies, favoriteColors;
	//list will be editable, default of list does not allow u to change
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;
	
	public static void main(String[] args) {
		new ListComponentDemo();

	}
	public ListComponentDemo(){
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Third Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		String[] movies = { "Matrix", "Minority Report", "Big"};
		
		favoriteMovies = new JList(movies);
		favoriteMovies.setFixedCellHeight(30);
		favoriteMovies.setFixedCellWidth(150);
		//ppl to have option to select as many as they want in the list
		//as long as they are in order- select 1 &2 but cannot 1&3
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		//MULTIPLE_INTERVAL_SELECTION- however many, whatever order
		// SINGLE_SELECTION: Select only one

		// All the methods for lists
		
		        /*
		064
		         * getSelectedIndex(): returns the index for the first selected item
		065
		         * getSelectedIndexes(): returns every selection in a list
		066
		         * getSelectedValue(): returns the value of the first selected
		067
		         * getSelectedValues(): returns an array of all values
		068
		         * isSelectedIndex(): returns true if index is selected
		069
		         */

		         
		   // You can't change items in a list unless you store the item
		   // in a DefaultListModel

	 String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray", "Pink"};
	//load into default
	 for(String color: colors){
		 defListModel.addElement(color);
	 }
	 //find/add additional item into index 2
	 defListModel.add(2, "Purple");
	 
	 favoriteColors = new JList(defListModel);
	 //only show 1st 4 items in the list
	 favoriteColors.setVisibleRowCount(4);
	 scroller = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	 //define size for our cell
	 favoriteColors.setFixedCellHeight(30);
     favoriteColors.setFixedCellWidth(150);
   
	 //if you use scroller -> dont add( list), but add list inside the scroller
     // You add the scroll bar container, not the list

     thePanel.add(scroller);

     thePanel.add(favoriteMovies);
     this.add(thePanel);
	this.setVisible(true);
	}
	private class ListenForButton implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				//check if black is in the list
				if(defListModel.contains("Black"))infoOnComponent += "Black is Here\n";
				if(defListModel.isEmpty())infoOnComponent += "Isnt empty\n";
				infoOnComponent += "Elements in the List" + defListModel.size() + "\n";
				infoOnComponent += "Last element " + defListModel.lastElement() + "\n";
				infoOnComponent += "First element " + defListModel.firstElement() + "\n";
				infoOnComponent += "In index 1 " + defListModel.get(1) + "\n";
				//cant remove like this w regular list
				defListModel.remove(0);
				defListModel.removeElement("Big");
				//array filled with these diff list elements
				Object[] arrayOfList = defListModel.toArray();
				for(Object color: arrayOfList){
					infoOnComponent += color + "\n";
				}
				JOptionPane.showMessageDialog(ListComponentDemo.this, infoOnComponent, "Information",JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

}
