import java.io.BufferedWriter;
import java.io.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//3 steps: create file, FileWriter, BufferedWriter, data,  write()
		try {
		File file = new File("text.txt");
		file.createNewFile();
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter  bw = new BufferedWriter(fw);
		//do sth here
		String data = "Ahihihi\n";
		bw.write(data);
		data = "hoho\n";
		bw.write(data);
		bw.close();
		fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


}
    // Create the file and the PrintWriter that will write to the file
    private static PrintWriter createFile(String fileName){
    	try{
            // Creates a File object that allows you to work with files on the hardrive
            File listOfNames = new File(fileName);
            // FileWriter is used to write streams of characters to a file
            // BufferedWriter gathers a bunch of characters and then writes
            // them all at one time (Speeds up the Program)
            // PrintWriter is used to write characters to the console, file

            PrintWriter infoToWrite = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter(listOfNames)));
            return infoToWrite;
    	}
        // You have to catch this when you call FileWriter
        catch(IOException e){
            System.out.println("An I/O Error Occurred");
            // Closes the program
            System.exit(0);
        }
        return null;
    }
    // Create a string with the customer info and write it to the file
    private static void createCustomers(Customer customer, PrintWriter custOutput){
        // Create the String that contains the customer info
        String custInfo = customer.firstName + " " + customer.lastName + " ";
        custInfo += Integer.toString(customer.custAge);
        // Writes the string to the file
        custOutput.println(custInfo);
    }
    private static class Customer{
        public String firstName, lastName;
        public int custAge;
        // constructor that's called when a customer is made
        public Customer(String firstName, String lastName, int custAge){
            this.firstName = firstName;
            this.lastName = lastName;
            this.custAge = custAge;
        }
    }
    
}
