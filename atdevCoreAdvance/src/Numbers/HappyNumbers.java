package Numbers;
public class HappyNumbers  
{     
  
    public static int isHappyNumber(int n)
    {  
        int rem = 0, sum = 0;  
          
        
        while(n > 0){  
            rem = n%10;  
            sum = sum + (rem*rem);  
            n = n/10;  
        }  
        return sum;  
    }  
      
    public static void main(String[] args) {  
          
       
        System.out.println("List of happy numbers between 1 and 10: ");  
        for(int i = 1; i <= 10; i++){  
            int result = i;  
              
      
            while(result != 1 && result != 4){  
                result = isHappyNumber(result);  
            }  
              
            if(result == 1)  
                System.out.print(i + " ");  
        }  
    }  
}