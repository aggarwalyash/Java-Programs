abstract class RBI{
	abstract double calInterest(float principle,float roi,int period);
}

class SBI extends RBI{
	public double calInterest(float principle,float roi,int period){
		return ((principle*roi*period)/100);
	}
}

class HDFC extends RBI{
	public double calInterest(float principle,float roi,int period){
		return ((principle*roi*period/100)+0.2);
	}
}

class Test{
	public static void main(String args[]){
		SBI sb = new SBI();
		System.out.println(sb.calInterest(32442.0f,12.0f,50));
		HDFC hd = new HDFC();
		System.out.println(hd.calInterest(32442.0f,12.0f,50));
	}
}

