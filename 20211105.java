//problem1
public class Main {

	public static void main(String[] args) {
		
		Point71 p1 = new Point71();
		Point71 p2 = new Point71(3, 5); 
		Point71 p3 = new Point71(); 
		p3.setXY(3,  5);
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2);
		System.out.println("p3: " + p3);
		System.out.println("p1.equals(p2) = " + p1.equals(p2)); 
		System.out.println("p1.equals(p3) = " + p1.equals(p3)); 
		System.out.println("p2.equals(p3) = " + p2.equals(p3)); 
		
		Shape71 s1 = new Shape71();
		Shape71 s2 = new Shape71("Second_Shape", new Point71(2, 3)); 
		Shape71 s3 = new Shape71("Third_Shape", p2);
		Shape71 s4 = new Shape71("Third_Shape", p2);
		System.out.println("s1: " + s1); 
		System.out.println("s2: " + s2); 
		System.out.println("s3: " + s3); 
		System.out.println("s1.equals(s2) = " + s1.equals(s2)); 
		System.out.println("s1.equals(s3) = " + s1.equals(s3)); 
		System.out.println("s3.equals(s4) = " + s3.equals(s4)); 
		System.out.println("s2.equals(p2) = " + s2.equals(p2)); 
		
		Circle71 c1 = new Circle71(); 
		Circle71 c2 = new Circle71("Circle_Two", new Point71(5, 4), 6);
		Circle71 c3 = new Circle71("Circle_Two", new Point71(5, 4), 6); 
		System.out.println("c1: " + c1); 
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3); 
		System.out.println("c2.equals(c3) = " + c2.equals(c3)); 
		System.out.println("c2.equals(s2) = " + c2.equals(s2)); 
		
		Polygon71 poly1 = new Polygon71(); 
		Polygon71 poly2 = new Polygon71("Poly_First", new Point71(3, 3), 5);
		Polygon71 poly3 = new Polygon71("Poly_Second", new Point71(4, 4), 6); 
		System.out.println("poly1: " + poly1); 
		System.out.println("poly2: " + poly2); 
		System.out.println("poly3: " + poly3); 
		System.out.println("poly1.equals(poly2) = " + poly1.equals(poly2)); 
		System.out.println("poly2.equals(poly3) = " + poly2.equals(poly3)); 	
		System.out.println("poly2.equals(s3) = " + poly2.equals(s3)); 
	}

}

class Point71{
	private int x;
	private int y;
	public Point71() {
		this.x=0;
		this.y=0;
	}
	public Point71(int a, int b) {
		this.x=a;
		this.y=b;
	}
	public void setXY(int a, int b) {
		this.x=a;
		this.y=b;
	}
	public String toString() {
		return "[Point] (" + this.x + ", " + this.y + ")";
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public boolean equals(Point71 other) {
		return (getX()==other.getX()&&getY()==other.getY());
	}
}

class Shape71{
	protected String center;
	protected int x;
	protected int y;
	protected Point71 p;

	public Shape71() {
		this.center = "noname";
		
	}
	public Shape71(String center, Point71 p) {
		this.center = center;
		this.x = p.getX();
		this.y = p.getY();
	}
	public String toString() {
		return "[Shape] " + this.center + " center: [Point] (" + this.x + ", " + this.y + ")" ;
	}
	public int setX() {
		return this.x;
	}
	public int setY() {
		return this.y;
	}
	
	public boolean equals(Shape71 other) {
		return (setX()==other.setX()&&setY()==other.setY());
	}
}

class Circle71 extends Shape71{
	protected int r;
	
	public Circle71() {
		this.center = "noname";
		this.x = 0;
		this.y = 0;
		this.r = 0;
	}
	public Circle71(String center, Point71 p, int r) {
		this.center = center;
		this.r = r;
		this.x = p.getX();
		this.y = p.getY();
		
	}
	public String toString() {
		return "[Shape] " + this.center + " center: [Point] ("+ this.x + ", " + this.y + ") [CIRCLE] radius: " + this.r;
	}
}

class Polygon71 extends Shape71{
	protected int n;
	
	public Polygon71() {
		this.center = "noname";
		this.x = 0;
		this.y = 0;
		this.n = 0;
	}
	public Polygon71(String center, Point71 p, int n) {
		this.center = center;
		this.n = n;
		this.x = p.getX();
		this.y = p.getY();
	}
	public String toString() {
		return "[Shape] " + this.center + " center: [Point] (" + this.x + ", " + this.y + ") [POLYGON] nVertex: " + this.n;
	}
}

//problem2
public class Main {

	public static void main(String[] args) {
		Parent72 p1 = new Parent72(); 
		Parent72 p2 = new Parent72(1); 
		Child72 c1 = new Child72(); 
		Child72 c2 = new Child72(2); 
		Child72 c3 = new Child72(3, 4); 
		GrandChild72 g1 = new GrandChild72(); 
		GrandChild72 g2 = new GrandChild72(11);
		GrandChild72 g3 = new GrandChild72(12, 13, 14); 
		
		System.out.println("p1: " + p1); 
		System.out.println("p2: " + p2);
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
		System.out.println("g1: " + g1);
		System.out.println("g2: " + g2);
		System.out.println("g3: " + g3);
		p1.hello();
		p2.hello();
		c1.hello();
		c2.hello();
		g1.hello(25);
		g2.hello(32);
		g3.hello(); 
	}

}

class Parent72{
	protected int x;
	
	public Parent72() {
		this.x=5;
	}
	public Parent72(int a) {
		this.x=a;
	}
	public String toString() {
		return "[PARENT] x = " + this.x;
	}
	public void hello() {
		System.out.println("Hello, friends!");
	}
}

class Child72 extends Parent72{
	protected int y;
	
	public Child72() {
		this.x =5;
		this.y = 7;
	}
	public Child72(int a) {
		this.x=5;
		this.y=a;
	}
	public Child72(int a, int b) {
		this.x = a;
		this.y = b;
	}
	public String toString() {
		return "[PARENT] x = " + this.x + " [CHILD] y = " + this.y;
	}
}

class GrandChild72 extends Child72{
	protected int z;
	
	public String toString() {
		return "[PARENT] x = " + this.x + " [CHILD] y = " + this.y + " [GRAND CHILD] z = " + this.z;
	}
	public GrandChild72() {
		this.x=5;
		this.y=7;
		this.z=9;
	}
	public GrandChild72(int a) {
		this.x=5;
		this.y=7;
		this.z=a;
	}
	public GrandChild72(int a, int b, int c) {
		this.x=a;
		this.y=b;
		this.z=c;
	}
	public void hello(int a) {
		System.out.println(a + " " + a + " " + a);
	}
	public void hello() {
		System.out.println("Hello, baby!");
	}
}