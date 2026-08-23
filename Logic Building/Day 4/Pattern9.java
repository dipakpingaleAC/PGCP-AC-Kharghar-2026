import java.util.Scanner;
class Pattern9{
	public static void main(String[]args)
	{
		for(int i=1 ;i<=6; i++)
		{
			
			for(int k=i; k<=5 ; k++)
				{
					System.out.print(" " );
					
				}
			for (int j=1 ; j<=i*2-1; j++)
			{    
		        
				System.out.print("*");
				
				
				}
				
				System.out.println();
			}
			
		for(int a=1; a<=5; a++)
			{
				for (int c=1; c<=a;c++)
				{
					System.out.print(" ");
				}
				
				for (int b=9; b>=a*2-1; b--)
				{
					System.out.print("*");
				}
				System.out.println();
			}				
				
				
	}
}
