			count=count+1;
		}
	}
	static void str()
	{
		String z=new String();
		int q,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your String");
		z=sc.nextLine();
		System.out.println("Your String is "+z);
		System.out.println("Enter the opertation you want to perform on String ");
		System.out.println("1.1 Palindrome or not");
		q=sc.nextInt();
		chk(q,z);
		
	}
	static void chk(int q, String z)
	{
		switch(q)
		{
			case 1:
				palindrome(z);
				break;
			default:
				System.out.println("Invalid Input!");
				break;
		}
	}
	static void palindrome(String z)
	{
		String q="";
		for(int i=(z.length()-1);i>=0;i--)
		{
			q=q+z.charAt(i);
		}
		
		if(z.equals(q))
		{
			System.out.println(z+"\tis Palindrome");
		}
		else
		{
			System.out.println(z+"\tis not Palindrome");
		}
	}
}