import java.util.Scanner;
class Pattern2{
	Scanner sc= new Scanner(System.in);
	
	public static void main(String [] args)
	{
		int j;
		for(int i=1;i<=5;i++)
	    {
			for(j=1; j<=i; j++)
			{
				System.out.print(j);
				if(j<i){
					System.out.print("*");
				}
			}
			System.out.println();

		}
	}
}
