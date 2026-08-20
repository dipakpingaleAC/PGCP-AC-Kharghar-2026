import java.util.Scanner;
class PositiveN
{ 
    
	public void askForPositiveNumber()
	{
		 int a;
		
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a positive number:"); 
			a=sc.nextInt();
			
			
		}
		while(a<1);
			
		    System.out.println("You Entered a positive number :" );
       
	}
	public static void main(String[]args){
		
		PositiveN obj = new PositiveN();
		
		
		obj.askForPositiveNumber();
		
	}
	
}