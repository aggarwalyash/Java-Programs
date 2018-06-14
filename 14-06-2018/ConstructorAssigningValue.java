class Date{
	private int day;
	private int month;
	private int year;
	Date(){}
	Date(int day, int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
}

class Test{
	public static void main(String args[]){
		Date d = new Date(12,3,2197);
		System.out.println(d.day+"/"+d.month+"/"+d.year);
	}
}