/***

Conversion from primitive to object type
value-->object    //Boxing

Conversion from object to primitive 
object-->value   //Unboxing
***/

class Test{
	public static void main(String args[]){
		int x = 100;
		Integer newX = new Integer(x);      //Boxing
		x = newX.intValue();		// Unboxing
		int y = 200;
		Integer = newY = y;		//Autoboxing      -->introduced in jdk1.4
		y = newY;			//AutoUnboxing
		System.out.println(x);
		System.out.println(newX);
		System.out.println(y);
		System.out.println(newY);
	}	
}


/***
toString()   --> java.lang.Object
***/
// toString()

class Date{
	int day,month,year;	
	Date(){}
	Date(int d,int m,int y){date=d;month=m;year=y;}
	//@Override
	public String toString(){
		return day+"-"+month+"-"+year;
	}
}

class TestDate{
	public static void main(String[] ar){
		Date dt = new Date(12,9,78);
		System.out.println(dt);              //override toString() method of Object class
	}
}
