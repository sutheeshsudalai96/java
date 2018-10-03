import java.util.*;
class Main{
  public static void main(String[]arg){
    Scanner ka=new Scanner(System.in);
    float a;
    a=ka.nextFloat();
    if(a==0)
    {
    System.out.println("zero");
    }
    else if(a>0)
   {
   System.out.println("positive"); 
   }
   else if(a<0)
   {
   System.out.println("negative");  
   }
  } 
}