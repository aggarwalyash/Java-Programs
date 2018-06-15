/***
Create class Employee with fields id, name & basicSalary. 
Create subclass Manager with fields petrolAllowance, foodAllowance & otherAllowance. 
Create subclass MarketingExecutive with fields kilometersTravelled, tourAllowance & a fixed telephoneAllowance=2000.
Write methods to calculate netSalary & grossSalary in each class.
***/

class Employee{
	private int id;
	private String name;
	private double basicSalary;
	
	public void caculateGrossSalary(){
	}
	public void caculateNetSalary(){		
	}
}

class Manager extends Employee{
	private float petrolAllowance;
	private float foodAllowance;
	private float otherAllowance;

}

class MarketingExecutive extends Employee{
	private float kilometersTravelled;
	private float tourAllowance;
	final int telephoneAllowance=2000;
}