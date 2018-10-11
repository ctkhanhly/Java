import java.io.*;
//A binary file is a file whose content must be interpreted by 
//a program that understands in advance exactly how it is formatted.
//You can say that a binary file is a "non-text" file.
public class Read_Write_BinaryStream {

	public static void main(String[] args) {
		Customer[] customers = getCustomers();

        DataOutputStream custOutput = createFile("/Users/lycao/Documents/Java code/src/customers.dat");
		for(Customer person: customers){
			createCustomers(person, custOutput);
		}
        // Closes the connection to the DataOutputStream
        try {
            custOutput.close();
        } catch (IOException e) {
            System.out.println("An I/O Error Occurred");
            // Closes the program
            System.exit(0);
        }
        getFileInfo();

	}
    private static DataOutputStream createFile(String fileName){
    	try{
            // Creates a File object that allows you to work with files
            // on the hard drive. There is no difference between File
            // for character or binary stream writing, or reading
            File listOfNames = new File(fileName);
            // FileOutputStream is used to write streams of data to a file
            // You define whether a new file is created versus appended
            // to based on if you add a boolean to the FileOutputStream
            // FileOutputStream(file, true) : Appends to the file
            // FileOutputStream(file, false) : Creates a new file

            // BufferedOutputStream gathers all the data and then writes
            // it all at one time (Speeds up the Program)
            // DataOutputStream is used to write primitive data to the file

            DataOutputStream infoToWrite = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(listOfNames)));
            return infoToWrite;
    	}
        catch(IOException e){
            System.out.println("An I/O Error Occurred");
            // Closes the program
            System.exit(0);
        }
        return null;

    	}
	private static class Customer{
		
		public String custname;
		public int custAge;
		public double custDebt;
		public boolean oweMoney;
		public char custSex;
		
		public Customer(String custname, int custAge, double custDebt, boolean oweMoney, char custSex){
			this.custname = custname;
			this.custAge = custAge;
			this.custDebt = custDebt;
			this.oweMoney = oweMoney;
			this.custSex = custSex;
		}
	}
		private static Customer[] getCustomers(){
			
			Customer[] customers = new Customer[5];
			
			customers[0] = new Customer("John Smith", 21, 12.25, true, 'M');
			customers[1] = new Customer("Paul Smith", 21, 12.25, true, 'M');
			customers[2] = new Customer("Sue Smith", 21, 12.25, true, 'M');
			customers[3] = new Customer("Sally Smith", 21, 12.25, true, 'M');
			customers[4] = new Customer("Mark Smith", 21, 12.25, true, 'M');
			
			return customers;
		
	}
    private static void createCustomers(Customer customer, DataOutputStream custOutput){
    	try{
            // Write primitive data to the file
            // Writes a String in UTF format
            custOutput.writeUTF(customer.custname);
            // Writes an Integer
            custOutput.writeInt(customer.custAge);
            // Writes a Double
            custOutput.writeDouble(customer.custDebt);
            // Writes a Boolean
            custOutput.writeBoolean(customer.oweMoney);
            // Writes a Character
            custOutput.writeChar(customer.custSex);
            // You also have writeByte, writeFloat, writeLong
            // and writeShort
    	}
        catch(IOException e){
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
    	}
    // Read info from the file and write it to the screen
    private static void getFileInfo(){
        System.out.println("Info Written to File\n");

        // Open a new connection to the file
        File listOfNames = new File("/Users/lycao/Documents/Java Code/src/customers.dat");
        boolean eof = false;
        try {
            // A DataInputStream object has the methods for reading the data
            // The BufferedInputStream gathers the data in blocks
            // FileInputStream gets data from the file
            DataInputStream getInfo = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(listOfNames)));
            // Using a while loop that pulls data until EOFException is thrown
            while (!eof){
                // You have to read data in the exact order it was put in the file
                String custName = getInfo.readUTF();
                int custAge = getInfo.readInt();
                double custDebt = getInfo.readDouble();
                boolean oweMoney = getInfo.readBoolean();
                char custSex = getInfo.readChar();

                System.out.println(custName);
                System.out.println(custAge);
                System.out.println(custDebt);
                System.out.println(oweMoney);
                System.out.println(custSex + "\n");
            }
        }
        catch (EOFException e) {
            eof = true;
        }
        // Can be thrown by FileInputStream
        catch (FileNotFoundException e) {
            System.out.println("Couldn't Find the File");
            System.exit(0);
        }
        catch(IOException e){
            System.out.println("An I/O Error Occurred");
            System.exit(0);
        }
    }

}
