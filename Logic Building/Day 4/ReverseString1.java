import java.util.Scanner;

class ReverseString{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter String :");
        String a= sc.nextLine();
        String b="";
        for(int i=a.length()-1; i>=0; i--){
        b=b+a.charAt(i);
        
        }
        System.out.println("String is : "+ b);

    }
}