public class Student {


	private int id;
	private float percentage;

	public Student(){
	
	}
	
	public Student(int id,float percentage){
		
		this.id = id;
		this.percentage = percentage;
		
	}
	
	public void grade(){
		

		if(percentage>90){
			System.out.println("Excellent...");
		}
		else if(percentage<=90 && percentage>80){
			System.out.println("Very Good...");
		}
		else if(percentage<=80 && percentage>70){
			System.out.println("Good...");
		}
		else if(percentage<=70 && percentage>60){
			System.out.println("Average...");
		}
		else if(percentage<=60 && percentage>=40){
			System.out.println("Pass...");
		}
		else if(percentage<40 && percentage>=0){
			System.out.println("Fail...");
		}
	}

}