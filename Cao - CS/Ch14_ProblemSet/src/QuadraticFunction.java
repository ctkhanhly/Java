
public class QuadraticFunction {
	private int a;
	private int b;
	private int c;
	public QuadraticFunction(int a, int b, int c){
		this.a = a;
		this.b= b;
		this.c = c;
	}
	public double valueAt(double x){
		return a*x*x + b*x +c;
	}
	public String toString(){
		if(b<0 && c<0)
		return a + "x^2" + b+ "x" + c;
		else if( b>0 && c>0)
			return a + "x^2+" + b+ "x+" + c;
		else if(b>0 &&c<0)
			return  a + "x^2+" + b+ "x" + c;
		else
			return  a + "x^2" + b+ "x+" + c;
	}
	
	public int getA() {
	
		return a;
	}
	public int getB() {
		return b;
	}
	public int getC() {
		return c;
	}
	
	public boolean equals(QuadraticFunction other){
		return this.a == other.a && this.b == other.b && this.c == other.c;
	}
	
	public int compareTo(QuadraticFunction other){
		if(this.a == other.a){
			if(this.b == other.b){
				return this.c- other.c;
			}
			else
				return this.b - other.b;
		}
		else
			return this.a - other.a;
	}
}
