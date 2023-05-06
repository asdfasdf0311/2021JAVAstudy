//problem1
// do not change class 'Main'
public class hh {
	public static void main(String[] args) {
		System.out.println(Class51.howMany());
		Class51 a = new Class51();
		Class51 b = new Class51(5); 
        System.out.println(b.howMany());
		Class51 c = new Class51(10); 
      	System.out.println(Class51.howMany());
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

// complete your class 'Class51'
class Class51 {
	private int x;
	private static int y=0;

  	// do not change method 'toString'
	public String toString() {
		return("" + x);
	}
	
	public Class51() {
		y++;
	}
	
	public Class51(int x) {
		y++;
		this.x=x+y;
	}
	
	public static int howMany() {
		return y;
	}
  
}

//problem2

// you should define 'main' method in 'Main' class.
import java.util.Scanner;
import java.util.StringTokenizer;

public class hh {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("[DICT]=");
		String str1 = "";
		String str2 = "";
		String str = "";
		int n=0;
		while (true) {
			str = keyboard.nextLine();
			
			if ((str.indexOf("add")==(-1))&&(str.indexOf("delete")==(-1))&&(str.indexOf("end")==(-1))) {
				System.out.println("wrong operator");
				System.out.println("[DICT]="+str2);
				continue;
			}
			if (str.equals("end")) {
				System.out.println("[DICT]="+str2);
				System.out.println("Bye");
				break; 
			}
			
			String delimiters = " ";
			StringTokenizer nameFactory = new StringTokenizer(str, delimiters);
			
			str1 = nameFactory.nextToken();
			String temp = nameFactory.nextToken();
			if (temp.equalsIgnoreCase("None"))
				temp = ""; //Empty string
			
			
			String firstLetter = temp.substring(0,1);
			String remainLetter = temp.substring(1);
			firstLetter = firstLetter.toUpperCase();
			remainLetter = remainLetter.toLowerCase();
			temp = firstLetter + remainLetter;
			
		
			switch (str1) {
			case "add":
				if ((str2.indexOf(temp)!=(-1))&&(n!=0)) {
					System.out.println("[DICT]="+str2);
					break;
				}
				str2 = str2+temp;
				System.out.println("[DICT]="+str2);
				break;
			case "delete":
				int index = str2.indexOf(temp); 
				if (index >= 0) {
					String strBack = str2.substring(index + temp.length());
					String strFront = str2.substring(0, index);
					str2 = strFront + strBack; 
				}
				System.out.println("[DICT]="+str2);
				break;
			default:
				System.out.println("wrong operator");
				System.out.println("[DICT]="+str2);
				break;
			}
			n++;
		}
	}
}

//problem3
// do not change class 'Main' code
public class hh {

	public static void main(String[] args) {
		
		Person53 p1 = new Person53("Jane", 45); 
		Person53 p2 = new Person53("Brown", 29); 
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(); 
		
		Book53 book1 = new Book53(); 
		Book53 book2 = new Book53("Sunday Morning", p1);
		Book53 book3 = new Book53(book2);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 
		System.out.println(); 
		
		p1.setName("Tom"); 
		p1.setAge(33);
		book2.setTitle("Sunset on the beach");
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 
		System.out.println(); 
		
		book1.setTitle("The load to Seoul");
		book1.setAuthor(p2);
		
		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3); 
	}
}

class Person53{
	private String name;
	private int age;
	
	public String toString() {
		return("[PERSON] name("+name+") age("+age+")");
	}
	public Person53(String name, int age) {
		this.name= name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person53(Person53 author) {
		name = new String(author.name);
		age = author.age;
	}
}

class Book53{
	private String title;
	private Person53 author;
	
	public String toString() {
		return("[BOOK] title("+title+") author("+author+")");
	}
	
	public Book53() {
		this.title = "noTitle";
		this.author = null;
	}
	public Book53(String title, Person53 author) {
		this.title = title;
		this.author = author;
	}
	
	public Book53(Book53 book) {
		title = new String(book.title);
		author = new Person53(book.author);
	}



	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(Person53 author) {
		this.author = author;
	}
}