package cat;

class Cat {
	String Name;
	
	Cat (String name) {
		Name = name;
	}
	
	public String toString() {
		return "���: " + Name;
	}
	
	public void Meow() {
		System.out.println(Name + ": ���!");
	}
	
	public void MeowN(int n) {
		for (int i = 0; i < n; i++) {
			if (i == n-1 ) {
				System.out.print("���");
			} else {
				System.out.print("���-");
			}			
		}
		System.out.println("!");
	}
}

public class Program {

	public static void main(String[] args) {
		Cat c = new Cat("������");
		c.Meow();
		c.MeowN(3);
	}

}
