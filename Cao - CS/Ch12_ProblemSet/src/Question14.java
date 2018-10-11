
public class Question14 {
	//Place and SpecificPlace classes
	public static boolean sameDistance(Place p1, Place p2, Place p3){
		return p1.distance(p2) == p1.distance(p3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public double distance( Place p)
//		counry h = (country)p;
		SpecificPlace p1 = new SpecificPlace(1);
		SpecificPlace p2 = new SpecificPlace(3);
		SpecificPlace p3 = new SpecificPlace(3);
		System.out.println(sameDistance(p1,p2,p3));
	}

}
