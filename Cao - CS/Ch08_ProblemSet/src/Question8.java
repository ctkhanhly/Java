
public class Question8 {
public static String negative(String s){
	s = s.replace('1', '2');
	s = s.replace('0', '1');
	s = s.replace('2', '0');
	return s;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(negative("1000010011110"));
	}

}
