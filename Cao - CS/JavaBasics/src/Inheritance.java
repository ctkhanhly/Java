
public class Inheritance {

}

interface Document{
	void show();//assumed that its public
}
interface ReferenceDoc extends Document{
	
}
class Book implements Document{
	public void show(){
		
	}
}
class Paper implements Document{
public void show(){
		
	}
}
//a can implement many interfaces but can only extends 1
class ReferenceBook extends Book implements Document, ReferenceDoc{
	
}//inherited show() from Book, does not have to declare.
//if inherited 2 classes, e.g: Paper and Book, both have show()=> conflict
// dont know which to choose from
