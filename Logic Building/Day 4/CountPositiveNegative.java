import java.util.Scanner;
class CountPositiveNegative
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<=4;i++)
        {
            arr[i]=sc.nextInt();
        }
        int positive=0;
        int negative=0;
        for (int j=0;j<=4; j++)
        {
            if(arr[j]<0){
                negative=negative+1;            }
            else
            {
                positive++;
            }

        }
        System.out.println("Negative count:"+ negative);
        System.out.println("Positive count:"+ positive);

    }
}