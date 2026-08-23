import java.util.Scanner;
import java.util.Arrays;
class PrintArray{
	public static void main(String []args)
	{   Scanner sc= new Scanner (System.in);
		System.out.println("Enter 5 integers:");
		
		int arr[]=new int[5];
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		
		// for(int obj : arr)
		// {
		// 	System.out.print(obj);
		// }

		System.out.print(Arrays.toString(arr));
		
	}
}