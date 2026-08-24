import java.util.Scanner;
class Avg{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i=0; i<=4; i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=0;
        for(int j=0;j<=4; j++)
        {
            s=s+arr[j];
        }
        System.out.println("Average is: "+ s/5);
    }
}