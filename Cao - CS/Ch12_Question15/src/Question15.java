import java.util.ArrayList
;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Money> piggyBank = new ArrayList<Money>();
		piggyBank.add(new Quarter());
		piggyBank.add(new Bill(1));
		piggyBank.add(new Nickel());
		piggyBank.add(new Dime());
		piggyBank.add(new Quarter());
		piggyBank.add(new Bill(5));
		System.out.println(piggyBank);
		double amount = 0;
		for(Money item : piggyBank)
			amount += item.getAmount();
		System.out.printf("The piggy bank holds $%.2f\n", amount);
		
	}

}
