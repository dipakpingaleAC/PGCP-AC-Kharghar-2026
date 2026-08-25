import java.util.Scanner;
class StringPool{
    public static void main(String[]args){
    String s1=new String("hello");
    String s2=s1.intern();

    String s3="hello";

    System.out.println("Is s2 and s3 pointing to same object :" + (s2==s3));
}
}
