
public class Cylinder extends Circle 
{
	//FIELDS
	//Circle base = new Circle();// field?
	//fields
	private double height;
	//private Circle base;
	
	//CONSTRUCTOR

	public Cylinder(int r, double h)
	{
		//base = new Circle (r);
		super(r);// need r so need add r
		height = h;
	}
	
	//methods
	public double getHeight()
	{
		return height;
	}
//	public double getVolume(int r, double h){
//		return Cylinder.getArea()*height;// what is before the dot
//	}
	
	public double getArea(){
		return super.getArea()*2+ Math.PI*2*super.getRadius()*height;
	}
}
//merits of this design option: can have another field in subclass without interfering with the superclass
//can use code already had in superclass
