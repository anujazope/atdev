package loops;


public class SumSeries
{
    public static void main(String[] args)
    {
        float sum = 0;
 
       System.out.print("sum of series is : ");
        
 
        for(int i = 1; i < 10; i++)
    {
            sum += 1.0/i;
    }
 
        System.out.println(sum);
    }  
}