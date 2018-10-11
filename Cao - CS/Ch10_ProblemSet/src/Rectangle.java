
public class Rectangle {
//FIELDS
	private int width;
	private int height;
//CONSTRUCTOR
	public Rectangle(int w, int h){
		if( w>0 && h>0){
			width = w;
			height = h;
		}
		else 
			throw new IllegalArgumentException("Rectangle Construction error: width and height of a rectangle have to be positive!");	
		}
	public Rectangle(Rectangle r){
		if( r.width>0 && r.height>0){
			width = (int)Math.pow(r.width,2);
			height = (int)Math.pow(r.height,2);
		}
		else 
			throw new IllegalArgumentException("Rectangle Construction error: width and height of a rectangle have to be positive!");	
		}
	public Rectangle(){
		width = 1;
		height = 1;
	}
public boolean isSquare(){
	return width == height;
}
public void quadratize(){
	this.width = (int)(Math.sqrt(this.width*this.height)+0.5);
	this.height = this.width;
}
public int getWidth(){
	return width;
}
public int getHeight(){
	return height;
}
}
