package entities;

public class Student implements Comparable<Student> {
	int sid;
	String sname;
	float percent;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String sname, float percent) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.percent = percent;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getPercent() {
		return percent;
	}
	public void setPercent(float percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", percent=" + percent + "]";
	}
	@Override
	public int compareTo(Student o) {
		// comparison between this and o
		int diff = 0;
		if(this.percent > o.percent)
			diff = 1 ;
		else if(this.percent < o.percent)
			diff = -1;
		else if(this.percent == o.percent)
		{
			diff = this.sname.compareTo(o.sname);
			if(diff == 0)
				diff = this.sid - o.sid;
		}
		return diff;			
		
	}
	
	
	
}
