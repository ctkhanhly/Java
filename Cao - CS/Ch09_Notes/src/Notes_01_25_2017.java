
public class Notes_01_25_2017 {
public static void print(String[] a){
	for(int i =0; i<a.length; i++){
		if(a[i] != null)//= a[i].equals(null)
			System.out.println(a[i]);
	}
}
public static int insert(String[] a, String word, int i, int m){
	if(i<m){
	a[i] = word;
	i++;
	}
	return i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		int max = 50;
		String[] dictionary = new String[max];
		
		if(index<max){
		dictionary[index] = "apple";
		index++;
		}
		if(index<max){
		dictionary[index] = "around";
		index++;
		}
		if(index<max){
		dictionary[index]= "bubbles";//if length =2, -> this line index++ the third time will
		//produce error
		index++;
		}
		
		//print(dictionary);
		
		index= insert(dictionary, "cat",index, max);
		index= insert(dictionary, "cheese",index, max);
		print(dictionary);//add cat, changed by method
		//array is object
		
//		int num =3;
//		add(num);
//		System.out.println(num);//num=3
		
		int insertionPoint =3;
		for(int i = index; i> insertionPoint; i--){
			dictionary[i]= dictionary[i-1];
		}
	}

}
