public class PrimeDemo{


	public static boolean checkPrime(int no){
		
	
		if(no<2){
			return false;
		}
		else{
			int count=0;

			for(int i=1;i<=no;i++){
				if(no%i==0){
					count++;
				}
			}
			
			if(count>2){
				return false;
			}
			else{
				return true;
			}	
	}	
}	
	public static void main(String args[]){
	

		int count=0;
		for(int i=10;i<100;i++){
			if(checkPrime(i)){
				count++;
				System.out.println(i);
				System.out.print("");
			}	
		}
		System.out.println("Count is : " + count);

	
	}

}
