import java.util.Scanner;
public class Main
{


	public static void main(String[] args) {
	
		int i,n1,n2;
	    int a[]={1,2,3,4,5};
		
		
		try{ 
			Scanner b1=new Scanner(System.in);
		System.out.println("Enter a no. n1:");
		n1=b1.nextInt();
			System.out.println("Enter a no. n2:");
		n2=b1.nextInt();
			System.out.println("  array: ");
		i=b1.nextInt();
		System.out.println("\n array elements index ["+i+"]is:"+a[i]);
		
	System.out.println("Division of 2 no." +(n1/n2));
		}
		
	
	catch(ArithmeticException e){
		System.out.println("Arithmatic exception error Caught!!!\nDivide by zero error.\n check your n2.");
		
	}
    
	catch(ArrayIndexOutOfBoundsException e){
	    System.out.println("ArrayIndexOutOfBounds Exception Caught!!!\n Check the array");
	}
	catch(Exception n){
	    System.out.println("Number format exceptionCaught!!!\nuse Integer value");
	    
	    
	}
	System.out.println("End of exception handling!!!");
	}
}

	



