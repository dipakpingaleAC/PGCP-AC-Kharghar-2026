package ClassesAssignment;

public class Rectangle {

	public void area(int length, int breadth) {
		System.out.println("Length : "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Area   : "+(length*breadth));
		
	}
	
	
	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle();
		obj.area(4, 5);
		System.out.println("=====================");
		obj.area(5,8);
	}

}
