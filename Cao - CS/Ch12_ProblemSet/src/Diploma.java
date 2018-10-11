
public class Diploma {
	private String person;
	private String major;
	public Diploma(String p, String m){
		person = p;
		major = m;
	}
	public String toString(){
		return "This certifies that "+ person+ "\nhas completed a MOOC  in " + major;
	}
}
