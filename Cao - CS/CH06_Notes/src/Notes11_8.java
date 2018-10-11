
public class Notes11_8 {
//logical operator:
	//and: &&
	//or: ||
	// order: and then or
	
//	public boolean sleepIn(boolean weekday, boolean vacation) {
//		 if (!weekday || vacation)
//		 return true;
//		 else
//		 return false;
	
	public boolean parrotTrouble(boolean talking, int hour) {
		  if ((hour< 7 || hour > 20) && talking)
		  return true;
		  
		}
	//short circuit evacuation &&, ||, = &, |
	//if (a<1 || b<1) // if a<1 true I run, skip test if b<1 true
	//if (a<1 | a<1)// if a<1 true, I still check if b<1 true or not to run anyway :)))
	//if (a<1 && b<1) // if a<1 false, i dont run bc its false anyway
	//if (a<1 & b<!)// if a<1 false, I still check if b<1 true or false and still not run
	//if password = "jellybean" & attempt++<3; will not run anyway but attempt will be incremented.
		
	
	//public boolean nearHundred(int n) {// do we have to define n? no
	  
//	public boolean posNeg(int a, int b, boolean negative) {
//	if (negative) {
//	    return (a < 0 && b < 0);//run this only if this is true
//	  }
//	  else {
//	    return ((a < 0 && b > 0) || (a > 0 && b < 0));
//	  }
}
