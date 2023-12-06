import java.util.Scanner;
public class ArrayDemo{


	public static void main(String [] args){
	
		Scanner sc = new Scanner(System.in);
		int [] arr;
		arr = new int[5];

		for(int i=0;i<arr.length;i++){
		
			System.out.println("Enter Element "+""+ (i+1));
			arr[i] = sc.nextInt();

		}
		
		Array a1 = new Array();
		a1.maxMin(arr);
		
	

	}


}