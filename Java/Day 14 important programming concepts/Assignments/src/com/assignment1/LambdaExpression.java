package com.assignment1;

public class LambdaExpression{

	
	
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			//Runnable r = ()->{
				
				int num = 100;
				if(num==1) {
					 System.out.println("non-prime");
				}
				else {
					
					int count=0;
					boolean flag = false;
					
					for(int i=1;i<=num;i++) {
						if(num%i==0) {
							count++;
						}
					}
					
					if(count>2) {
						System.out.println("Non prime");
					}
					else {
						System.out.println("Prime");
					}
				
				}
	
			//};
		});
		
		t1.start();
		
	}

	

	


}
