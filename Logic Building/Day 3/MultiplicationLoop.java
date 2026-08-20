import java.util.Scanner;
class Multiplication
{
	public void printMultiplicationTable()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a = sc.nextInt();
		for(int i=1; i<=10 ; i++)
		{
		  	System.out.println(a+"*"+i+"=" + (a*i) );
		}
	}
	public static void main(String[]args)
	{
		Multiplication m=new Multiplication();
		m.printMultiplicationTable();
		
	}
   
}