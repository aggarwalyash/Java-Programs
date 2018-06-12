public class ArmstrongNumber{
	
	public static void main(String args[]){
		int n = 343;
		int cpy = n;
		int out = 0;
		String strn = Integer.toString(n);
		strn = strn.length();
		while(cpy!=0){
			tmp = cpy%10;
			cpy = (int)cpy/10;
			out += Math.pow(tmp,strn);
		}
		if(out==n){
			System.out.println("YES");
		}
		else{
			 System.out.println("NO");
		}
	}
}