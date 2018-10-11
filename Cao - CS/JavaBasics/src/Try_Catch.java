import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try_Catch {
//try catch loi ko may co => ko break ra khoi program
	//nhung dong code co kha nang pham loi de trong try catch
	public static void main(String[] args){
		String test = "MynameisLyCao";
		try{
			System.out.println("Before");
			System.out.println(test.substring(50));//error bound
			int a = 5;
			int b = 0;
			System.out.println("a/b:  " + a/b);
			//neu dong 36 o day => ko bao gio print After
			//vi chua kip catch => break out of code
		}
		//catch dung de bat loi co the co khi chay
		//nhung loi nay ko co khi code, code chi hien loi neu dung sai phuong thuc
		//=> catch logic
		//cac catch ma chung ta khai bao=> thang con phai dc khai bao trc
		//or else it will never go through the subclass's exception
		//=> Exception e: last catch to be declared=> cha cua String+ Arith
		catch( StringIndexOutOfBoundsException e){
			System.out.println("Error: " + e.toString());
		}
		catch(ArithmeticException e){
			System.out.println("Error: " + e.toString());
		}
		catch(Exception e){
			System.out.println("Error: " + e.toString());
		}
		//Exception e bao gom StringIndexOutOfBoundsException
		// ArithmeticException va nhung exception khac- toan bo
		//=> cho no tien
		finally{ //du co can catch- co loi hay ko, cung run cai nay
			//dung de dong trinh duyet neu ko connect dc
			//do ton bo nho
			System.out.println("Always done");
		}
		System.out.println("After");
		
		//nhung doan lenh nao hay ban nghi ngo co exception, ban nen
		//dat trong try catch
/* These are the exceptions that differ from Exception class
 * 		
 */
		try{
			Thread.sleep(1000);
			File file = new File("text.txt");
			file.createNewFile();
		}
		catch(FileNotFoundException e){//File
			
		}
		//FileNotFoundException is the subclass of IOException
		catch(IOException e){//File
			
		}catch(InterruptedException e){//Thread
			e.printStackTrace();
		}catch(Exception e){
			//Write log?
			//show dialog?
			//print command line.
		}
		//other Exception in the Java Doc
		
	}
}
