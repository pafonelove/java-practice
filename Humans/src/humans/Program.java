package humans;

class Human {
    Name n = new Name();
    Father f = new Father();
    int Height; 
    
    public String toString() {
    	if ((n.LastName == null) && (f.n.LastName != null)) {
    		n.LastName = f.n.LastName;
    	}
    	
    	if ((n.Patronymic == null) && (f.n.FirstName != null)) {
    		n.Patronymic = f.n.FirstName + "ович";
    	}
    	
        return n + ", рост: " + Height;
    }
}

class Name {
    String LastName;
    String FirstName;
    String Patronymic;
    
    public String toString() {
        if ((LastName == null) && (Patronymic == null)) {
            return FirstName; 
        } else if (LastName == null) {
            return FirstName + " " + Patronymic;
        } else if (Patronymic == null) {
            return FirstName + " " + LastName;
        } else {
            return FirstName + " " + Patronymic + " " + LastName;
        }
    }
}

class Father {
    Name n = new Name();
}

public class Program {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.Height = 180;
        h1.n.FirstName = "Иван";
        h1.n.LastName = "Чудов";
        
        Human h2 = new Human();
        h2.Height = 175;
        h2.n.FirstName = "Петр";
        h2.n.LastName = "Чудов";
        
        Human h3 = new Human();
        h3.Height = 182;
        h3.n.FirstName = "Борис";
        
        h2.f.n.FirstName = h1.n.FirstName;
        h2.f.n.LastName = h1.n.LastName;
        
        h3.f.n.FirstName = h2.n.FirstName;
        h3.f.n.LastName = h2.n.LastName;
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }
}