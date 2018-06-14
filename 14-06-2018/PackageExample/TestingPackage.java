import p1.Package;

class TestingPackage{
	public static void main(String args[]){
		Package obj = new Package();
		String message = obj.sayHello();
		System.out.println(message);
	}	
}