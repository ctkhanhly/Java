import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Calendar;
import java.util.Date;

public class JavaLesson30 extends JFrame{
    JLabel nameLabel, streetLabel, stateLabel, dateLabel,
    ageLabel, sexLabel, optionsLabel, aboutLabel;
    JTextField nameText, streetText;
    JComboBox stateList;
    JSpinner dateSpin;
    JSlider ageSlider;
    JRadioButton maleRadio, femaleRadio;
    ButtonGroup sexGroup;
    JCheckBox morningCheck, afterNCheck, eveningCheck;
    JTextArea aboutYou;
    
    public static void main(String[] args){
        new JavaLesson30();
    }
    public JavaLesson30(){
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Random Layout");

        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GridBagLayout());
        nameLabel = new JLabel("  Name:");

        nameLabel = new JLabel("Name: ");
        //EAST = LEFT
        addComp(thePanel, nameLabel, 0,0,1,1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        
        nameText = new JTextField(30);
        //0,0,2,1
        addComp(thePanel, nameText, 1,0,2,1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        streetLabel = new JLabel("  Street:");
        addComp(thePanel, streetLabel, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
        streetText = new JTextField(30);
        addComp(thePanel, streetText, 1, 1, 2, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);

        //put rbutton into a box
        Box sexBox = Box.createVerticalBox();
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(maleRadio);
        sexGroup.add(femaleRadio);
        sexBox.add(maleRadio);
        sexBox.add(femaleRadio);
        //border around radio button
        sexBox.setBorder(BorderFactory.createTitledBorder("Sex"));
        addComp(thePanel, sexBox, 3, 0, 2, 2, GridBagConstraints.WEST, GridBagConstraints.NONE);

        //flow layout: combobox, spinner, slider
        //different layouts inside the gridbag layout
        JPanel statePanel = new JPanel();
        statePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 0));

        //combobox
        stateLabel = new JLabel("State");

        statePanel.add(stateLabel);
        // Create a combo box that will hold the states
        String[] states = {"PA", "NY", "OH", "WV", "NJ"};
        stateList = new JComboBox(states);
        statePanel.add(stateList);
        
        
        //spinner
        dateLabel = new JLabel("Appointment Date");
        statePanel.add(dateLabel);
        // Get todays date
        Date todaysDate = new Date();
        // Create a date spinner & set default to today, no minimum, or max
        // Increment the days on button presses
        // Can also increment YEAR, MONTH, or DAY_OF_MONTH
        dateSpin = new JSpinner(new SpinnerDateModel(todaysDate, null, null,
                Calendar.DAY_OF_MONTH));
        // DateEditor is an editor that handles displaying & editing the dates
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpin, "dd/MM/yy");
        dateSpin.setEditor(dateEditor);
        statePanel.add(dateSpin);

        
        // Creates a slider with a min value of 1 thru 100
        // and an initial value of 1
        ageLabel = new JLabel("Age: 50");
        statePanel.add(ageLabel);
        ageSlider = new JSlider(1, 99, 50);
        ListenForSlider lForSlider = new ListenForSlider();
        ageSlider.addChangeListener(lForSlider);
        statePanel.add(ageSlider);
        
        //set flowlayout and throw onto the screen
        //5 in width - many components
        addComp(thePanel, statePanel, 1, 2, 5, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);

        // Create check boxs and assign them to a group
        JCheckBox morningCheck, afterNCheck, eveningCheck;
        Box optionBox = Box.createVerticalBox();//*****
        morningCheck = new JCheckBox("Morning");
        afterNCheck = new JCheckBox("Afternoon");
        eveningCheck = new JCheckBox("Evening");

        optionBox.add(morningCheck);
        optionBox.add(afterNCheck);
        optionBox.add(eveningCheck);
        optionBox.setBorder(BorderFactory.createTitledBorder("Time of Day"));
        addComp(thePanel, optionBox, 1, 3, 2, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);

        // Create a text area that is 6 columns high and 40 long
        aboutYou = new JTextArea(6, 40);
        aboutYou.setText("Tell us something about you");
        aboutYou.setLineWrap(true);
        aboutYou.setWrapStyleWord(true);
        JScrollPane scrollbar1 = new JScrollPane(aboutYou, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        // Other options: VERTICAL_SCROLLBAR_ALWAYS, VERTICAL_SCROLLBAR_NEVER
        addComp(thePanel, scrollbar1, 2, 3, 3, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);


        this.add(thePanel);
        this.pack();
        this.setVisible(true);
    }
    private class ListenForSlider implements ChangeListener{
    	//called when the spinner is changed
    	public void stateChanged( ChangeEvent e){
    		if(e.getSource() == ageSlider){
    			ageLabel.setText("Age: " + ageSlider.getValue());
    		}
    	}
    }
    private void addComp(JPanel thePanel, JComponent comp, int xPos, int yPos, int compWidth, int compHeight, int place, int stretch){
		GridBagConstraints gridConstraints = new GridBagConstraints();

    	gridConstraints.gridx = xPos;
		gridConstraints.gridy = yPos;
		gridConstraints.gridwidth = compWidth;
		gridConstraints.gridheight = compHeight;
		gridConstraints.weightx = 100;//100 = not much influence
		gridConstraints.weighty = 100;
		gridConstraints.insets = new Insets(5,5,5,5);
		gridConstraints.anchor = place;
		gridConstraints.fill = stretch;
		
		thePanel.add(comp, gridConstraints);
    }

}
