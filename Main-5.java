		System.out.print("\t\t");
		System.out.print(net_salary);
		System.out.println("\n");
	}
	
}
class asistance_project_manger extends employee_27051{
	double basic_pay=50000;
	double gross_salary;
	double net_salary;
	
	
	public void calculate() {
		gross_salary=basic_pay+(basic_pay*0.97);
		net_salary=gross_salary-(basic_pay*0.12)-(basic_pay*0.10)-(basic_pay*0.01);
	}
	public void display() {
		int i=1;
		System.out.println("Sr.\t\tName\t\tEmployee ID\t\tPhone Number\t\tEmail ID\t\tBasic Pay\t\tNet Salary");
		System.out.print(i+"\t\t");
		System.out.print(name);
		System.out.print("\t\t");
		System.out.print(Id);
		System.out.print("\t\t");
		System.out.print(PH_number);
		System.out.print("\t\t");
		System.out.print(Email_ID);
		System.out.print("\t\t");
		System.out.print(basic_pay);
		System.out.print("\t\t");
		System.out.print(net_salary);
		System.out.println("\n");
	}
	
}
class project_manger extends employee_27051{
	double basic_pay=150000;
	double gross_salary;
	double net_salary;
	
	
	public void calculate() {
		gross_salary=basic_pay+(basic_pay*0.97);
		net_salary=gross_salary-(basic_pay*0.12)-(basic_pay*0.10)-(basic_pay*0.01);
	}
	public void display() {
		int i=1;
		System.out.println("Sr.\t\tName\t\tEmployee ID\t\tPhone Number\t\tEmail ID\t\tBasic Pay\t\tNet Salary");
		System.out.print(i+"\t\t");
		System.out.print(name);
		System.out.print("\t\t");
		System.out.print(Id);
		System.out.print("\t\t");
		System.out.print(PH_number);
		System.out.print("\t\t");
		System.out.print(Email_ID);
		System.out.print("\t\t");
		System.out.print(basic_pay);
		System.out.print("\t\t");
		System.out.print(net_salary);
		System.out.println("\n");
	}
	
}
public class Main {

	public static void main(String[] args) {
		int sel;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the choice");
		System.out.println("\n 1.Programmer\n2.Team Lead\n3.Asitant project Mansger\n4.Project Manager");
		sel=sc.nextInt();
		if(sel==1) {
			programer emp =new programer();
			emp.input();
			emp.calculate();
			emp.display();
		}
		
		else if (sel==2) {
			team_lead emp =new team_lead();
			emp.input();
			emp.calculate();
			emp.display();
		}
		else if (sel==3) {
			asistance_project_manger emp =new asistance_project_manger();
			emp.input();
			emp.calculate();
			emp.display();
		}
		else if (sel==4) {
			project_manger emp =new project_manger();
			emp.input();
			emp.calculate();
			emp.display();
		}

	}

}