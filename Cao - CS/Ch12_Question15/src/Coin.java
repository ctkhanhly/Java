
public class Coin implements Money{
	double value;
	public Coin(double value){
		this.value = value;
	}
	
	public double getAmount(){
		return value;
	}
}
