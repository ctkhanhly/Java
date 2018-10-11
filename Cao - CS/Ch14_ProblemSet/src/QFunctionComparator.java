import java.util.Comparator;


public class QFunctionComparator implements Comparator<QuadraticFunction>{
	private double x;
	public QFunctionComparator(){
		x = 0;
	}
	public QFunctionComparator(double x){
		this.x = x;
	}
	public int compare(QuadraticFunction q1, QuadraticFunction q2){
		if( (q1.valueAt(this.x) - q2.valueAt(this.x))<0)
			return -1;
		else if( (q1.valueAt(this.x) - q2.valueAt(this.x))>0)
			return 1;
		else
			return 0;
	}
}
