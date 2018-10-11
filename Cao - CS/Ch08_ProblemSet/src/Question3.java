
public class Question3 {
public static String removeDashes(String s){
	return s.replace("-", "");//String does not have delete() method.
//	int n = Integer.parseInt(s);//NumberFormatException- b/c string has dashes
//	//which means string is not composed of integers and signs only.
//	return ""+n;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(removeDashes("987-65-8321"));
	}

}
