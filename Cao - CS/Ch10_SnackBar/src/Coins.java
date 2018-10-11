
public class Coins {
	private int quarters, nickels, dimes, pennies;
public Coins(int cents){
	quarters = (int) cents/25;
	dimes = (int)(cents-quarters*25)/10;
	nickels = (int) (cents-quarters*25- dimes*10)/5;
	pennies = cents-quarters*25- dimes*10 - nickels*5;
}
public int getQuarters(){
	return quarters;
}
public int getNickels(){
	return nickels;
}
public int getDimes(){
	return dimes;
}
public int getPennies(){
	return pennies;
}
//b in VendingMachine class, added to actionPerformed method, changed line 21\
//line 117, 118, line 103, line 104
}
