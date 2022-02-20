package loops1;
public class Parrot
{
	static boolean parrotTrouble(boolean talk,int hr)
	{
		if(talk && (hr<7 || hr>20))
			return true;	
		return false;
	}
	public static void main(String[] args) {
		System.out.println(parrotTrouble(true, 6));
		System.out.println(parrotTrouble(true, 7));
		System.out.println(parrotTrouble(false, 6));
	
	}
}
