import static java.lang.Math.*;

abstract class Shape{
	abstract void area(int a,int b);
}

class Rectangle extends Shape{
	public void area(int a,int c){
		System.out.println(a*c);
	}
}

class Circle extends Shape{
	public void area(int a,int c){
		System.out.println(PI*c*c);
	}
}

class Test{
	public static void main(String args[]){
		Shape r,c; 
		r = new Rectangle();
		c = new Circle();
		r.area(3,5);
		c.area(1,2);
	}
}