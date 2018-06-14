package p1;                         // javac -d . filename will create package p1 inside the current directory

public class Package{                   // to be accesible outside class must be defined as public       // we can have only one public class and that classname must be same as file name
	public String sayHello(){
		return "Hello";
	}
}