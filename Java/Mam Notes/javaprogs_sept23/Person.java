public class Person 
{
	//non-static - reference 
	private String name;
	private Date bdate;
	
	public Person()
	{
	     //don't keep name and bdate null
	     //name = new String("Not assigned");
	     name = "Not assigned";
	     bdate = new Date(1,1,1970);		
	}

	public Person(String name, int dd,int mm, int yy)
	{
	      this.name = name;
	      this.bdate = new Date(dd,mm,yy);		
	}
	public void display()
	{
	    System.out.println("Name : "+name);
	    if(bdate != null)
	    {	
	    	System.out.println("Birthdate : ");
	    	bdate.display();		
	    }	
	}

        public String getName() 
        {
		return name;
        }

        public void setName(String name)
	{
	    this.name = name;
	}



}