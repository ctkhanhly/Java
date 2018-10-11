
public class SwitchStatementWorksheet11_15 {
	public static void main(String[] args){
	int areaCode = 123;
	if (areaCode == 313 || areaCode == 248 )
		System.out.println("Your new area code is 123");
	else if (areaCode == 906)
		System.out.println("No change in area code");
	else
		System.out.println("Unknown MI area code");
	
	int month = 1;
	switch(month)
	{ 
	case 1:
	case 2: 
		System.out.println("Winter");
		break;
	case 12:
	System.out.println("Coud be fall or winter?");
	break;
	case 3:
		System.out.println("Could be winter or spring?");
		break;
	case 4:
	case 5:
		System.out.println("Spring");
		break;
	default:
		System.out.println("Season not determined yet");
	}
	}
}
