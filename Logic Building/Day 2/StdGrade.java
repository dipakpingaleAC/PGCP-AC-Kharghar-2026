import java.util.Scanner;
class StdGrade
{
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter marks of Maths:");
		int a=sc.nextInt();
	   
	    System.out.println("Enter marks of Science:");
        int b=sc.nextInt();
		
		System.out.println("Enter marks of History:");
        int c=sc.nextInt();
		
		int d= (a+b+c)/3;
		System.out.println("Marks=" + d);
		if(d>=90){
			System.out.println("Grade=A");
		}
		else if(d>=70&&d<=89)
		{
			System.out.println("Grade=B");
	    }
		else if(d>=50&&d<=69){
			System.out.println("Grade=c");
		}
		else if(d>=30&&d<=49){
			System.out.println("Grade=d");
		}
		else{
			System.out.println("FAIL !!!!");
		}
	}	
}