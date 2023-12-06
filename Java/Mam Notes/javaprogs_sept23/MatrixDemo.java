import java.util.Scanner;
public class MatrixDemo
{
   public static void main(String [] args)
   {
	int [][] matrix;
        matrix = new int[3][3];
	Scanner sc = new Scanner(System.in);
	//accept elements from user
	for(int i=0;i<matrix.length;i++)
	{
	    for(int j=0;j<matrix[i].length;j++)
		matrix[i][j] = sc.nextInt();
	}

	//display matrix
 	for(int i=0;i<matrix.length;i++)
	{
	    for(int j=0;j<matrix[i].length;j++)
            {
		System.out.print(matrix[i][j]+" ");
	    }
	    System.out.println();	
         } 	            

	//take rowwise sum
	int [] rowsum;
	rowsum = new int[3];   //0,0,0
	for(int i=0;i<matrix.length;i++)
	{
	    for(int j=0;j<matrix[i].length;j++)
            {
		rowsum[i]+=matrix[i][j];
            }
        } 

	//display rowwise sum
	for(int i=0;i<rowsum.length;i++)
		System.out.println("sum of row "+(i+1)+" : "+rowsum[i]);
	
  
   }
}
