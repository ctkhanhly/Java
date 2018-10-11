
public class Question5 {
public static char getRandomRps(){
	char[] getRandomRps = {'r','r', 'r', 'p','p','p','p','p', 's','s','s','s','s','s'};
	return getRandomRps[(int)Math.random()*getRandomRps.length];
}
public static void main(String[] args) {
	System.out.print(getRandomRps());
}
}
