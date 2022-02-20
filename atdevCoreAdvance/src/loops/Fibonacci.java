package loops;

import java.util.Scanner;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        int no, a = 0, b = 0, c = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of no:");
        no = s.nextInt();
        System.out.print("Fibonacci Series:");
        for(int i = 1; i <= no; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}