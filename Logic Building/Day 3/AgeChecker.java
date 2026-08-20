import java.util.Scanner;
class Age {
	public void checkAgeCategory(int age)
	{
		int a=age;
		String c=(age<18)? "Minor" :(age>=18 && age <=60)? "Adult": "Senior Citizen";
		System.out.println("Category=" + c);
	}
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age= sc.nextInt();
		Age obj=new Age();
		obj.checkAgeCategory(age);
	}
	
}