
public class Bill implements Money{
	double value;
	public Bill(double value){
		this.value = value;
	}
	public double getAmount(){
		return value;
	}
}
