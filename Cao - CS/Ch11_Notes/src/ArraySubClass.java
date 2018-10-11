import java.util.ArrayList;

public class ArraySubClass extends ArrayList<Object> {

	public String toString(){
		String s = "/";;
		String space = " ";
		for(Object o: this){
			s += o + space;
		}
		s = s.substring(0,s.length()-1);
		s += "\\";
		return s;
	}

}
