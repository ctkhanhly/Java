
public class Complex {
private double a;
private double b;
public Complex(double a){
	this.a = a;
	b = 0.0;
}
public Complex(double a, double b){
	this.a = a;
	this.b = b;
}
//precondition: complex(a,b)
public double abs(){
	return Math.sqrt(this.a*this.a + this.b*this.b);
}
public Complex add(Complex other){
	return new Complex(this.a + other.a, this.b + other.b);
}
public Complex multiply(Complex other){
	return new Complex(this.a*other.a-this.b*other.b, this.a*other.b+other.a*this.b);
}
public Complex multiply(double x){
	return new Complex(this.a*x, this.b*x);
}
public Complex add(double x){
	return new Complex(this.a+x, this.b);
}
public String toString(){
	return a + " + "+ b + "i";
}
}
