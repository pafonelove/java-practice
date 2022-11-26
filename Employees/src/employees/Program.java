package employees;
import java.util.Arrays;

class Employee {
	String Name;
	Department d = new Department();
	
	public String toString() {
		if (d.Chief) {
			return Name + " - �������� ������ " + d.Name;
		}
		return Name + " �������� � ������ " + d.Name + ", ��������� �������� " + d.ChiefName;
	}
}

class Department {
	String Name;
	boolean Chief = false;
	String ChiefName;
	String[] people = new String[3];
}

public class Program {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.Name = "������";
		e1.d.Name = "IT";
		e1.d.ChiefName = "������";
		e1.d.people[0] = e1.Name;

		Employee e2 = new Employee();
		e2.Name = "������";
		e2.d.Name = "IT";
		e2.d.Chief = true;
		e1.d.people[1] = e2.Name;
		
		Employee e3 = new Employee();
		e3.Name = "�������";
		e3.d.Name = "IT";
		e3.d.ChiefName = "������";
		e1.d.people[2] = e3.Name;
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(Arrays.toString(e1.d.people));
	}

}
