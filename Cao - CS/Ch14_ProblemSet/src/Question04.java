import java.lang.reflect.Array;
import java.util.Arrays;

public class Question04 {
	public static void print(QuadraticFunction[] a){
		for(QuadraticFunction p: a){
			System.out.println(p.getA() + "x^2+" + p.getB()+ "x+" + p.getC());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticFunction[] quadraticFunctions ={
				new QuadraticFunction(1,2,3),
				new QuadraticFunction(0,-1,1),
				new QuadraticFunction(-1,2,5),
				new QuadraticFunction(3,-2,1),
		};
		Arrays.sort(quadraticFunctions, new QFunctionComparator(0));
		print(quadraticFunctions);
		
	}

}
