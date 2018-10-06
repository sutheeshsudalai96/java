import java.util.Arrays; 
import java.util.Collections; 
  class Main
   { 
    public static void kLargest(Integer [] arr, int k)  
    {  
        Arrays.sort(arr, Collections.reverseOrder());  
    for (int i = 0; i < k; i++)  
    System.out.print(arr[i] + " "); 
    }  
       public static void main(String[] args)  
    { 
        Integer arr[] = new Integer[]{5,1,1,2,3,4,5}; 
        int k = 1; 
        kLargest(arr,k);      
     } 
}