import java.util.Scanner;
class pattern1{
	Scanner sc= new Scanner(System.in);
	
	public static void main(String [] args)
	{
		int j;
		for(int i=1;i<=5;i++)
	    {
			for(j=1; j<=i; j++)
			{
				System.out.print(i);
				if(j<i){
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		for(int a=5; a>=2; a--)
		{
			for(int b=1; b<=a;b++)
			{
				System.out.print(a);
				if (b<a ){
					System.out.print("*");
				}
				
			}
			
			System.out.println();
		}
			
	}
}