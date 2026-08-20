import java.util.Scanner;
class BonusProblemSwitch {
	static byte a;
    static short b;
    static int c;
    static long d;
    static  float e;
    static  double f;
    static char g;
    static boolean h;
	
	public static void main(String [] args)
	{    int choice;
		Scanner sc = new Scanner(System.in);
		do{
		System.out.println("Select your Choice:  ");
		System.out.println("1  2  3  4  5 ");
		choice= sc.nextInt();
		
		switch (choice)
		{
			case 1:
			
			
			
			
			System.out.println("Enter marks of Maths:");
		int maths=sc.nextInt();
	   
	    System.out.println("Enter marks of Science:");
        int science=sc.nextInt();
		
		System.out.println("Enter marks of History:");
        int history=sc.nextInt();
		
		int abc= (maths+science+history)/3;
		System.out.println("Marks=" + abc);
		if(abc>=90){
			System.out.println("Grade=A");
		}
		else if(abc>=70&&abc<=89)
		{
			System.out.println("Grade=B");
	    }
		else if(abc>=50&&abc<=69){
			System.out.println("Grade=c");
		}
		else if(abc>=30&&abc<=49){
			System.out.println("Grade=d");
		}
		else{
			System.out.println("FAIL !!!!");
		}
			break;
			
			
			case 2:
			
			
			
			System.out.println("Enter the Year:");
		int year=sc.nextInt();
		
		if (year%4==0)
		{
			System.out.println(year + "Year is leaf");
		}
		else{
		    System.out.println(year +"is not leap year");
		}
		
		    break;
			 
			 
			 
			 case 3:
			 
			 
			 
			 
			 System.out.println("Enter Day:");
		int day=sc.nextInt();
		
		switch(day)
		{
		case 1: 
	    System.out.println("Monday");
        break;
         
        case 2:
        System.out.println("Tuesday");	
        break;
    
	     case 3:
         System.out.println("Wednesday");
         break;
		 
        case 4:
         System.out.println("Thursday");
        break;

        case 5:
         System.out.println("Friday");
        break;
		
		case 6:
         System.out.println("Saturday");
        break;
         
        case 7:
         System.out.println("Sunday");
        break;		

        default:
        System.out.println("Enter day from 1 to 7..");	
		}
		  
		        break;
				
				
				
				
		case 4:
		
		
		
		
	
	    System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println("["+g+"]");
        System.out.println(h);
		  
		  break;
		  
		  default:
		  System.out.println ("----xx----ENTER VALID CHOISE----xx----");
          break	;	  
		  
		}
		}
		while(choice!=5);
		
		
		System.out.println("EXIT....");
			  
		  
		  
		  
		
		
	}
}