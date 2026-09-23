package ClassesAssignment;

public class Employee2 {
	
	int Salary;
	int Hours;
	public void getInfo(int salary, int hours){
		
		this.Salary=salary;
		this.Hours=hours;
		
	}
	
	public void addSal() {
		
		if(Salary<500) {
			Salary=Salary+10;
		}
		else {
			Salary=Salary;
		}
		
	}
	
	
	
	public void addWork() {
		 
		if(Hours>6 ) {
			Salary=Salary+5;
		}
	}
	
	
	public void printSalary() {
		System.out.println("Final Salary is: " + Salary);
	}

	public static void main(String[] args) {
		
		Employee2 obj=new Employee2();
		
		obj.getInfo(400, 7);
//		obj.getInfo(550, 7);
		obj.addSal();
		obj.addWork();
		
		obj.printSalary();


	}

}
