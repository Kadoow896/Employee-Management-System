import java.io.Serial;

public class Employee {
	
	private int id;
	private String name;
	private int age ;
	private String desiganation ;
	private String department;
	private double salary ;
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id=id;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age=age;
	}
	public String getdesiganation() {
		return desiganation;
	}
	
	public void setdesiganation(String desiganation) {
		this.desiganation=desiganation;
	}
	public String getdepartment() {
		return department;
	}
	
	public void setdepartment(String department) {
		this.department=department;
	}
	public double getsalary() {
		return salary;
	}
	
	public void setsalary(double salary) {
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", desiganation=" + desiganation
				+ ", department=" + department + ", salary=" + salary + "]";
	}
	
	public Employee (int id ,String name,int age,String desiganation,String department,double salary ) {
		super();
		this.id=id;
		this.age=age;
		this.department=department;
		this.name=name;
		this.desiganation=desiganation;
		this.salary=salary;
	}
	
	
	

}
