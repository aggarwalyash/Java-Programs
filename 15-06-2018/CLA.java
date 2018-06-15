/***
command line arguments
***/

class Test{
	public static void main(String[] args){
		String fname,lname;
		fname = args[0];
		lname = args[1];
		System.out.println("Name is: "+ fname+" "+lname);
		int a = Integer.parseInt(args[0]);           // casting works only in case of primitive to primitive types and object to object type
							     // otherwise we need proper conversion.
		int b = Integer.parseInt(args[1]);
		System.out.println("Sum is: "+a+b);
		System.out.println("Sum is: "+(a+b));
		System.out.println(args.length);
	}
}