package practiceExample;
 import java.util.Scanner;
public class Fibonacci_p12
{

    public static void main(String[] args)
    {

        int count, n1 = 0, n2 = 1;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(n1+" ");
            int sumOfPrevTwo = n1 + n2;
            n1 = n2;
            n2 = sumOfPrevTwo;
            i++;
        }
    }
}