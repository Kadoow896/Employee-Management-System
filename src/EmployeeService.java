import java.util.*;

public class EmployeeService {
	
	HashSet<Employee> empset= new HashSet<Employee>();
	
	Employee emp1=new Employee(101,"Sara",24,"Developer","IT",25000);
	Employee emp2=new Employee(102,"Hind",26,"Tester","CO",57000);
	Employee emp3=new Employee(103,"Ahmed",20,"Dev0ps Eng","Admin",5000);
	Employee emp4=new Employee(104,"Joud",22,"System Eng","CO",7000);
	
	Scanner sc=new Scanner (System.in);
	boolean found=false;
	int id;
	String name;
	int age ;
	String desiganation;
	String department;
	double salary;
	
	public EmployeeService() {
		empset.add(emp1);
		empset.add(emp2);
		empset.add(emp3);
		empset.add(emp4);
		
	}
	//View all Employees 
	public void viewAllemps(){
		for(Employee emp:empset) {
			System.out.println(emp);
		}}
		//view emp based on there id 
		public void viewEmp() {
			
			System.out.println("enter id: ");
		id=sc.nextInt();
		for(Employee emp:empset) {
			if(emp.getid()==id) {
				System.out.println(emp);
				found=true;}
			}
		if(!found) {
			System.out.println("Employee with this id is not present ");}
		}
		//update the employees
		public void updateemps() {
			System.out.println("enter id :");
			id=sc.nextInt();
			boolean found=false;
			for(Employee emp:empset) {
				if (emp.getid()==id) {
					System.out.println("enter name :");
					name=sc.next();
					System.out.println("Enter new salary");
					salary=sc.nextDouble();
					emp.setname(name);
					emp.setsalary(salary);
					System.out.println("Updated details of employee are :"+emp);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Employee  is not present ");
			}
			else {
				System.out.println("Employee detalis updated successfully !!");
			}
		}
		//delete emp
		public void deleteemp() {
			System.out.println("enter id : ");
			id=sc.nextInt();
			boolean found=false;
			Employee empdaelet=null;
			for(Employee emp:empset) {
				if(emp.getid()==id ) {
					empdaelet=emp;
					 found=true;
				}
			}
			if(!found) {
				System.out.println("Employee  is not present ");
			}
			else {
				empset.remove(empdaelet);
				System.out.println("Employee deleted  successfully !!");
			}
			
		}
		//add an employee 
		public void addemp() {
			System.out.println("enter id : ");
			id=sc.nextInt();
			System.out.println("enter name : ");
			name=sc.next();
			System.out.println("enter age : ");
			age=sc.nextInt();
			System.out.println("enter desiganation : ");
			desiganation=sc.next();
			System.out.println("enter department : ");
			department=sc.next();
			System.out.println("enter salary : ");
			salary=sc.nextDouble();
			
			Employee emp=new Employee(id,name,age,desiganation,department,salary);
			
			empset.add(emp);
			System.out.println(emp);
			System.out.println("Employee added  successfully !!");
		}
		}
	


