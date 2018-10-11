//create my own exception
public class Throw_throws {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Building b = new Building();
		b.go();// essentially call Thread.sleep()=> has to throw again
		/*try {
			b.go();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
class MyException extends Exception{
	
}

class Building{
	public void show() throws MyException{//throws: khai bao phuong thuc
		//throws hoac surround with try -catch is another way
		//throw: nem phuong thuc
		int numberConnection = 0;
		if( numberConnection > 100){
			throw new MyException();
		}
		throw new MyException();//nem ra 1 ngoai
		
	}
	public void go() throws InterruptedException{
		Thread.sleep(1000);//try catch above
	}
	//max 6 parameters a method
}

