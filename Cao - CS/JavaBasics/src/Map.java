import java.util.HashMap;

public class Map {
//giong ArrayList va Vector- luu tru cac object
	//add theo key ko phai index
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key : vi tri cua value
		//put( Object key, Object value)
		//lien quan truc tiep nhg key khac nhau
		HashMap map = new HashMap();
		map.put("instructor", "Ducky");
		map.put("blog", "StudyAndShare");
		map.put("blog", "Test");//replace StudyAndShare with Test
		map.put(new Integer(5), "Vietnam");
		System.out.println(map.get("instructor"));//Ducky
		//get(Object key)
		
		System.out.println(map.get("hihi"));//null- does not have a value with that key
		map.size();
		map.remove("instructor");
		System.out.println("instructor");//null
		map.clear();//xoa toan bo value va key da dc luu
		System.out.println(map.get("instructor"));//null( after clear)
		
		//Generic
		HashMap<String, Bh> map1 = new HashMap<String, Bh>();//<key, value>
		map1.put("Hehe", new Bh());
	}

}
class Bh{
	
}
