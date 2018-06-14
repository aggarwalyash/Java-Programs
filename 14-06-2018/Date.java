class Date{
	private int day;
	private int month;
	private int year;

	public void initDate(int day,int month,int year){
		this.day = day;
		this.month = month;
		this.year = year;
		display();
	}
	public void display(){
		System.out.println(day+" /"+month+" /"+year);
	}
}

class Test{
	public static void main(String args[]){
		Date d = new Date();
		d.initDate(12,09,1997);
	}
}