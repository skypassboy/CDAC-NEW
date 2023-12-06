package entities;

public class Customer {
	
	int cid;
	String cname;
	String city;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, String city) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.city = city;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
	}
	@Override
	public int hashCode() {
		int hc = 0;
		if(city.equalsIgnoreCase("pune"))
			hc = 10;
		else if(city.equalsIgnoreCase("mumbai"))
			hc = 20;
		else if(city.equalsIgnoreCase("delhi"))
			hc = 30;
		else
			hc = 40;
			
		return hc;	
	}
	@Override
	public boolean equals(Object obj) {
		//compare between this and obj
		boolean flag = false;
		if(obj instanceof Customer)
		{
			Customer c = (Customer)obj;
			//compare between this and c
			if(this.cid == c.cid && this.cname.equals(c.cname) && this.city.equals(c.city) )
				flag = true;
		}
		else
		{
			flag =false;
		}
		return flag;
	}
	
	
	
	

}
