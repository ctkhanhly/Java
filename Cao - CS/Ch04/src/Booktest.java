
public class Booktest {
	public static void main(String[] args){
	Book LyBook = new Book(3);// currentPage default here is 1, b/c that's default value what we set in book class; currentPage=1, numPages=3
	LyBook.nextPage(); //(1) look back book class, method named nextPage not setnextPage; currentPage now: 2; numPages = 3
	LyBook.nextPage();// (2)currentPage =3, numPages = 3
	LyBook.nextPage();//(3)currentPage = 3, numPages = 3, dont match the if statement-> dont add currentPage
	System.out.println("Book's name is: \f" + LyBook.getName() );//concatenate double and string
	System.out.println("Number of pages: " + LyBook.getNumPages());
	for (int count = 0; count <3; count ++){
		System.out.println("Current page is: " + LyBook.getCurrentPage());// this will run (1),(2),(3), getcurrentpage gives back number, getnextpage is action do not give back number
		System.out.println("Next page is: " );
		LyBook.nextPage();
		System.out.println("     ");
		//System.out.println("Next page is: " + LyBook.getNextPage()); (wrong code)
		//every object has a default toString method
		//toString method returns the object
		//System.out.println only accepts string, method, object, intergers
		//every object has default toString, but we can overrride it.
	}
	}
}
