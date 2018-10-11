import java.util.ArrayList;

public class LineList {
private ArrayList<String> words;
	public LineList(){
		words = new ArrayList<String>();
	}
	public int size(){
		return words.size();
	}
	public String get(int k){
		return words.get(k);
	}
	public void add(String line){
		words.add(line);
	}
	public String remove(int k){
		String kthWord = words.get(k);
		words.remove(k);
		return kthWord;
	}
//	public void move(int index, int newIndex){
//		if(index<newIndex){
//			String h = words.get(index);
//			for(int i = index; i <newIndex; i++){
//				words.add(i,words.get(i+1));
//			}
//			words.add(newIndex, h);
//		}
//		else{
//			String h = words.get(index);
//			for(int i = index; i <newIndex; i++){
//				words.add(i,words.get(i-1));
//			}
//			words.add(newIndex, h);
//		}
//	}
	public void move(){
		
	}
}
