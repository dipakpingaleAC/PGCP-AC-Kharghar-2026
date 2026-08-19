import java.util.Scanner;
class NegativeNum{
 public static void main(String args[])
    {
System.out.println("ENter Number:");

Scanner sc= new Scanner(System.in);
   int num=sc.nextInt();
if (num>0)
   {
 System.out.println("Number is NOT Negative");
    }
  else{
  System.out.println("Number is Negative");
}
}
}