package ClassesAssignment;

public class Triangle {

	
	Triangle(int a, int b , int c){
		
		int perimeter=a+b+c;
		int s=perimeter/2;
		
		System.out.println("Perimeter of triangle is : "+ perimeter);
		
		int area=s*(s-a)*(s-b)*(s-c);
	
		double result= Math.sqrt(area);
		System.out.println("Area is : " +result);
		
	}
	public static void main(String[] args) {
		
		Triangle obj=new Triangle(3,4,5);
		
	}

}
