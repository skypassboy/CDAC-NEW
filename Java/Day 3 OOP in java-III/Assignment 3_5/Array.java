
public class Array{



	public void maxMin(int []arr){
	
		int max = arr[0];
		int min = arr[0];
		int sum= 0;

		
		for(int i=0;i<arr.length;i++){
			

			sum  += arr[i];

			if(max<arr[i]){
				max =  arr[i];
			}
			if(min>arr[i]){
				min = arr[i];
			}
		}
		
		
		System.out.println("Max in array : " + max);
		System.out.println("Min in array : " + min);
		System.out.println("Average is : " + (sum/arr.length));

		
	} 



}