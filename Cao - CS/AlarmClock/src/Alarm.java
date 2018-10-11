import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Alarm extends JFrame implements ActionListener{

	private Calendar calendar;
	private int hour;
	private int minute;
	private int day;
	
	private EasySound Moo;
	
	private JSpinner dayValue;
	private JSpinner hourValue;
	private JSpinner minuteValue;
	int flag = 0;

	private final String[] weekDays = {"Sun","Mon", "Tues", "Wed", "Thurs", "Fri", "Saturday"};
	ArrayList<String> weekDaysAL = new ArrayList<String>(Arrays.asList(weekDays));

	
	
	public Alarm(){
		this.setSize(400,400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("Wake up with me!");
		
		
		JPanel thePanel = new JPanel();
		thePanel.setBackground(Color.GREEN);
		
		hourValue = new JSpinner(new SpinnerNumberModel(0,0,23,1));
		minuteValue = new JSpinner(new SpinnerNumberModel(0,0,59,1));
		
		
		dayValue = new JSpinner(new SpinnerListModel(weekDays));
		
		ListenForSpinner lForSpinner = new ListenForSpinner();
		dayValue.addChangeListener(lForSpinner);
		hourValue.addChangeListener(lForSpinner);
		minuteValue.addChangeListener(lForSpinner);
		
//		JSpinner date = new JSpinner();
//		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(date, "dd/MM/yy");// spinner, how I want to display
//		date.setEditor(dateEditor);
		
		JLabel labelDay = new JLabel("Day of Week");
		JLabel labelHour = new JLabel("Hour");
		JLabel labelMinute = new JLabel("Minute");
		
		this.add(thePanel);
		thePanel.add(labelDay);
		thePanel.add(dayValue);
		thePanel.add(labelHour);
		thePanel.add(hourValue);
		thePanel.add(labelMinute);
		thePanel.add(minuteValue);
		this.setVisible(true);
		
		Moo = new EasySound("Moo.wav");
		day = 2;//Monday
		hour = 0;
		minute = 0;
	}
	private class ListenForSpinner implements ChangeListener{


		@Override
		public void stateChanged(ChangeEvent e) {
			if(e.getSource() == dayValue){
				day = weekDaysAL.indexOf(dayValue.getValue()) + 1;
				System.out.println(weekDaysAL.get(day-1));
				Moo.play();
			}
			if(e.getSource() == hourValue){
				hour = (int)hourValue.getValue();
				System.out.println("Hour: " + hour);
			}
			if(e.getSource() == minuteValue){
				minute = (int) minuteValue.getValue();
				System.out.println("Minutes: " + minute);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new Alarm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(calendar.DAY_OF_WEEK == day && calendar.HOUR_OF_DAY == hour && calendar.MINUTE == minute){
		//if(flag == 0){
		Moo.play();
		}
		
	}

}
