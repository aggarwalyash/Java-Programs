class Employee{
	int id;
	String name;

// this() is used to call the local constructor
//super() is used to call the parent constructor
// this.member ()

	Employee(){
		this(0,null);               // call to parameterized constructor Employee(int id,String name)
		/***id = 0;
		name = null;  ***/
	}

	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}	
}

class Manager extends Employee{
	Manager(){
		//super();			// call to default constructor of parent class
		super(0,null);                // call to parameterized constructor of parent class
	}
}
