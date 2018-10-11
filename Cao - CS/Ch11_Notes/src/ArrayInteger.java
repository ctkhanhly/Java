
public class ArrayInteger {
private int[] array;
private int currentIndex;
//empty Constructor
	public ArrayInteger(){
	int[] array = new int[10];
	currentIndex = 0;
}
	//int param - specifies length
	public ArrayInteger(int m){
		int[] array = new int[m];
		currentIndex = 0;
	}
	
	public boolean add(int n){
		if(currentIndex < array.length){
			array[currentIndex] = n;
			currentIndex++;
			return true;
		}
		else{
			int[] temp = array;//does temp has every element of array?
			array = new int[temp.length +10];//*****
			//temp.length but all array now initialized to 0
			for(int i = 0; i<array.length; i++){
				array[i] = temp[i];//copy elements from temp/ ol array to array
			}
			array[currentIndex] = n;//add element n to end of temp
			currentIndex++;
			return false;
		}
	}
	public String toString(){
		String s = "";
		for(int i = 0; i  < currentIndex; i++){
			s+=array[i] + ", ";//concate Strings
		}
		return "[" + s + "]";
	}
}
