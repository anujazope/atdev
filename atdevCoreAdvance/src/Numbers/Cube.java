package Numbers;
import java.util.Scanner;
public class Cube
{
    public static void main(String args[])
    {
      
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int r = (int)Math.round(Math.pow(n,1.0/3.0));
       
        if(r * r * r==n)
        {
            System.out.println(n+" is a cube");
        }
        else
        {
            System.out.println(n+" is not a cube");
        }
    }
}