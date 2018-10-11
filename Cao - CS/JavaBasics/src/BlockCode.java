
public class BlockCode extends E{
/*
 * danh cho moi doi tuong, ko thuoc ve cai gi ca
 */
	
	//tat ca nhung gi trong curly brackets goi la blockcode
			//static ->blockcodes(theo thu tu)-> super method->( trc ) constructor
			{
				System.out.println("Block code 1");
			}
			//static blockcodes
			//su dung cho tat ca object, trc ca constructor
			static{
				System.out.println("Static block code 1");
			}
			public BlockCode(){
				super(3);
				
				System.out.println("Constructor");
				
			}
			
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlockCode blockcode = new BlockCode();
		//blockcode.printName();
		
		}
	{
		System.out.println("Block code 2");
	}
	
	static{
		System.out.println("Static block code 2");
	}
	{
		super.printName();
	}

}
class E{
	private int m;
	public E(int m){
		this.m = m;
	}
	public void printName(){
		System.out.println("I am E");
	}
}
