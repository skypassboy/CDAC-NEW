public class UniqueDemo{

	public static void main(String [] args){

		int [] arr = {10,20,40,30,50};
		

		boolean res;
		res = Unique.unique(arr);


		if(res==true){
			System.out.println("no");
		}
		else{
			System.out.println("yes");
		}


	}




}