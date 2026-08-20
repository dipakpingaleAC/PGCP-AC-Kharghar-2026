import java.util.Scanner;
class Sum{
	
		public int sumOfTwoNumbers(int a,int b)
		{
			
		
		int c=(a+b);
		System.out.println("result" +c)	;
		return 0;
		}
	public static void main(String[]args)
	{ 
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter Second number:");
		
		int b=sc.nextInt();
		
		Sum obj=new Sum();
		
		obj.sumOfTwoNumbers(a,b);
	}
	
}
