class ThreeMax{
	public static void main(String[] args){
		int a=5,b=6,c=7;
		int max1 = a>b ? a:b;
		int max2 = max1>c ? max1:c;
		System.out.println(max2);
	}
}