//problem1
import java.util.Scanner; 

// Do not change class 'Main' code.
public class hh {

	public static void main(String[] args) {
		
		Person41 p1 = new Person41(); 
		p1.readInput(); 
		
		String p1Name = p1.getName();
		int p1Age = p1.getAge(); 
		int p1MonthBirth = p1.getMonthBirth();
		String p1MonthBirthName = p1.getMonthName();
		
		System.out.println(p1Name + " " + p1Age + " " + p1MonthBirth + " " + p1MonthBirthName); 
		System.out.println(p1.info());

	}

}

class Person41 {
	private String name;
	private int age;
	private int monthBirth;
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);
		name = keyboard.next();
		age = keyboard.nextInt();
		monthBirth = keyboard.nextInt();
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMonthBirth() {
		return monthBirth;
	}
	public String getMonthName() {
		switch (monthBirth){
		case 1:
			return "JAN";
		case 2:
			return "FEB";
		case 3:
			return "MAR";
		case 4:
			return "APR";
		case 5:
			return "MAY";
		case 6:
			return "JUN";
		case 7:
			return "JUL";
		case 8:
			return "AUG";
		case 9:
			return "SEP";
		case 10:
			return "OCT";
		case 11:
			return "NOV";
		case 12:
			return "DEC";
		default:
			return "ERROR";
		}
		
	}
	public String info() {
		return "[PERSON] name(" + name + ") age(" + age + ") month(" +  getMonthName() + ")";
		
	}

	
}

//problem2

public class hh {

  	// Do not change 'main' method code.
	public static void main(String[] args) {
		int a = 3, b = 5; 
		int c = add(a, b); 
		System.out.println(c);
		
		String s1 = "Seoul"; 
		String s2 = add(s1, a); 
		System.out.println(s2); 
		
		String s3 = "Korea"; 
		String s4 = add(s1, s3); 
		System.out.println(s4); 
	}
	
	static int add(int x, int y) {
		return x+y;
	}
	static String add(String x, int y) {
		return x+y;
	}
	static String add(String x, String y) {
		return x+y;
	}

}

//problem3
// Do not change class 'Main' code.
public class Hello2030 {

	public static void main(String[] args) {
		Book book1 = new Book(); 
		Book book2 = new Book("Son of God", "Mark Lee", 387); 
		Book book3 = new Book("Moon Flower", "Jenny Kim", 265); 
		Book book4 = new Book("Son of God", "Mark Lee", 387); 
		
		System.out.println("book1: " + book1); 
		System.out.println("book2: " + book2); 
		System.out.println("book3: " + book3); 
		System.out.println("book4: " + book4); 
		
		book1.setTitle("English Practice");
		book1.setAuthor("John Brown"); 
		book1.setNumPages(125); 
		
		System.out.println("book1: " + book1); 
		System.out.println("book1's author: " + book1.getAuthor()); 
		
		System.out.println("book2 equals book3? " + book2.equals(book3)); 
		System.out.println("book2 equals book4? " + book2.equals(book4)); 
	}

}

class Book {
	private String title;
	private String author;
	private int numPages;
	
	public String toString() {
		return("[BOOK] title("+title+") author("+author+") pages("+numPages+")");
	}
	
	
	public Book() {
		this.title = "no title";
		this.author = "noname";
		this.numPages = 0;
	}
	
	public Book(String title, String author, int numPages) {
		this.title= title;
		this.author = author;
		this.numPages = numPages;
		}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	public String getAuthor() {
		return author;
	}
	
	public boolean equals(Book otherBook) {
		return ((title.equals(otherBook.title))&&(author.equals(otherBook.author))&&(numPages == otherBook.numPages));
	}
	
}