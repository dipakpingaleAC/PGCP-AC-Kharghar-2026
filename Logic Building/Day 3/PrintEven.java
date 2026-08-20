import java.util.Scanner;
class PrintEven{
	public void printEvenNumbers(){
		
		int num =  1;
		
		while(num <=50){
			if (num%2==0){
				
			System.out.print(num + " ");
			
			}
			num ++;
		}
	}
	
	public static void main(String[]args){
		PrintEven e =new PrintEven();
		e.printEvenNumbers();
	}
}