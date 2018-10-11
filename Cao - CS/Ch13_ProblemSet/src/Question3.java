
public class Question3 {
	//EVAH NUF
	public static String process(String str){
		int n = str.length();
		if(n>=2){
			int n2 = n/2;
			str = process(str.substring(n2)) +
					process(str.substring(0, n2));
		}
		return str;
	}
	public static void main(String[] args){
	System.out.println(process("HAVE")+ " "+ process("FUN"));	
	System.out.println((int)3/2);
	}
}
