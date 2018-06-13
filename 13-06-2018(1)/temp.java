/*** we cannot use super inside static context ***/

class Employee{
	void work(){
		System.out.println("Employee attends work");
	}
	void getSalary(){}
}

class Manager extends Employee{
	void work(){                        // here access modifier can be public,protected,default (according to Ist important points).
		System.out.println("Manager manages resources.");
	}
	void getBonus(){}
}


class Test{

	public static void main(String args[]){
		Employee emp = new Employee();
		emp.work();                      // Employee's work
		emp.getSalary();

		Manager mgr = new Manager();
		mgr.work();                      // Manager's work
		mgr.getSalary();
		mgr.getBonus();

//memp is runtime time of Manager
		Employee memp = new Manager();      //stack reference of employye class and when running heap allocation of manager class.
		memp.work();               //Manager's work()
		memp.getSalary();          
		memp.getBonus();           // Error
	}

}

---------------------------------------------------------------------------

/*** such object can access all the members of parent class but it cannot access exclusive member of child class  ***/

Employee memp = new Manager();     //constructor of child.