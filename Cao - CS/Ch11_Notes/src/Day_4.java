import java.util.ArrayList;

public class Day_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> loop = new ArrayList<Integer>();
				//remove, all elements shift forward
		String like = "And I was like like and she was like and I was like and he was like";
		String[] likeWords = like.split(" "); // into this element, each sentence split up as a space
		//***** split method
		System.out.println(likeWords.length);
		
		
		ArrayList<String> sentence = new ArrayList<String>();
		
		//have to add to each element, the only way
		for(int x = 0; x < likeWords.length; x++){
			sentence.add(likeWords[x]);
			//add method returns true
		}
		System.out.println(sentence);
		//2 likes in a row, skip 1
		
		//remove decrease size + indices->>>> be careful!
		for(int i = 0; i < sentence.size();){//****** not need to increment inside for loop
		if(sentence.get(i).equals("like"))
			sentence.remove(i);
		//i--; //stay at the same index value
		else
			i++;
		}
		for(int x =1; x <11; x++)
			loop.add(x);
		System.out.println(loop);
		loop.remove(1);//index or number 1
		//remove an integer object, has to create an integer object
		//remove number 7
		loop.remove(3);
		loop.remove(5);
		System.out.println(loop);
		Integer x = 7;
		loop.remove(x); //object not this number
		//if x is int data type, remove take x as an index
		System.out.println(loop);
		
//		//Version 1
//		String[] names = {"Alice", "Bob", "Claire"};
//		public ArrayList<Person> makeGuestList(String[] names){
//			ArrayList<Person> list = new ArrayList<Person>();
//			for(int i =0; i <name.length; i++)
//				list.add(newPerson(names[i]);
//				return list;//toString list = [ Alice, Bob, Claire]
//				//every element of list points to new person object
//		}
//		Version 2
//		public ArrayList<Person> makeGuestList(String[] names){
//			ArrayList<Person> list = new ArrayList<Person>();
//			Person p = new Person();
//			for(int i = 0; i < names.length; i++){
//				p.setName(names[i]);//every round this code changes the name of
//				//person's object to be element i of name array
//				//thus, at the end of the code, name of person's object is set to be 
//				//that of last element of name array
//				list.add(p);
//			}
//			return list;
//			//every element of list points to the same object person
//			//list = [Claire, Claire, Claire]
//		}
//			}
		
	}

}
