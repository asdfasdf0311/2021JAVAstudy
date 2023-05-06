//problem1
public class Main {

	public static void main(String[] args) {
		People p1, p2, p3; 
		
		p1 = new Asian();
		p2 = new European(); 
		p3 = new African(); 
		
		introduceMe(p1);
		introduceMe(p2);
		introduceMe(p3);
	}
	
	static void introduceMe(People p) {
		p.introduce(); 
	}

}

abstract class People {
	public abstract void introduce(); 
}

class Asian extends People {
	public void introduce() {
		System.out.println("I'm Asian.");
	}
}

class European extends People {
	public void introduce() {
		System.out.println("I'm European."); 
	}
}

class African extends People {
	public void introduce() {
		System.out.println("I'm African.");
	}
}


//problem2
public class hello {

	public static void main(String[] args) {
		
		Book82 b1 = new Book82("Eternal dream", 3200); 
		Book82 b2 = new Book82("Healthier today", 2800); 
		ComicBook82 c1 = new ComicBook82("Micky mouse", 5400, 21); 
		ComicBook82 c2 = new ComicBook82("Donald duck", 6200, 17); 
		Novel82 n1 = new Novel82("Gone with the wind", 4200, 542); 
		Novel82 n2 = new Novel82("Summer night dream", 5600, 483); 
		
		System.out.println(b1.betterThan(c1));
		System.out.println(b1.betterThan(b2));
		System.out.println(c1.betterThan(null));
		System.out.println(c2.betterThan(c1));
		System.out.println(n1.betterThan(n2));
		System.out.println(n1.betterThan(b2));
	}
}
// your code for class Book82, ComicBook82, Novel82

class Book82{
	String name;
	protected int price;
	
	public Book82(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public String betterThan(Book82 other) {
		if (other == null) {
			return "Impossible comparison. other=null.";
		}
		else if (getClass() != other.getClass()) {
			return "Impossible comparison. different classes.";
		}
		else {
			if (other instanceof Book82) {
				Book82 b = (Book82) other;
				Book82 thisb = (Book82) this;
				if (thisb.price > b.price) {
					return thisb.name + " is better than " + b.name;
				}
				else {
					return b.name + " is better than " + thisb.name;
				}
			}
			else if (other instanceof ComicBook82) {
				ComicBook82 c = (ComicBook82) other;
				ComicBook82 thisc = (ComicBook82) this;
				if (thisc.cha > c.cha) {
					return thisc.name + " is better than " + c.name;
				}
				else {
					return c.name + " is better than " + thisc.name;
				}
			}
			else {
				Novel82 n = (Novel82) other;
				Novel82 thisn = (Novel82) this;
				if (thisn.page > n.page) {
					return thisn.name + " is better than " + n.name;
				}
				else {
					return n.name + " is better than " + thisn.name;
				}
			}
		}
		
	}
}

class ComicBook82 extends Book82{
	protected int cha;
	
	public ComicBook82(String name, int price, int cha) {
		super(name, price);
		this.cha = cha;
	}
}

class Novel82 extends Book82{
	protected int page;
	
	public Novel82(String name, int price, int page) {
		super(name, price);
		this.page = page;
	}
}
//problem3
public class Main {

	public static void main(String[] args) {
		
			Animal83[] animal = new Animal83[2]; 
			
			animal[0] = new Dog83("Tom", 3, "hunting"); 
			animal[1] = new Cat83("Jerry", 7, "yellow"); 
			printAnimalArray(animal); 
			
	}
		
    static void printAnimalArray(Animal83[] animal) {
			for (int i = 0; i < animal.length; i++) {
				System.out.print("animal[" + i + "] ");
				System.out.print(animal[i]); 
				System.out.println(" sound: " + animal[i].sound()); 
			}
	}
}
// your code for class Animal83, Dog83, Cat83

abstract class Animal83 {
	String name; 
	int age;
	
	public abstract String sound();
	
	public String toString() {
		return "name(" + name + ") center"; 
	}
}

class Dog83 extends Animal83 {
	String specialty;
	
	public Dog83(String name, int age, String specialty) {
		this.name = name; 
		this.age = age; 
		this.specialty = specialty;
	}
	
	public String sound() {
		return "wal-wal"; 
	}
	
	public String toString() {
		return "[DOG] name(" + this.name + ") age(" + this.age + ") specialty(" + this.specialty + ")"; 
	}
}

class Cat83 extends Animal83 {
	String color;
	
	public Cat83(String name, int age, String color) { 
		this.name = name;
		this.age =  age;
		this.color = color;
	}
	
	public String sound() {
		return "meow"; 
	}
	
	public String toString() {
		return "[CAT] name(" + this.name + ") age(" + this.age + ") color(" + this.color + ")"; 
	}
	
}
