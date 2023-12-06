public class Point{
	
	private int x,y;
	
	public Point(){
	
	}

	public Point(int x,int y){
		
		this.x = x;
		this.y = y;
	
	}
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	public void coordinates(){
		
		System.out.println("["+x+","+y+"]");
	
	}

}