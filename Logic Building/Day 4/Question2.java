import java.util.Scanner;
class Question2
{
	public void Multiples()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number:");
		int a=sc.nextInt();
		for(int i=1; i<=a ; i++){
			
			if(i%3==0){
				System.out.print(i+ " ");
			}
			
		}
	}
    public static void main(String[]args)
	{
		Question2 s=new Question2();
		s.Multiples();
	}

}
