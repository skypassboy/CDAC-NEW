public class SearchDemo{




	public static void main(String [] args){
	


		int [] arr = {1,5,3,4,5};
		
		int key = 5;


		int res = Search.searchElement(key,arr);


		if(res!=-1){

			System.out.println("found with index " +" "+ res);

		}
		else if(res == -1){
			System.out.println("not found");
		}



	}










}