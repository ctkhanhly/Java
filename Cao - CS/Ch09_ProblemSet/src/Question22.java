
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] hello = {' ', 'h', 'e', 'l', 'l', 'o'};
		int i = 0;
while(i+1<6)
{
	hello[i]= hello[i+1];
	//hello[i+1] = hello[i] always ' '
	//hello[i-1] produces an error when i =0
	i++;
}
hello[5] = '!';
	
	for(int m = 0; m< hello.length; m++){
		System.out.print(hello[m]+" ");
	}

}
}
