package j11.working.with.exceptions.ex05;

import java.io.File;

public class RTExceptionExamples {
	
    static int[] numbers = {10, 20, 30};
    
    public static void main(String[] args) {
    	
    	try {
    	
	    	// java.lang.ArrayIndexOutOfBoundsException
			for (int i = 0; i <= 3; i++) {
				System.out.println("number = " + numbers[i]);
			}
			
	    	// java.lang.ClassCastException
			Person p1;
			Object o1;
	    	Duck d1;
			
			p1 = new Person("John", 30, "Male");
			o1 = (Object) p1;
			d1 = (Duck) o1;
		}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println("ArrayIndexOutOfBoundsException CAUGTH!!");
		}catch(ClassCastException e) {
			System.out.println("ClassCastException CAUGTH!!");
		}
    	
		try {
	    	// java.lang.ArithmeticException
	    	int x = 0;
	    	int y = 10;
	    	
	    	System.out.println( y / x );
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException CAPTURADO!!");
		}
		
		try {
			String nomeNulo = null;
			new File(nomeNulo);
		}catch(NullPointerException e) {
			System.out.println("NullPointerException CAPTURADO!!");
		}
		
	}
    
}
