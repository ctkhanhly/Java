import java.util.Comparator;

public class IdComparator implements Comparator<Employee>{
//	public IdComparator(){
//		
//	}
	//Array.sort( object, comparator)
	//Array.sort(comparator)
	public int compare(Employee e1, Employee e2){//different classes
		if( e1.getId() == e2.getId()){
			return e1.getAge() - e2.getAge();
		}
		else
			return e1.getId() - e2.getId();
	}
	//just 1 compare method each class
}
