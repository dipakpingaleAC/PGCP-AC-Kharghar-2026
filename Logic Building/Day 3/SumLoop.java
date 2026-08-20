import java.util.Scanner;
class SumLoop{
	static int ans= 0;
	public void  calculateSum(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n= sc.nextInt();
		
		for(int i=n;i>=1; i--)
		{
			
			ans = ans +i;
		}
		System.out.println("The sum of nummbers from 1 to "+  n + " is: " + (ans));
		
		

	}
	public static void main(String[] args){
		SumLoop s=new SumLoop();
		
		s.calculateSum();
	}
}