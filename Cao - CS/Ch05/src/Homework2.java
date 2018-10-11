public class Homework2 {
	//23
	public int convertToHumanAge(int dogYears)
	{
		return 13 + (dogYears-1)*16;
		//return 13*(
	}
	public static void main(String[] args)
	{
		//16
		int firstDayOfMonth = 3;//0 - 6: Sunday->Saturday
		int day = 13;//1-31
		
		int dayofWeek = ((day%7) + (firstDayOfMonth)%7)%7;	//day -1 + firstdayof Month
		System.out.println(dayofWeek);
		
		
		//20
		int curHour = 3, curMin = 20, depHour = 5, depMin = 30;
		int waitingTime = (depHour*60 + depMin - curHour*60 - curMin);
		System.out.println(waitingTime/60 + " hours and " + waitingTime%60 + " minutes");
		
		//13
//		int a=1, b=2, c=1;
//		double 
	}

}
