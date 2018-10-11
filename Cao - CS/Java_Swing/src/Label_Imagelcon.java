import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
//File imageCheck = new File("Users/me/Documents/workspace/ChineseChess/src/RCar.gif");
//if (imageCheck.exists())
//    System.out.println("Image file found!");
//else
//    System.out.println("Image file not found! :(");
//button.setIcon(new ImageIcon("Users/me/Documents/workspace/ChineseChess/src/RCar.gif"));

//https://stackoverflow.com/questions/17398533/path-for-image-file-in-eclipse-src-folder-on-a-mac
public class Label_Imagelcon extends JFrame{

	public Label_Imagelcon(){
		this.setSize(400,250);//frame
		setLocation(500,300);
		setResizable(false);
		JLabel label = new JLabel();
		add(label);
		//get+set Size cua cai label
		label.setSize(350,200);//parameter: width, height/nho hon frame
		System.out.println("x: " + label.getSize().width + "y: " + label.getSize().height);
		/*
		try{
			//change image
			BufferedImage image = ImageIO.read(new File("IMG_0440.JPG"));
			
			//size cua label
			int x = label.getSize().width;
			int y = label.getSize().height;
			
		//size cua image
			int ix = image.getWidth();
			int iy = image.getHeight();
			
			int dx = 0;
			int dy = 0;
			if(x/y > ix/iy){
				dy = y;
				dx = dy*ix/iy;
			} else{
				dx = x;
				dy = dx*iy/ix;
			}
			
			//width,height, hint
			//de ratio anh giong anh that, dung dx, dy thay vi 1 so random cho width, height
			ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
			//dua image vao
			//ImageIcon icon = new ImageIcon("IMG_0440.JPG");//filename parameter
			//file nay cung folder voi bin(source) ko nam chung voi cac class.
			label.setIcon(icon);
		}
		catch( IOException ex){
			
		}
		*/
		setImage(label, "IMG_0440.JPG");
		
	}
	public static void setImage(JLabel label, String fileName){
		try{
			BufferedImage image = ImageIO.read(new File(fileName));
			
			int x = label.getSize().width;
			int y = label.getSize().height;
			
			int ix = image.getWidth();
			int iy = image.getHeight();
			
			int dx = 0;
			int dy = 0;
			if(x/y > ix/iy){
				dy = y;
				dx = dy*ix/iy;
			} else{
				dx = x;
				dy = dx*iy/ix;
			}
			
			ImageIcon icon = new ImageIcon(image.getScaledInstance(dx, dy, image.SCALE_SMOOTH));
			label.setIcon(icon);
		}
		catch( IOException ex){
			
		}
	}
	
	public static void main(String[] args){
		Label_Imagelcon image = new Label_Imagelcon();
		image.setVisible(true);
		int m = 7;
		m>>=1;
		System.out.println(m);
	}
	
}
