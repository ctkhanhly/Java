import java.util.ArrayList;
import java.util.Vector;
//luu tru cac loai object
//lay phan tu qua index

public class ArrayList_Vector {
//Arraylist va Vector nam trong collection cua Java
	//collection la tap hop cua nhung object khac nhau
	//dung no de truy cap vao theo tuan tu hoac ko?
	public static void main( String[] args){
		ArrayList al = new ArrayList();
		al.add("Ducky");
		al.add(new Integer(6));
		al.add(new Long(10));
		al.size();
		Object[] array = al.toArray();
		if(array.length== al.size());
		
		
		Vector vector = new Vector();
		vector.add("ahhihi");//same as ArrayList
		//difference: like String and StringBuffer
		
		
		//error- get(index) return Object
		al.add(new Am());
		for(int i = 0; i< al.size(); i++){
			//al.get(i).show();//al.get(i) is an object not A -> cannot use show()
			//or we can cast
			if(al.get(i) instanceof Am){
				//al.get(i).show();- error => al is Object
				((Am)al.get(i)).show();
			}
		}
		//Generic: <A>
		ArrayList<Am> a = new ArrayList<Am>();
		ArrayList<Object> o = new ArrayList<Object>();
		o.add(new Am());
		o.add(new Bm());
		for(int i = 0; i< al.size(); i++){
			//al.get(i).show();- same error
		}
		
		
		
		
	}
}
class Am{
	public void show(){
	
	}
}
class Bm{
	public void go(){
	
	}
}
	