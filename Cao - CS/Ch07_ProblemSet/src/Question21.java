public class Question21
{
  public static void printCheckerboard(int n)
  {
    for(int row=1; row<=n; row++){
    	if (row%2!=0){
    		for(int columm=1; columm<=n; columm++){
    			if(columm%2!=0)
    				System.out.print("#");
    			else 
    				System.out.print("o");
    		}
    	}
    	else
    		for(int columm=1; columm<=n; columm++){
    			if(columm%2!=0)
    				System.out.print("o");
    			else 
    				System.out.print("#");
    		}
    	System.out.println();
    }
  }
  
  public static void main(String[] args)
  {
    printCheckerboard(7);
  }
  
}