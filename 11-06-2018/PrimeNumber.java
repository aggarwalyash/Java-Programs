public class PrimeNumber{
	public static void main(String[] args){
		int n = 100;
		for(int i=1;i<=100;i++){
			int count = 0;
			int tmp = (int) (Math.sqrt(i) + 1.0);
			for(int j=1;j<=tmp;j++){
				if(i%j==0){
					count += 1;
				}
			}
			if(count==2){
				System.out.println("Prime number: "+i);
			}
		}
	}
}