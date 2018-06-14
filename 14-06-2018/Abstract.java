abstract class NumOperation{
	abstract int operation(int a,int b);
}


class Arithmetic extends NumOperation{
	//private int a,b;
	public int operation(int a,int b){
		return a+b;
	}
}

class Logical extends NumOperation{
	public int operation(int a,int b){
		return (a & b);
	}
}

class Test{
	public static void main(String args[]){
		/***NumOperation obj;
		obj = new Arithmetic();
		int result1 = obj.operation(3,5);
		obj = new Logical();
		int result 2 = obj.operation(4,5);		
		***/
		Arithmetic art = new Arithmetic();
		Logical log = new Logical();
		System.out.println(art.operation(4,5));
		System.out.println(log.operation(1,5));
	}	
}