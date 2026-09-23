package ClassesAssignment;

public class Student {

	String name;
	String roll_no;
	String phone_no;
	String address;

//	Student(){
//		name="";
//		roll_no="";
//		phone_no="";
//		address="";
//		
//		
//		
//	}
	
	
	
	Student(String roll, String n , String phone, String addr) {
		
		name=n;
		roll_no=roll;
		phone_no=phone;
		address=addr;
		
		System.out.println("Name      : "+name);
		System.out.println("RollNo.   : "+roll_no);
		System.out.println("Phone No  : "+phone_no);
		System.out.println("Address   : "+address);
		
	}
	
	
	public void display() {
		
		
	}
	public static void main(String[] args) {
		
		Student obj1= new Student("2","John","342516887","Pune");
		System.out.println("-----------------------------");
		Student obj2=new Student("4","Sam","1122334455","Solapur");

	}

}
