import java.util.Arrays;

public class Question3 {
	public static void print(Fraction[] a){
		for(Fraction p: a){
			System.out.println(p.getNum() + "/" + p.getDenom());//why toString does not work
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction[] fractions ={
				new Fraction(4,5),
				new Fraction(5,2),
				new Fraction(2,3),
				new Fraction(1,2)
		};
		
		Arrays.sort(fractions);
		print(fractions);
	}

}
