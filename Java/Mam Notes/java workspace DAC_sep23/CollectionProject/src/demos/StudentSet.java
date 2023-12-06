package demos;
import java.util.*;
import entities.*;
public class StudentSet {

	public static void main(String[] args) {
		Set<Student> sts = new TreeSet<>();
		sts.add(new Student(45,"bbb",89.87f));
		sts.add(new Student(12,"xxx",89.98f));
		sts.add(new Student(56,"vvv",78.65f));
		sts.add(new Student(34,"bbb",89.87f));
		sts.add(new Student(23,"xxx",67.80f));
		sts.add(new Student(98,"fff",69.50f));
		sts.add(new Student(21,"hhh",76.85f));
		sts.add(new Student(90,"uuu",59.30f));
		
		for(Student s : sts)
			System.out.println(s);
		

	}

}
