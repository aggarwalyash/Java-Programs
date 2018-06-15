interface Printable{
	void print(); 
}

class Employee{
	public void print(){
		System.out.println("Inside the employee");
	}
}

class Shape{
	void print(){
		System.out.println("Inside the shape");
	}

}

class Date{
	protected void print(){
		System.out.println("Inside the date");
	}

}