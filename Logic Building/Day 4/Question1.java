import java.util.Scanner;
class PrintNum
{
	public void NumberPrint()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			System.out.print(" "+ i);
		}
	}
	public static void main(String []args)
	{
		PrintNum p=new PrintNum();
		Scanner sc=new Scanner(System.in);
		p.NumberPrint();
	}
}