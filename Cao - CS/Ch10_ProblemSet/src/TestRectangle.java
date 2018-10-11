
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Rectangle r1 = new Rectangle(-1,2);
Rectangle r2  = new Rectangle(3,4);
Rectangle r3= new Rectangle (r2);
Rectangle r4 = new Rectangle();
Rectangle r5 = new Rectangle (5,5);
System.out.println(r5.isSquare());
System.out.println(r2.isSquare());
r2.quadratize();
System.out.println(r2.getWidth() + " "+r2.getHeight());
//System.out.println(r1);
	}

}
