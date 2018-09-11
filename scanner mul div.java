import java.util.*;
class Main {
  public static void main(String[] args) {
    int s,t;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first value");
    int a=sc.nextInt();
    System.out.println("Enter the second value ");
    int b=sc.nextInt();
    System.out.println("Enter third the value ");
    int c=sc.nextInt();
    System.out.println("Enter the  fourth value ");
    int d=sc.nextInt();
    System.out.println("Enter the  fifth value ");
    int e=sc.nextInt();
    System.out.println("Enter the  sixth value ");
    int f=sc.nextInt();
    s=(a+b+c+d+e+f) /2;
    t=(a-b-c-d-e-f) *2;
    System.out.println("add & div " +s );
    System.out.println("sub & mul " +t );
  }
}