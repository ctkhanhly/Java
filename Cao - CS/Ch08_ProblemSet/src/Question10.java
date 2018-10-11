
public class Question10 {
	//enum letters{ a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,s,y,z};
public static String findingComments(String s){
	int m = s.indexOf("/*");
	int n = s.indexOf("*/");
//	if (s.substring(0,2).equals("/*") &&s.substring(s.length()-2, s.length()).equals("*/")){
//		 m = s.substring(0,2);
//		 n = s.substring(s.length()-2, s.length());
//	}
	if (m<n)
		return s.substring(0, m) + s.substring(n+2, s.length());
		return s;
		
		
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findingComments("/*ufhaieh*/ 3489hf"));
//String h = "123";
//System.out.println(h.substring(3)); //does not print b/c not valid
	}

}
