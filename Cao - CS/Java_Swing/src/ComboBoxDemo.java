import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ComboBoxDemo extends JFrame{

	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponent = "";
	public static void main(String[] args){
		new ComboBoxDemo();
	}
	public ComboBoxDemo(){
		
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fourth Frame");
		
		JPanel thePanel = new JPanel();
		
		String[] shows = {"Breaking Bad", "Life on Mars", "Doctor Who"};
		
		favoriteShows = new JComboBox(shows);
		
		favoriteShows.addItem("Pushing Daisies");
		
		thePanel.add(favoriteShows);
		
		button1 = new JButton("Get Answer");
		
		ListenForButtons lForButton = new ListenForButtons();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		this.add(thePanel);
		this.setVisible(true);
		
		favoriteShows.insertItemAt("Dexter", 1);//item,index
		//max num of rows
		favoriteShows.setMaximumRowCount(3);
		//remove an item - by value, by index
		favoriteShows.removeItem("Dexter");
		favoriteShows.removeItemAt(1);
	}
	private class ListenForButtons implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				favoriteShows.setEditable(true);
				
				infoOnComponent += "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
				
				//total num of things in the combo box
				
				infoOnComponent += "Num of Shows: " + favoriteShows.getItemCount() + "\n";
				
				//index of whatever item is selected
				infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
				//value of whatever item is selected
				infoOnComponent += "Selected Value: " + favoriteShows.getSelectedItem() + "\n";
				//check if combo box is editable
				infoOnComponent += "Are Editable: " + favoriteShows.isEditable() + "\n";
				
				JOptionPane.showMessageDialog(ComboBoxDemo.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				//reset -> each time I execute this popup, I'll get new information
			}
			
		}
		
	}
}
