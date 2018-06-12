class RootsQuadratic{
	public static void main(String args[]){
		double a=5,b=6,c=1;
		double d =  Math.sqrt(b*b-(4*a*c));
		System.out.println(d);
		double tmp1 = (-b+d)/(2*a);
		double tmp2 = (-b-d)/(2*a); 
		System.out.println("First root: "+ tmp1);
		System.out.println("Second root: "+ tmp2);		
	}	
}

