class Employee{
	static int noOfEmployees;
	int employee_id;
	String employee_name;
	float employee_salary;

	/***Employee(){
		noOfEmployees++;
		employee_id = noOfEmployees;	
	}***/
	Employee(String name,float salary){
		employee_name = name;
		employee_salary = salary;
		noOfEmployees++;
		employee_id = noOfEmployees;
	}
/***
	public void addDetails(String name,float salary){
		employee_name = name;
		employee_salary = salary;
	}
***/
	public void display(){
		System.out.println("Employee ID: "+employee_id);
		System.out.println("Employee Name: "+employee_name);
		System.out.println("Employee Salary: "+employee_salary);
		System.out.println();
	}

	static{
		Employee.noOfEmployees = 0; 	
	}
}

class Information{
	public static void main(String args[]){
		int noOfEmployee = 10;
		Employee[] employees = new Employee[noOfEmployee];
		employees[0] = new Employee("ABC",15000.0f);
		employees[1] = new Employee("XYZ",25000.0f);
		employees[2] = new Employee("BCD",35000.0f);
		employees[3] = new Employee("CAZ",10000.0f);
		employees[4] = new Employee("RTY",35000.0f);
		employees[5] = new Employee("MNC",20000.0f);
		employees[6] = new Employee("TYU",25000.0f);
		employees[7] = new Employee("PQR",25000.0f);
		employees[8] = new Employee("ABC",5000.0f);
		employees[9] = new Employee("MNO",55000.0f);
		System.out.println("Employees Details:-");
		System.out.println("-----------------------------------------------\n");
		for(int i=0;i<noOfEmployee;i++){
			employees[i].display();		
		}
	}
}
