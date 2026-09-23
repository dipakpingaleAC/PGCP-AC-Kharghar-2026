
public class AllQuestions {
	
	
	public void seventhNumber() {
		System.out.println("Seventh number from 1 to 200 are : ");
		int i;
		for(i=1;i<=200; i++) {
			if (i%7==0) {
			System.out.println(i+" ");
		
			}
	
		}
		
	}	
	
	
	public void question4() {
		System.out.println("\n");
		int i;
		for(i=0;i<5; i++) {
			for (int j=0; j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	
	
public void question5() {
	System.out.println("\n");
		int i;
		for(i=5;i>0; i--) {
			for (int j=i; j>0;j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}



public void question6() {
	System.out.println("\n");
	int i;
	int k=1;
	for(i=1;i<=4;i++) {
		
		for (int j=1; j<=i;j++) {
			
			
			System.out.print(k+" ");
			
			
			k++;
		}
		System.out.println();
	}
}

public void question7() {
	System.out.println("\n");
	for (int i=1; i<=6; i++) {
		for (int j=1; j<=i; j++) {
			
			System.out.print(j);
		}
		System.out.println();
	}
}

public void question8() {
	System.out.println("\n");
	for (int i=6; i>=1; i--) {
		for (int j=1; j<=i; j++) {
			
			System.out.print(j);
		}
		System.out.println();
	}
}
	

	public static void main(String[] args) {
		

		AllQuestions obj=new AllQuestions();
		obj.seventhNumber();
		
		obj.question4();
		obj.question5();
		obj.question6();
		obj.question7();
		obj.question8();
	}

}
