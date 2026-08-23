import java.util.Scanner;
class SumOfOdd{
	
	Scanner sc=new Scanner(System.in);
	public void Sum(){
		
		System.out.println("Enter a Number");
        int a=sc.nextInt();
		int c=0;
		for(int i=1; i<=a ;i++)
		{
			if(i%2!=0){
				c=c+i;

			}			
		}
		System.out.println("Addition of Odd numbers between 1 & " + a + "is:" + c);
	}
	public static void main(String []args){
		SumOfOdd s=new SumOfOdd();
		s.Sum();
	}
}