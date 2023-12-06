public class Person{

	private String name;
	private Date bdate;
	
	public Person(){
		this.name = "-";
		this.bdate = new Date();
	}
	
	public Person(String name, Date bdate){
		
		this.name = name;
		this.bdate = bdate;
		
	}

	public void display(){
		System.out.println("Name : "+ name);
		
		if(bdate!=null)
		System.out.print("Birth Date : ");
		bdate.showDate();
		
	}
	
	

}