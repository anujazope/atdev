package practiceExample;
import java.time.*;

public class AgeCal_p4
{  
   public static void main(String[] args)
    {
        
        LocalDate pdate = LocalDate.of(1989, 04, 11);//birth
        
        LocalDate now = LocalDate.now();//current
       
        Period diff = Period.between(pdate, now);
 
     System.out.printf("\nI am  %d years, %d months and %d days old.\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
   }
}