import java.util.Scanner;
class LargestInArray
{
            static int a=0;

    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0; i<=4; i++){
            arr[i]=sc.nextInt();
        }

        for(int j=0; j<=4; j++){
            if (arr[j]>a){
                a=arr[j];
            }
            
        }
         System.out.println("Largest Number is:" + a);
    }
}