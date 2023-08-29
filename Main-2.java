import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
	    System.out.println("Exception Handling");
	    System.out.println("1.Array index out of bound \n 2.Divide by zero \n 3.Number format");
	    int cont,choice;
	    do
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter your choice");
	        choice=sc.nextInt();

        switch(choice)
	    {
	        case 1:
	            {
	                int [] a={1,2,3,4,5};
	                System.out.println("Array elements are");
	                System.out.println(Arrays.toString(a));
	                Scanner s=new Scanner(System.in);
	                System.out.println("Enter the index");
	                try 
	                {
	                int element=s.nextInt();
	                System.out.println("Element is " + a[element]);
	                }
	                catch(ArrayIndexOutOfBoundsException e)
	                {
	                    System.out.println("Index entered is not valid");
	                    System.out.println("Enter index from 0 to 4");
	                }
	                break;
	            }
	         case 2:
	             {
	                 int a,b;
	                 Scanner scan=new Scanner(System.in);
	                 System.out.println("Enter first number");
	                 a=scan.nextInt();
	                 System.out.println("Enter second number");
	                 b=scan.nextInt();
	                 try
	                 {
	                     int result = a/b;
	                     System.out.println("Result is " + result);
	                 }
	                 catch(ArithmeticException e)
	                 {
	                     System.out.println("Denominater can't be zero");
	                 }
	                 break;
	             }
	         case 3:
	             {
	                 String num2,num3;
	                 int num1,num4;
	                 Scanner c=new Scanner(System.in);
	                 System.out.println("Enter first number");
	                 num2=c.nextLine();
	                 System.out.println("Enter second number");
	                 num3=c.nextLine();
	                 try
	                 {
	                     num1=Integer.parseInt(num2);
	                     System.out.println("Value is " + num1);
	                     num4=Integer.parseInt(num3);
	                     System.out.println("Value is " + num4);
	                     int sum=num1+num4;
	                     System.out.println("Result is " + sum);
	                 }   
	                 catch(NumberFormatException e)
	                 {
	                     System.out.println("This is not a number");
	                     System.out.println("Please enter valid integer");
	                 }
	                 break;
	             }
	    }
	    System.out.println("Enter 0 for exit and 1 for continue");
	    Scanner c=new Scanner(System.in);
	    cont=c.nextInt();
	    }while(cont==1);
	}
}