class VSA {
	void showListItems(String name,int i,int...param){
		System.out.println(name+" ");
		System.out.println(i+" ");
		for(int j: param ){
			System.out.print(j+" ");
		}
		System.out.println();
	}
}

class Test{
	public static void main(String args[]){
		VSA obj = new VSA();
		obj.showListItems("DAG",3);
		obj.showListItems("XyZ",1,2,4,54,5);
		int[] arr = {2,4,54,5};
		obj.showListItems("XyZ",1,arr);
	}
}