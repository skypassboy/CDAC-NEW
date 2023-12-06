public class Prime{

	public static void main(String args[]){
		
		int no = 99;
		
		
		
		if(no<2){
			System.out.println("Not Prime");
		}
		else{
			int count=0;

			for(int i=1;i<=no;i++){
				if(no%i==0){
					count++;
				}
			}
			
			if(count>2){
				System.out.println("Not Prime...");
			}
			else{
				System.out.println("Prime...");
			}
				
		}

	
	}




}