
public class DiplomaWithHonors extends Diploma{
	
	public DiplomaWithHonors(String p, String m){
		super(p,m);
	}
	public String toString(){
		return super.toString() + "\n*** with honors ***";
	}
}
