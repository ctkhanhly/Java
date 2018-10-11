
public class Book {
	//Fields
	private int numPages;
	private int currentPage;
	private int nextPage;
	private String name;
	//Constructor
	//public Book(){// parameter goes inside the parenthesis (wrong code)
		//numPages = 300;
		//currentPage = 1;
		//nextPage = (currentPage + 1);
		//if (currentPage < numPages) currentPage++;
		//name = "Ly's book";
	public Book(int p){ // instead of p, can be value, anything// get(number etc)/set: access and methods
		numPages = p;
		currentPage = 1;
		name = "Ly's Book";
	}
	//Methods
	public int getCurrentPage(){
		return currentPage;
	}
	public int getNumPages(){// accessor methods
		return numPages;
	}
	public String getName(){
		return name;
	}
	//dont need set blah blah in this case, but Mr. Baier encourages to include these in every class code :)))) hyhyhyhy
	public void setNumPages(int a){ // new variable, could be any numbers, should not be the same as any fields ( p)
		numPages = a;
}
	public void setCurrentPage(int b){// mutator methods
		currentPage = b;
	}
	public void nextPage(){
		//if (currentPage < numPages) currentPage ++; or
		if (currentPage < numPages){ 
			currentPage++;
		}
	}
	//public int getNextPage(){ (wrong code)
			//return nextPage;
	//}
	//public static void main(String[] args){ // why cannot public static void? how is it method
		//Scanner kboard = new Scanner(System.in); - can I use this in the class 
}
