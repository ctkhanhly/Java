
public class Question13 {
	public static void main(String[] args){
int n=4;
int[][] x= new int[5][5];
for(int r = 0; r < x.length; r++){
	for(int c = 0 ; c < x[0].length; c++){
		x[r][c] = c;
		if (r==c || r+c == x.length-1)
			x[r][c]=1;
		System.out.print(x[r][c] + "\t");
}
System.out.println();
}

for(int i = 0; i< x.length; i++){
	if (x[i][i]==n)
			x[i][i]=1;
	//System.out.println(x[i][i]);
	}
for(int i = x.length-1; i>=0; i--){
	if (x[i][i]==n)
			x[i][i]=1;
	//System.out.println(x[i][i]);
	}
}
}
