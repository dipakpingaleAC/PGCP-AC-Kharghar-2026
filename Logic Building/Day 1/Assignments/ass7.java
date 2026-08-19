import java.util.Scanner;
class LargestNum
{
 public static void main(String args[])
{
 Scanner sc =new Scanner(System.in);
System.out.println("Enter 1st number");
int x=sc.nextInt();

System.out.println("Enter 2nd number");
 int y=sc.nextInt();

System.out.println("Enter 3rd number");
 int z=sc.nextInt();

if (x>=y&&x>=z){ 
System.out.println(x  + "is greater");
}

else if (y>z ) {
System.out.println(y  + "is greater");
}

else{
System.out.println(z  + "is greater");
}

}
}

  