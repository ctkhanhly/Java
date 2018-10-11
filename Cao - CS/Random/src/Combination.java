
public class Combination {
	
	public static String[] anagram(String name){

		
		String[] combo = new String[6];
		for(int i = 0; i< 6; i++){
			combo[i] =  name.charAt(0)+ swap(name.substring(1));
			combo[++i] = name;
			name = name.substring(1) + name.charAt(0);
		}
		return combo;
	//new Character(name.charAt(0)).toString()
		
	}
	public static void combo(String name, int k){
		if(k==4){
			System.out.println(name);
			System.out.println(name.charAt(0)+ swap(name.substring(1)));
		}
		else{
		System.out.println(name);
		k++;
		System.out.println(name.charAt(0)+ swap(name.substring(1)));
		k++;
		combo(name.substring(1) + name.charAt(0), k);
		}
	}
	public static String swap(String a){
		char temp = a.charAt(0);
		String h = new Character(a.charAt(1)).toString()+ temp;
		return h;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i = 0; i<6; i++){
//			System.out.println(anagram("heo")[i]);
//		}
//		
		combo("cat", 0);
	

	}

}
