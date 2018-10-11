
public class Bookeeper {
private double totalSales;
public void sale(double d){
	totalSales += d;
}
public double getTotalSales(){
	double t = totalSales;
	totalSales = 0;
	return t;
}
}
