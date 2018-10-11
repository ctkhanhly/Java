import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;



//import org.omg.CORBA_2_3.portable.InputStream;

//import org.omg.CORBA.portable.InputStream;

//http://www.gotoquiz.com/web-coding/programming/java-programming/how-to-load-an-image-from-a-url-in-java/

public class ImageDemo extends JFrame{
	public ImageDemo(){
		this.setSize(400,250);//frame
		setLocation(500,300);
		setResizable(false);
		JLabel label = new JLabel();
		add(label);
		
		try {
			
			//to find url of an image: right click -> copy image address
		    URL imageUrl = new URL("http://www.catster.com/wp-content/uploads/2018/01/Cat-flehmen-response.jpg");
		    InputStream in = imageUrl.openStream();
		    BufferedImage image = ImageIO.read(in);
		    in.close();
			 //Image image = ImageLoader.fromUrl("http://www.catster.com/wp-content/uploads/2018/01/Cat-flehmen-response.jpg");
		
		    
		    ImageIcon icon = new ImageIcon(image);
		    label.setIcon(icon);
		    
		}
		catch (IOException ioe) {
		    //log the error
		}
		
		
	}
	public static void main(String[] args){
		ImageDemo image = new ImageDemo();
		image.setVisible(true);

	}
}
//try {
//    Image image = ImageLoader.fromUrl("http//example/image.jpg");
//}
//catch (IOException ioe) {
//    //log the error
//}
