import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreeSelectionModel;

//each folder is a node -> root node: contains all other nodes.
public class TreeNodeDemo extends JFrame{

	JButton button1;
	String outputString = "";
	
	//node outside a node: parent node, node inside: children node
	//same level: siblings
	JTree theTree;
	
	//create a diff node or a whole bunch of diff nodes
	DefaultMutableTreeNode documents, work, games, emails;
	
	//create root node
	DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");
	
	public static void main(String[] args) {
		
		new TreeNodeDemo();
	}
	
	public TreeNodeDemo(){
this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fourth Frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		
		ListenForButton lForButton = new ListenForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		theTree = new JTree(fileSystem);//parameter: root node
		//user can select one object in the tree at a time
		theTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
		//only show 8 nodes at a time
		theTree.setVisibleRowCount(8);
		//add items to my tree
		//create a documents here b/c it will become a parent node
		documents = addAFile("Docs", fileSystem);
		//throw regular file in there
		addAFile("Taxes.exl", documents);
		addAFile("Story.exl", documents);
		
		//child node in documents but will hold additional info
		emails = addAFile("Emails", documents);
		addAFile("Schedule.exl", documents);

		addAFile("CallBob.exl", emails);
		
		work = addAFile("Work Application", fileSystem);
		addAFile("Taxes.exl", work);
		addAFile("Story.exl", work);
		
		games = addAFile("Games", fileSystem);
//		addAFile("SpaceInvaders.exe", games);
//		addAFile("PacMan.exe", games);
//		
		//only show 8 at a time -> need JScrollPane
		JScrollPane scrollBox = new JScrollPane(theTree);
		
		Dimension d = scrollBox.getPreferredSize();
		
		d.width = 200;
		
		scrollBox.setPreferredSize(d);
		
		thePanel.add(scrollBox);



		this.add(thePanel);
		this.setVisible(true);
	}
	private class ListenForButton implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1){
				//get whatever node was selected
                // How to get the selected node
                // Returns the last selected node in the tree
				Object treeObject = theTree.getLastSelectedPathComponent();
				//casted into a default mutable tree node( long name for every node)
				DefaultMutableTreeNode theFile = (DefaultMutableTreeNode) treeObject;
				
                // Returns the object stored in this node and casts it to a string
				//cast to a string to shoot it on the screen
				String treeNode = (String) theFile.getUserObject();
				
				outputString += "The Selected Node: " + treeNode + "\n";
				
				outputString += "Number of Children: " + theFile.getChildCount() + "\n";
				
				outputString += "Number of Siblings: " + theFile.getSiblingCount() + "\n";
				
				outputString += "Parent: " + theFile.getParent() + "\n";
				
				outputString += "Next node: " + theFile.getNextNode() + "\n";
				
				outputString += "Preious node: " + theFile.getPreviousNode() + "\n";
				
				outputString += "\nAll Children of the Node\n ";
				
				//children() return enumeration that contains all the children in each enumeration
				//keep pulling these children values out until no children values exist
				for(Enumeration enumValue = theFile.children(); enumValue.hasMoreElements();){
					outputString += enumValue.nextElement() + "\n";
				}
				
				//path
				outputString += "\nPath from Root\n";
				//return an array of tree nodes
				TreeNode[] pathNodes = theFile.getPath();
				//output on the screen
				for(TreeNode indivNodes: pathNodes){
					outputString += indivNodes + "\n";
				}
				JOptionPane.showMessageDialog(TreeNodeDemo.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
	}
	//create file - documents
	private DefaultMutableTreeNode addAFile(String fileName, DefaultMutableTreeNode parentFolder){
		DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
		parentFolder.add(newFile);
		
		return newFile;
	}
}
