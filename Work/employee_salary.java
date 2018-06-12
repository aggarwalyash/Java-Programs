class Employee{
	int employee_id;
	String employee_name;
	float basic_salary;
	static final int TA = 15000;

	Employee(int id,String name,float salary){
		employee_id = id;
		employee_name = name;
		basic_salary = salary;
	}

	public float grossSalary(float percentHRA,float percentDA){
		float hra = (percentHRA/100)*basic_salary;
		float da = (percentDA/100)*basic_salary;
		float gross_salary = basic_salary+hra+da+TA;
		return gross_salary;
	}

	public float netSalary(float percentPF,float percentPT,float grossSalary){
		float pf = (percentPF/100)*basic_salary;
		float pt = (percentPT/100)*basic_salary;
		float net_salary = grossSalary-pf-pt;
		return net_salary;
	}

	public void display(String message,float value){
		System.out.println(message+value);
	}
}

class Calculate{
	public static void main(String args[]){
		Employee emp = new Employee(1,"Yash",25000);
		float grossSalary = emp.grossSalary(2.5f,7.0f);
		emp.display("Gross Salary: ",grossSalary);
		float netSalary = emp.netSalary(6.5f,2.0f,grossSalary);
		emp.display("Net Salary: ",netSalary);
	}
}
