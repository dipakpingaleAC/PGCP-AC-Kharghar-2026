package ClassesAssignment;

public class Employee {
	
		
		 String Name="";
		 int YearOfJoin=0;
		 int Salary;
		 String Address;
		

	
	public void display(String name, int year, String addr) {
		Name=name;
		YearOfJoin=year;
		Address=addr;
		System.out.println( Name +"\t"+YearOfJoin+"\t\t"+Address);
		
	}

	public static void main(String[] args) {

		Employee obj= new Employee();
		System.out.println("Name\tYear of joining\tAddress");
		obj.display("Robert", 1994, "64C-WallsStreet");

		Employee obj1=new Employee();
		obj.display("Sam   ", 2000, "68D-WallsStreet");
		
		Employee obj2=new Employee();
		obj.display("John  ", 1999, "26B-WallsStreet");
		
	}

}
