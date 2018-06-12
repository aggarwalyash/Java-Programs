class Misc{
	
	public static void main(String args[]){
		int i;
		int[] arr = {10,20,30,40,50,60,70,80,90,100};
		int j = arr.length-1;
		for(i=0;i<10;i++){
			if(i<5){
				System.out.print(arr[i]+" ");
			}
			else{
				System.out.print(arr[j]+" ");
				j--;
			}
		}
	}
}