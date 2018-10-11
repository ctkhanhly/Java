
public class ConstructList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode list = new ListNode();
//		list.data = 42;
//		list.next = new ListNode();
//		list.next.data = -3;
//		list.next.next = new ListNode();
//		list.next.next.data = 17;
//		list.next.next.next = null;
//		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
		ListNode list = new ListNode(42, new ListNode(-3,new ListNode(17)));
		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
		ListNode temp = new ListNode(17,null);
		ListNode temp2 = new ListNode(-3, temp);
		
		list.next.next.next = new ListNode(30,null);//add to the end
		//System.out.println(list.next.next.next.data);
		list = new ListNode(1, list);//add to the beginning
		//taking the memory address and reassign it and make new address
		//ArrayList contains Array
		//add things to array= create new array-> move every value, change memory 
		//time-consuming computation, 
		//LinkNode is more efficient b/c dont have to change entirely every data
		ListNode list1 = new ListNode(10, new ListNode(20));
		ListNode list2 = new ListNode(30, new ListNode(40));
		list1.next.next = list2.next;
		list2.data = list2.next.data;
		list2.next = null;
		
	}

}
