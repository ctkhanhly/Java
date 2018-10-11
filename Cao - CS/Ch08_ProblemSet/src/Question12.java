
public class Question12  {
	
public int indexOf(char ch, int fromPos){
//	String m = new String();
//	int n = 0;
//	for (int i = fromPos; ch!=m.charAt(i) && i<= m.length()-1; i++){
//		
//	}
//	return n;
	//just have to call method w/o making object if it's within the class; e.g: length()
	String h = "  ";
	//this is not really good because then this method just works with 1 string ""
	//if this method is within String class, I just have to call length() w/o making any object.
	
	if(fromPos<0)
		return -1;
	for (int i = fromPos; i < h.length(); i++){
		if (ch == h.charAt(i))
			return i;
		return -1;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
