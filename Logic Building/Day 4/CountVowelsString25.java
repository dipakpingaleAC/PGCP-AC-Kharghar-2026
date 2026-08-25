import java.util.Scanner;
class CountVowelsString25{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");      
        String a=sc.nextLine();
        
        int b=0;
        for(int i=0;i<=a.length()-1;i++)
        {
            if(a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u'){
                b=b+1;
            }
        }
        System.out.println("Number of vowels in " +"'"+ a+"'"+" are: " + b);
        
    }
}