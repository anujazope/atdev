package arrays;
import java.util.Arrays; 
public class Removeval_p3 
 {
 public static void main(String[] args) 
 {
   int[] my_array = {250, 114, 56, 15, 36, 56, 77, 18, 29, 494};
   
   System.out.println("Original Array : "+Arrays.toString(my_array));     
   
 
   int removeIndex = 1;

   for(int i = removeIndex; i < my_array.length -1; i++)
   {
        my_array[i] = my_array[i + 1];
    }

    System.out.println("After removing the second element: "+Arrays.toString(my_array));
 }
 }