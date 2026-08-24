import java.util.Scanner;
import java.util.Arrays;
class IndexOfElement{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter 5 Numbers:");
        for(int i=0; i<=4; i++)
        {
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
         int aa= Arrays.binarySearch(arr,a );
           if (aa>=0)
           {
            System.out.println("FOUND at index: "+ aa);
           }
            else{
                System.out.println("NOT FOUND...");
            }
    }
}