
public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m= "haha";
		System.out.println("<" +m.substring(0, 0)+ ">");//<>
		System.out.println("<" +m.substring(0, 5)+ ">");//StringIndexOutOfBoundException
		System.out.println("<" +m.substring(-1, 2)+ ">");//StringIndexOutOfBoundException
	}

}
