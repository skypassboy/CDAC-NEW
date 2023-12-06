public class Address{

	
	private String area;
	private String city;
	private String pincode;

	public Address(){
		area = "-";
		city = "-";
		pincode = "-";
	}
	
	public Address(String area, String city,String pincode){
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}

	public void display(){
		System.out.println("area : "+ area);
		System.out.println("City : "+ city);
		System.out.println("Pincode : "+ pincode);
	}


}