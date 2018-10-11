
//enum COLOR {RED, BLUE, YELLOW, GREEN};
public class Enum {//co 2 cho co the khai bao enum- ngang hang voi class hoac field cua 1 class
	//ko dc khai bao trong 1 method
//	enum COLOR {RED, BLUE, YELLOW, GREEN};
	enum COLOR {
		RED(5), BLUE(6), YELLOW(7), GREEN(8); //cac phan tu phai dc khai bao dau tien
		private int value;
		
		COLOR(int value){
			this.value = value;
		}
		public int getValue(){
			return value;
		}
		
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(COLOR.BLUE);
		COLOR c = COLOR.RED;
		System.out.println(c);
		System.out.println(c.YELLOW);//has to be capitalized, exact as declared
		if( c == COLOR.RED){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		//switch - ko cho bien long, float, char
		//chi co bien duoi int- int, short, byte, enum
		
		System.out.println(c + ": " + c.getValue());
			
	}

}
