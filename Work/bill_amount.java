class Bill{
	float unitPrice;
	float GST;

	Bill(float unitPrice,float GST){
		this.unitPrice = unitPrice;
		this.GST = GST;
	}

	public float billAmount(int noOfUnits){
		float gstPerUnit = (GST/100)*unitPrice;
		float pricePlusGST = unitPrice + gstPerUnit;
		return(pricePlusGST*noOfUnits); 
	}

	public void display(String message,float value){
		System.out.println(message+value);		
	}
}

class Calculate{
	public static void main(String args[]){
		Bill bill = new Bill(100.0f,12.0f);
		int noOfUnits = 5;
		float billAmount = bill.billAmount(noOfUnits);
		bill.display("Unit Price of Item: ",bill.unitPrice);
		bill.display("GST per unit (%): ",bill.GST);
		bill.display("No. of units: ",noOfUnits);
		bill.display("Unit Price + GST: ",billAmount/noOfUnits);
		bill.display("Total price: ",billAmount);
	} 
}
