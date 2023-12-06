import java.util.Scanner;
public class ArrayDemo
{
   public static void main(String [] args)
   {
	int n;
	//System.out.println("Value of n : "+n);
	System.out.println("*************");

	int [] arr;  //just a reference creation
	arr = new int[5];  //memory allocated
  	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	System.out.println("*************");
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
	    System.out.println("Enter value for "+(i+1)+" element : ");
	    arr[i] = sc.nextInt();	
	}
        for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	System.out.println("*************");

	System.out.println("Total : "+ sumOfArray(arr));
        System.out.println("*************");
	
   }
   public static int sumOfArray(int [] arr)
   {
	int sum = 0;
	for(int i=0;i<arr.length;i++)	
		sum+=arr[i];
	return sum;
   }	
   
}





