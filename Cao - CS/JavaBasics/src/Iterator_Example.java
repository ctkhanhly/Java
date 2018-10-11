import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Example {
//cach duyet cua Java voi cac loai collection
	//implement cho design pattern ten Iterator trong Java
	//Design patter*****
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add("Ducky");
		al.add("Blog");
		al.add("StudyAndShare");
		//duyet thuong dung for hoac dung Iterator
		//duyet phan tu ma ko lien quan den vi tri, cau truc luu tru cua ArrayList
		
		Iterator iterator = al.iterator();//tra ve iterator
		//ko co ham get,add, chi co duyet phan tu thoi
		while(iterator.hasNext()){//tra ve boolean
			System.out.println(iterator.next());//tra ve phan tu cua al
		
		}
		//Generic
		//Iterator<String> iterator = al.iterator();
	}

}
