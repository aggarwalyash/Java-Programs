/***
When we want to keep the signature same but different implementation in different classes (abstract method)
Abstract method must reside inside abstract class.
Abstract method does not have body.
Abstract class can contain abstract method,non-abstract method,combination of both ,can be empty.
Abstract class cannot be instantiated(no object can be created for Abstract class).
Abstract class can contain constructor,main method.
Abstract class (non-concrete)
Normal class (concrete)
***/

------------------------------------------------------------------------------------------------------------

abstract class Employee{
	abstract void work();
}

class Manager extends Employee{
	public void work(){                              // need  to implement work() method
		S.O.P("Manager resourrces");
	}
}

abstract class Engineer extends Employee{
	// not necessary to implement work() method 
}

------------------------------------------------------------------------------------------------------------