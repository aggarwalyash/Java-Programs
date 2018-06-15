class Date implements Cloneable{
	private int day;
	private int month;
	private int year;
	
	Date(){}
	Date(int day,int month,int year){
		this.day = day; this.month = month; this.year = year;
	}	

	public Date clone() throws CloneNotSupportedException{
		Date dt = new Date(this.day,this.month,this.year);
		return dt;	
	}

	public void showDate(){
		System.out.println(day+"/"+month+"/"+year);
	}
}

class TestCloning{
	public static void main(String args[]){
		Date d1,d2; 
		d1 = new Date(12,6,1997);
		d2 = d1.clone();
		d1.showDate();
		d2.showDate();
	}
}
