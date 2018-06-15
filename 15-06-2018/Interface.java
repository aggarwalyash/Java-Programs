//Interface can contain method definitions (default/static keyword) according to JDK 1.7 specificstions.

// path="c:\Program Files\Java\jdk1.8.0_45\bin"        --> to set path

interface I{
	void m1();				//public
	default void m2(){}                    //not public
	static void m3(){}			//not public
} 

class A implements I{
	public void m1(){}
}

class Test{
	static public void main(String args[]){
		A obj = new A();
		obj.m1();
		obj.m2();
		I.m3();
	}
}