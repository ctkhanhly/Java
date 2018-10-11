
public class SpecificPlace implements Place{
	private int xCoordinate;
	public SpecificPlace(int x){
		xCoordinate = x;
	}
	public int distance(Place other){
		return this.xCoordinate - ((SpecificPlace)other).xCoordinate;
	}
}
