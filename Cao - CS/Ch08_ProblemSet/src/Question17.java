
public class Question17 {
	
private String validFileName(String fileName){
	String extension = ".TXT";
	int n=0;
	int sum = 0;
	for( n=0; n<=fileName.length()-1; n++ ){
		String m = fileName.substring(n,n+1);
		if (!(m.equals(".") || m.equals(":") || m.equals("?") || m.equals("*")|| m.equals("\\")))
			sum++;
	}
	
	if(fileName.length()<=8 && sum == fileName.length()){
		if(fileName.substring(fileName.length()-1).equals(".") )
			return fileName.substring(0, fileName.length()-1);
		else            
			return fileName + extension;
	}
	else
		return null;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question17 h = new Question17();
System.out.println(h.validFileName("134hk**?"));
	}

}
