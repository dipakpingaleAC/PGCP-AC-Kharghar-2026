import java.util.Scanner;
class Factorial
{
	public void factorialCalculate()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		int i;
		int c = 1;
		for(i=1; i<=a ; i++){
			
			c =c*i;
			
		}
		System.out.println("Factorial is :" +c );
	}
    public static void main(String[]args)
	{
		Factorial s=new Factorial();
		s.factorialCalculate();
	}

}
