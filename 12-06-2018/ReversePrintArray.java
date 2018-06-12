class ReversePrintArray{
	public static void main(String args[]){
		int[] arr = {1,2,3,4,5,6,7,8};
		for(int i=arr.length-1;i>-1;i--){
			System.out.print(arr[i]+" ");
		}
	}
}