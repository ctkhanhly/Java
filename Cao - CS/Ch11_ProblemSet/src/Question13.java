import java.util.ArrayList;
import java.util.List;

public class Question13 {
public static ArrayList<ArrayList<String>> buckets(List<String> words){
	String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	//ArrayList<String>[] haha = new ArrayList<String>[10];
	
	ArrayList<ArrayList<String>> buckets = new ArrayList<ArrayList<String>>(26);
	
	//() : capacity not size
	for(int i = 0; i< alphabet.length(); i++){
		buckets.add(new ArrayList<String>());
	}
	for(int i = 0;i< words.size(); i++){
		
			char firstLetter = words.get(i).charAt(0);
			
			int index = alphabet.indexOf(firstLetter); 
			
			
			
			buckets.get(index).add(words.get(i));
			//buckets.add(index,new ArrayList<String>());
			//create new one over if have more than
			//1 element in a bucket of my bucket
			
			
	}
	return buckets;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>> buckets = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> words = new ArrayList<String>();
		String[] word = {"abolish", "haha", "destroy", "biased", "manipulate", "associate",
			"cat", "peculiar", "dog", "cast"};
		for(int i =0; i<word.length; i++){
			words.add(word[i]);
		}
		//buckets.add(words);
		//buckets.get(0).add("haha");
//		System.out.println(buckets);
//		System.out.println(words);
		//buckets(words);
		//buckets = buckets(words);
		
		System.out.println(buckets(words));
		//System.out.println(buckets);
	}

}
