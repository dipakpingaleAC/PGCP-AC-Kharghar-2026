import java.util.Scanner;
class Array{
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter 5 numbers:");
        
        for(int i=0; i<5; i++){
           arr[i]=sc.nextInt(); 
        }
        int sum=0;
        int obj;
        for (obj =0; obj<=4 ; obj++){
            sum=sum+arr[obj];
        }
        System.out.println(sum);
    }
}

