package ClassesAssignment;

public class Complex {

	public void sum(int r1,int r2, int i1, int i2) {
		int real=r1+r2;
		int imaginary=i1+i2;
		System.out.println("Sum is : "+(real)+ "+"+(imaginary)+"i");
	}
	
	public void difference(int r1,int r2, int i1, int i2) {
		int real=r1-r2;
		int imaginary=i1-i2;
			System.out.println("Difference is : "+(real)+ "+"+(imaginary)+"i");
	}
	

	public void product(int r1,int r2, int i1, int i2) {
		
		//(a+bi)*(c+di)=(ac - bd)+(ad + bc)i
		
		int real = (r1*r2 - i1*i2);
		int imaginary = (r1*i2 + r2*i1 );
		
		System.out.println("Product is : " + real + "+"+ imaginary + "i");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1st real number :");
		int real1=consoleinput.getint();
		
		System.out.println("Enter 1st imaginary number :");
		int imaginary1=consoleinput.getint();
		
		System.out.println("Enter 2nd real number :");
		int real2=consoleinput.getint();
		
		System.out.println("Enter 2nd imaginary number :");
		int imaginary2=consoleinput.getint();

		
		System.out.println("First complex number: "+ real1 + "+"+imaginary1 + "i");
		System.out.println("Second complex number: "+ real2 + "+"+imaginary2 + "i");
		Complex obj=new Complex();
		
		obj.sum(real1,real2,imaginary1,imaginary2);
		obj.difference(real1,real2,imaginary1,imaginary2);
		obj.product(real1,real2,imaginary1,imaginary2);
		
	}

}
