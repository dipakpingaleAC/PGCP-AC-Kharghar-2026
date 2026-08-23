import java.util.Scanner;
class Pattern3{
	Scanner sc= new Scanner(System.in);
	
	public static void main(String [] args)
	{
		for (int i=1 ; i<=9; i++){
			if (i%2==0){
					continue;
				}
			for (int j=1; j<=i; j++){
				
				if (j%2==0){
					continue;
				}
				
				 System.out.print(j);
						if(j<i){
				    	System.out.print("*");
						}
				}
			System.out.println();
		}
	}
		
}		


