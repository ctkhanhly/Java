
public class ListNode {
	int data; //public
	ListNode next;
	//next object
	//each list node object stores
	//null does not point anything
	//one piece of integer data
	//a reference to another list node
	
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
	 
	public ListNode(int data, ListNode next){
		this.data = data;
		this.next = next;
	}
	
	
}

