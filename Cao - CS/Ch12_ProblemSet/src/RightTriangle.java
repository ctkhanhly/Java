
public class RightTriangle extends Triangle{
	
	public RightTriangle(int side){
		super(side);
	}
	
	public double getPerimeter(){
		return (2 + Math.sqrt(2.0)) *  super.getSide();//side of legs
	}
	public double getArea(){
		return super.getSide() * super.getSide() / 2;
	}
}
