/***
	Scanner class for taking interactive input.
***/

import java.util.Scanner;
class Test{
	public static void main(String args[]){
		String fname,lname;
		Scanner scan = new Scanner(System.in);       // System.in -> from keyboard
		fname = scan.next();
		lname = scan.next();
		System.out.println(fname+" "+lname);
	}
}

//System.in     --> input to processor
//System.out	--> processor to output device(monitor)
//System.err	--> present error from processor to output device(monitor)


// scan.nextInt()  --> int
// scan.nextFloat() --> float