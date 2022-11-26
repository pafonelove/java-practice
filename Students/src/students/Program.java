package students;

class Student {
	String Name;
	int[] Marks = new int [3];
	
	public String toString () {
		return Name + ": " + Marks[0] + ", " + Marks[1] + ", " + Marks[2];
	}
}

public class Program {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.Name = "Vasily";
		s1.Marks[0] = 3;
		s1.Marks[1] = 4;
		s1.Marks[2] = 5;
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.Name = "Peter";
		s2.Marks = s1.Marks;
		s2.Marks[0] = 5;
		System.out.println(s1);
		System.out.println(s2);
		
		Student s3 = new Student();
		s3.Name = "Andrew";

		s3.Marks[0] = s1.Marks[0];
		s3.Marks[1] = s1.Marks[1];
		s3.Marks[2] = s1.Marks[2];
		
		s1.Marks[0] = 3;
		System.out.println(s1);
		System.out.println(s3);
	}

}
