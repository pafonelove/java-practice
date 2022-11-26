package lines;
import java.util.Arrays;

class Point {
	int X, Y;
	
	Point (int x, int y) {
		X = x;
		Y = y;
	}
	
	public String toString () {
		return "{" + X + ":" + Y + "}";
	}
}


class Line {
	Point P1;
	Point P2;
	
	int X1, Y1, X2, Y2;
	
	Line (Point p1, Point p2) {
		P1 = p1;
		P2 = p2;
	}
	
	Line (int x1, int y1, int x2, int y2) {
		X1 = x1;
		Y1 = y1;
		X2 = x2;
		Y2 = y2;
	}
	
	public String toString () {
		if ((P1 != null) && (P2 != null))
			return P1 + ", " + P2;
			
		return "{" + X1 + ":" + Y1 + "}" + ", " + "{" + X2 + ":" + Y2 + "}";
	}
	
	public void Distance() {
		System.out.println("P1P2 = " + (int) Math.sqrt(Math.pow((P2.X - P1.X), 2) + Math.pow((P2.Y - P1.Y),2)));
	}
}

//class BrokenLine {
//	Point[] points = new Point[4];
//	
//	public String toString() {
//		return "Линия ";
//	}
//}

public class Program {
    public static void main(String[] args) {
//        Point l1p1 = new Point(3, 5);
//        
//        Point l1p2 = new Point(25, 6);
//        
//        Point l1p3 = new Point(7, 8);
//        
//        System.out.println(l1p1);
//        System.out.println(l1p2);
//        System.out.println(l1p3);
        
    	Line l1 = new Line(new Point(1, 3), new Point(23, 8));
    	System.out.println(l1);
    	
    	Line l2 = new Line (5, 10, 25, 10);
    	System.out.println(l2);
    	
    	Line l3 = new Line (l1.P1.X, l1.P1.Y, l2.X2, l2.Y2);
    	System.out.println(l3);
    	
    	Line l4 = new Line(new Point(1, 1), new Point(10, 15));
    	l4.Distance();
    	
//    	BrokenLine l1 = new BrokenLine();
//        l1.points[0] = l1p1;
//        l1.points[1] = l1p2;
//        l1.points[2] = l1p3;
//        
//        Point l2p1 = l1p1;
//        
//        Point l2p2 = new Point();
//        l2p2.X = 2;
//        l2p2.Y = -5;
//        
//        Point l2p3 = new Point();
//        l2p3.X = 4;
//        l2p3.Y = -8;
//        
//        Point l2p4 = l1p3;
//        
//        BrokenLine l2 = new BrokenLine();
//        l2.points[0] = l2p1;
//        l2.points[1] = l2p2;
//        l2.points[2] = l2p3;
//        l2.points[3] = l2p4;
//        
//        System.out.println(l1 + Arrays.toString(l1.points));
//        System.out.println(l2 + Arrays.toString(l2.points));
//        
//        l1p1.X = 5;
//        l1p1.Y = 10;
//        
//        System.out.println(l1 + Arrays.toString(l1.points));
//        System.out.println(l2 + Arrays.toString(l2.points));
    }
}