
public class Question16 {
public static String[] allSubStrings(String word){
	String[] stringComs = new String[word.length()*(word.length()+1)/2];
	int stringLength =1;
	int i = 0;
	for (stringLength = 1; stringLength<= word.length(); stringLength++){
		for(int m = 0;m+stringLength <= word.length(); m++){
			stringComs[i]= word.substring(m, m+stringLength);
			i++;
		}
	}
	return stringComs;
}
public static void main(String[] args){
	for(int i=0; i< allSubStrings("congratulations").length; i++)
		System.out.println(allSubStrings("congratulations")[i]);
}
}
