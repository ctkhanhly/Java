
public class Question7 {
	public String[] newString(String[] s, int a, int b){
		String[] m = new String[b-a+1];
		for(int i = 0; i< m.length; i++){
			m[i] = s[i+a];
		}
		return m;
	}
//	public int NumberOfX(String[] s, String X){
//		int n = 0;
//		int m = (int)s.length/2;
//		if(s.length==1 ){
//			if(s[0].equals(X)){
//			n=1;
//
//			}
//			else
//				n=0;
//			return n;
//		}
//		else{
//		if(s[m].equals(X)){
//		while(BinarySearch.find(s, X)!=-1){
//			if(BinarySearch.find(s,X) > m){
//				n+= (int)s.length/2;
//				s = newString(s,m +1, s.length);
//				n += NumberOfX(s,X);
//			
//		}
//		}
//	}
//	else{
//		while(BinarySearch.find(s, X)!=-1){
//			if(BinarySearch.find(s,X) > s.length/2){
//				n+= (int)s.length/2;
//				s = newString(s,m +1, s.length);
//				NumberOfX(s,X);
//			
//		}
//		}
//	}
//		}
//			return n;
//	}
//	public static int NumberOfX(String[] s, String X){
//		int start = 0;
//		int end = s.length;
//		int middle = (int) s.length/2;
//		int count = 0;
//		while(start<= end){
//			if(s[middle].equals(X)){
//				count += middle +1;
//				start = middle +1;
//				middle = (int)((end-start)/2)+1;
//			}
//			if(middle==0){
//				count+=1;
//			}
//			else{
//				end = middle;
//				middle = (int)((end-start)/2)+1;
//			}
//		}
//		return count;
//	}
	public static int NumberOfX(String s, String X){
		int start = 0;
		int end = s.length()-1;
		int middle = (int) s.length()/2;
		int count = 0;
		while(start<= end){
			if("s.charAt(middle)".equals(X)){
				count += middle +1;
				start = middle +1;
				middle = (int) s.length()/2;
			}
			if(middle==0){
				count+=1;
			}
			else{
				end = middle-1;
				middle = (int) s.length()/2;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//assuming that number of X = number of O 
		//or number of X = number of O +1
		//String[] s = {"X","X","X","X","X","X","O","O","O","O"};
		String s = "XXXXOOOO";
		String X = "X";
		System.out.println(NumberOfX(s,X));
	}

}
