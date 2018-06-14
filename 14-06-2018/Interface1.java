interface PrintMedia{
	void publishNews();
}

interface SocialMedia{
	void updateStatus();
}

class Internet implements PrintMedia,SocialMedia{
	public void publishNews(){
		System.out.println("News are published");
	}
	public void updateStatus(){
		System.out.println("News status updated");	
	}
} 

class Test{
	public static void main(String[] args){
		Internet internet = new Internet();
		internet.publishNews();
		internet.updateStatus();
	}
}