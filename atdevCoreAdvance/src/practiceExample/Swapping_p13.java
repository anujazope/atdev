package practiceExample;
public class Swapping_p13
{

   public static void main(String[] args)
   {
	   int x = 10;
	   int y = 50;
	   x = x + y;
	   y = x - y;
	   x = x - y;
	   System.out.println("After swapping :" + " x = " + x + ", y = " + y);
   }
   }