import java.util.*;
class Main{
  public static void main(String[]arg){
    Scanner ka=new Scanner(System.in);
    int a;
    System.out.println("enter the number");
    a=ka.nextInt();
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