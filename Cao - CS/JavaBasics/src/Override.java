import java.io.IOException;
//override - different classes ; overload- same classes; both: same name methods
//StringBuilder( more secure) StringBuffer(faster) : giong nhau
public class Override extends Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Override o = new Override();
		o.show();
	}
	public void show(){//overriden methods have to have type(public, default, protected)
		//of the same level ( protected vs protected) or of bigger level
		//( public vs protected) compared to the superclass's equivalent
	}
		public hihi show1 (){//if want to add throw
			//has to add throw of Exception of same level/subclass level
			//throws Exception(){=> error b/c Exception is superclass 
			//of IOException
		return new hihi();
	}
	}


class hehe{
	
}
class hihi extends hehe{
	
}
//override same type( or the subclass type of that type) same parameter.
class Big{
	protected void show(){
		System.out.println("Show of tutorial 35");
	}
	public hehe show1() throws IOException{//the overriden does not have to 
		//have throws, just match other characteristics of the method
		return new hehe();
	}
}
