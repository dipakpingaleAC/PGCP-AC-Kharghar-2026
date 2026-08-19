import java.util.Scanner;
class Morning
{
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);

 System.out.println("Enter Time:");

float x=sc.nextFloat();
        
if ( x>1 && x<12)
{

   if (x>=5 && x<=12)

   {
       System.out.println("Enter AM or PM");
       String s=sc.next();
       
       if(s.equals("AM")||s.equals("am"))
        {
           System.out.println("Good morning");
        }
       
      else{ System.out.println("Good night");}
    }
    else{ System.out.println("GOOD DAY...");}     
}
  else { System.out.println("Please enter PROPER TIME ");}


}}
      
      


