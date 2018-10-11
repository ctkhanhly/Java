
public class TestComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Complex c1 = new Complex(1,3);
Complex c2 = new Complex(3,5);
Complex c3 = new Complex(1,2.0);
System.out.println(c3);

System.out.println(c1.abs());
System.out.println(Math.sqrt(1+9));
System.out.println(Math.sqrt(25+9));
System.out.println(c2.abs());

System.out.println(c1.add(c2));
System.out.println(c1.add(1));
System.out.println(c1.multiply(c2));
System.out.println(c1.multiply(5));

System.out.println(c1);
System.out.println(c2);
	}

}
