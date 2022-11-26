package towns;

class Town {
	String Name;
//	String 
	
//	public void PrintWays() {
//		for (int i = 0; i < ways[6].length; i++) {
//			for (int j = 0; j < ways[2].length; i++) {
//				System.out.println(ways[i][j]);
//			}
//			
//		}
//	}
	
	public String toString() {
		return Name + ". Связанные города: \n";
	}
}



public class Program {

	public static void main(String[] args) {
		Town t1 = new Town();
		t1.Name = "A";
		
		Sout("hello");
	}

}
