package Numbers;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomInt 
{
	public static void main(String[] args) {
		int min = 5000; int max = 100000;
		Random r = new Random ();
		IntStream stream = r.ints(1,min,max);
		int randomNum = stream.findFirst().getAsInt();
		System.out.println("The random number is: " + randomNum);
	}
}
