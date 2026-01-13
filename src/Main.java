import java.util.*;

public class Main {
	
	EmployeeService service = new EmployeeService();
	static boolean ordering =true;
	public static void  menu() {
		System.out.println("******************Welcome To Employee Management Syatem ******************"
				+ "\n1.Add Employee"
				+"\n2.View Employee"
				+"\n3.Update Employee"
				+"\n4.Delete Employee"
				+"\n5.View all Employees"
				+"\n6.Exist");
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		EmployeeService service = new EmployeeService();
		do {
			menu();
			System.out.println("Enter Your Choice");
			int Choice=s.nextInt();
			switch(Choice) {
			
			case 1:
				System.out.println("Add Employee");
				service.addemp();
			break;
			case 2:
				System.out.println("View Employee");
				service.viewEmp();
			break;
			case 3:
				System.out.println("Update Employee");
				service.updateemps();
			break;
			case 4:
				System.out.println("Delete Employee");
				service.deleteemp();
			break;
			case 5:
				System.out.println("View all Employees");
				service.viewAllemps();
			break;
			case 6:
				System.out.println("Thank you for using application!!!!");
				System.exit(0);
			
			default:
				System.out.println("please enter vaild choice");
			break;
			}
			
		}while (ordering);

	}

}
