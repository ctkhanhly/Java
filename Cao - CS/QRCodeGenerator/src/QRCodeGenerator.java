import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;


//qrGen
//https://www.callicoder.com/generate-qr-code-in-java-using-zxing/
//http://www.java2s.com/Code/Jar/q/Downloadqrgen12sourcesjar.htm
//https://www.mkyong.com/java/how-to-convert-byte-to-bufferedimage-in-java/

public class QRCodeGenerator extends JFrame{
    private static final String QR_CODE_IMAGE_PATH = "./MyQRCode.png";
    
    public QRCodeGenerator(){
    	this.setSize(400,250);
		setLocation(500,300);
		setResizable(false);
		JLabel label = new JLabel();
		add(label);
		this.setVisible(true);
		
		try{
		// convert byte array back to BufferedImage
		InputStream in = new ByteArrayInputStream(getQRCodeImage("This is my first QR Code", 350, 350));
		BufferedImage bImageFromConvert = ImageIO.read(in);
		ImageIcon icon = new ImageIcon(bImageFromConvert);
		label.setIcon(icon);
//		ImageIO.write(bImageFromConvert, "jpg", new File(
//				"c:/new-darksouls.jpg"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (WriterException e) {
			System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());  
		}

    }

//    private static void generateQRCodeImage(String text, int width, int height, String filePath)
//            throws WriterException, IOException {
//        QRCodeWriter qrCodeWriter = new QRCodeWriter();
//        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
//
//        Path path = FileSystems.getDefault().getPath(filePath);
//        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
//       
//    }
//    
    private static byte[] getQRCodeImage(String text, int width, int height) throws WriterException, IOException {
      QRCodeWriter qrCodeWriter = new QRCodeWriter();
      BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height);
      
      ByteArrayOutputStream pngOutputStream = new ByteArrayOutputStream();
      MatrixToImageWriter.writeToStream(bitMatrix, "PNG", pngOutputStream);
      byte[] pngData = pngOutputStream.toByteArray(); 
      return pngData;
    }
  

    public static void main(String[] args) {
        //try {
            //generateQRCodeImage("This is my first QR Code", 350, 350, QR_CODE_IMAGE_PATH);
            
           // System.out.write( getQRCodeImage("This is my first QR Code", 350, 350));
  
            	
            			
        	
//        } catch (WriterException e) {
//            System.out.println("Could not generate QR Code, WriterException :: " + e.getMessage());
//        } catch (IOException e) {
//            System.out.println("Could not generate QR Code, IOException :: " + e.getMessage());
//        }
        QRCodeGenerator  g = new QRCodeGenerator();
        
    }
    /* 
    This method takes the text to be encoded, the width and height of the QR Code, 
    and returns the QR Code in the form of a byte array.
    */
   

}
