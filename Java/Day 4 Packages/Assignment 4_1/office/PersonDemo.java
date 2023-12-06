import office.utility.Date;
import office.staff.Person;

public class PersonDemo{


	public static void main(String [] args){
	
		Person p1 = new Person();
		p1.display();

		System.out.println("*****************************");
		
		Person p2 = new Person("Ritesh",new Date(12,12,2023));
		p2.display();


	}



}

