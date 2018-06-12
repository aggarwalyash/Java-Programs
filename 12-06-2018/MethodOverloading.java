class Arithmetic{
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(float a,float b){
		System.out.println(a+b);
	}
	void add(float a,int b){
		System.out.println(a+b);
	}
}

class Test{
	public static void main(String args[]){
		Arithmetic obj = new Arithmetic();
		obj.add(14,16);
		obj.add(12.0f,13.0f);
		obj.add(12.0f,45);
	}
}