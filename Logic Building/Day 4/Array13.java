
import java.util.*;
class ArrInclude{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Integer arr[]= new Integer[5];
        System.out.println("Enter 5 numbers:");
        for (int i=0; i<=4; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to search:");
        int a =sc.nextInt();
        if(Arrays.asList(arr).contains(a)){
        System.out.println("FOUND!!!");
        }
        else{
            System.out.println(" NOT FOUND!!!");
        }
    }
}