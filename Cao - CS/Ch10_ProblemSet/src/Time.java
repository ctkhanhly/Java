import java.text.DecimalFormat;

public class Time {
//FIELDS
	private int hours;
	private int mins;
//CONSTRUCTOR
	public Time(int h, int m){
		if (h>=0 && h<=24 && m>=0 && m<=59){
			hours = h;
			mins = m;
		}
		else if (h>=0 && h<=24 && m>=0 && m==60){
			hours = h+1;
			m=0;
		}
		else
			throw new IllegalArgumentException("Time Construction Exception: Hours can only be from 0 to 24 and minutes can only be from 0 to 59!");
	}
	private int toMins(){
		return hours*60 +mins;
	}
	public boolean lessThan(Time t){
	 if(this.hours == t.hours){
		 return this.mins<t.mins;
	 }
	 else
		 return this.hours < t.hours;
	}
//	public int elapsedSince(Time t){
//		if(t.hours>this.hours || this.hours == t.hours && t.mins>this.mins){
//			return (24 - t.hours)*60 - t.mins + this.hours*60 + this.mins;
//		}
//		else
//			return (this.hours-t.hours)*60 + this.mins - t.mins;
//	}
	public int elapsedSince(Time t){
		if(t.hours>this.hours || this.hours == t.hours && t.mins>this.mins){
			return 24*60 - t.toMins() + this.toMins();
		}
		else
			return this.toMins() - t.toMins();
	}
	public String toString(){
		DecimalFormat h = new DecimalFormat("00");
		return h.format(hours) + ":" + h.format(mins);
	}
}
