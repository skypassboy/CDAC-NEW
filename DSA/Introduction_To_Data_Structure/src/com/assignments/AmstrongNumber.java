package com.assignments;

public class AmstrongNumber {
	
	
	public static int power(int base,int index) {
		int res = 1;
		
		for(int i=1;i<=index;i++) {
			res = res*base;
		}
		return res;
	}
	
	public static int countDigits(int no) {
		
		int cnt=0;
		while(no!=0) {
			int mod = no%10;
			cnt++;
			no = no/10;
		}
		return cnt;
	}
	public static int base(int no) {

			int mod = no%10;
//			
		
			return mod;
	}
	
	
	public static boolean isAmstrong(int no) {
		
		int originalNo=no;
		int sum = 0;
		int cnt=countDigits(no);
		
//		while(no>=0)
//		{
//			mod=no%10;
//			sum=sum+power(mod,cnt);
//			no=no/10;
//		}
		for(int i=1;i<=cnt;i++) {
			sum = sum+power(base(no),cnt);
			no = no/10;
		}
		if(sum==originalNo) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<=10000;i++)
		{
			if(isAmstrong(i)) {
				System.out.println(i);
			}
		}

	}

}
