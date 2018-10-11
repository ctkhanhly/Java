import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("text.txt");//file nay dc tao roi( File Writer) nen ko
		//createFile() nua- ko thi no de len mat
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			//                String[] indivCustData = custInfo.split(" ");

			String line = "";
			int i = 0;
			while((line = br.readLine()) != null){
				System.out.println(++i + ": " + line );
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
