public class Unique{


	public static boolean unique(int []arr){
			

		boolean flag = false;

		
		for(int i=0;i<arr.length;i++){
			int check = arr[i];
			for(int j=i+1;i<arr.length;i++){
				
				if(check==arr[j]){
					flag = true;
				}	
			}
		}

		return flag;


	}



}