import java.util.Vector;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<C> vector = new Vector<C>();
		vector.add(new C());
		vector.add(new C());
		//ok b/c D is a type of C.
		vector.add(new D());
		
		Vector<D> vector1 = new Vector<D>();
		vector.add(new D());
		vector.add(new D());
		//error - C is not a type of D
		//vector.add(new C());
		
	}

}
class C{
	
}
class D extends C{
	
}
