class Counter{
	static int count = 0;
	Counter(){
		System.out.println("Counter object created!");
		count += 1;
	}
	
	public static void showCount(){
		System.out.println("No of objects created : "+ count);
	}
}

class Test{
	public static void main(String args[]){
		Counter s1,s2,s3;
		s1 = new Counter();
		s2 = new Counter();
		s3 = new Counter();
		System.out.println(Counter.count);
		Counter.showCount();
	}
}