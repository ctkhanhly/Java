
public class Question2 {
public static boolean twoA (String n){
	String str = new String();//cannot make static to a nonstatic
	if (n.length()!=0 && n.lastIndexOf('*')!=-1)//!n.equals(str)
		return true;
	else
		return false;
}
public static boolean twoB (String n){
	Character m = new Character('h');
	if(n.length()>=2 && n.substring(n.length()-2) =="**" )//wrong:1.CharAt(1))!=-1
		return true;
	else
		return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(twoA("lala*"));
System.out.println(twoB("lala*"));
	}

}
