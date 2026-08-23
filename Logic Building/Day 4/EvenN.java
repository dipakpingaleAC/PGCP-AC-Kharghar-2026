import java.util.Scanner;
class EvenN
{
	Scanner sc =new Scanner(System.in);
	public void even()
	{
		
		System.out.println("Enter a number:");
		int a =sc.nextInt();
		
		for(int i=1; i<=a; i++){
			if (i%2==0){
				System.out.print(" "+i);
				
			}
		}
	}
	public static void main(String []args)
	{
		EvenN e=new EvenN();
		e.even();
	}
}