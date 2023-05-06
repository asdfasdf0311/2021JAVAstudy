//problem1
// Do not change class 'Main'
public class Main {

	public static void main(String[] args) {
		
		People61 people = new People61();
		
		people.add("Tom", 35);
		people.add("Jenny", 24);
		people.add("Brown", 21);
		people.add("John", 43);
		System.out.println(people); 
		
		people.delete(3);
		System.out.println(people); 
		
		people.delete(4); 
		System.out.println(people); 
		
		people.add("Brown", 21);		
		people.add("Teo", 9);
		people.add("Paul", 18);
		System.out.println(people); 
		
		people.modify(2,  "Lucy", 32);
		System.out.println(people); 
		
		people.delete(5);
		people.delete(4);
		people.delete(4);
		people.delete(3);		
		people.delete(1);		
		System.out.println(people); 
	}

}

class People61 {
	
	public static final int MAX_PERSON = 5;    // maximum number of persons 
	private int nPerson;  // current number of persons 
	private Person61[] person;  // Person61 array 
      
    // your code here
	
	public String toString() {
		String str = ""; 
		for (int i = 0; i < nPerson; i++) {
			str += (i+1) + " " + person[i].toString() + ""; 
			
		}
		return str; 
	}
	
	public People61() {
		person = new Person61[MAX_PERSON]; 
		for (int i = 0; i < MAX_PERSON; i++)
			person[i] = null; 
		nPerson = 0; 
	}
	
	boolean add(String name, int age) {
		if (nPerson == 5) {
			return false; 
		}
		if (person[nPerson] == null) {
			person[nPerson] = new Person61(name, age); 
		}
		nPerson++; 
		
		return true; 
	}
	
	
	
	boolean delete(int n) {
	      
		boolean found = false; 
	      if ((n-1)<nPerson) {
	    	  
		      person[n-1] = null;
		      nPerson--;
		      
		      for (int i=(n-1);i<MAX_PERSON;i++) {
			        if (i+1 < MAX_PERSON){
			            person[i] = person[i+1];
			        }else{
			            person[i] = null;
			        }
			      }
		      
	      }
	      return found; 
	      
	      

	   }
	
	boolean modify(int n, String name, int age) {
		
		person[n-1] = new Person61(name, age);
		
		return true; 
	}

}

class Person61 {

	private String name; 
	private int age; 
	
	// your code here 
	

	public Person61 (String name, int age) {
		this.name = name; 
		this.age = age; 
	}
	
	public String toString(){
	       return this.name + " " + this.age + "\n";
	  }


}
//problem2

// Do not change class 'Main'
public class hh {

	public static void main(String[] args) {
		Position62 p1 = new Position62(); 
		Position62 p2 = new Position62(3, 5); 
		
		System.out.println("p1: " + p1); 
		p1.move(Position62.Direction.valueOf("EAST"));
		System.out.println("p1: " + p1); 
		p1.move(Position62.Direction.valueOf("SOUTH"));
		System.out.println("p1: " + p1); 
		p1.move(Position62.Direction.valueOf("EAST"));
		System.out.println("p1: " + p1); 
		p1.move(Position62.Direction.valueOf("SOUTH"));
		System.out.println("p1: " + p1); 
		p1.move(Position62.Direction.valueOf("WEST"));
		System.out.println("p1: " + p1); 
		p1.move(Position62.Direction.valueOf("NORTH"));
		System.out.println("p1: " + p1); 
		
		System.out.println("p2: " + p2); 
		p2.move(Position62.Direction.valueOf("WEST"));
		System.out.println("p2: " + p2); 	
		p2.move(Position62.Direction.valueOf("SOUTH"));
		System.out.println("p2: " + p2); 	

	}

}

class Position62 {
	
	enum Direction {EAST, SOUTH, WEST, NORTH}
	private int s1,s2,f1,f2;
	
	public String toString(){
		return "Start " + s1 + " " + s2 + " " + "Current " + f1 + " " + f2;
	}
	
	public  Position62()
	{
		this.s1 = 0;
		this.s2 = 0;
		this.f1 = 0;
		this.f2 = 0;
	}

	
	public  Position62(int a, int b)
	{
		this.s1 = a;
		this.s2 = b;
		this.f1 = a;
		this.f2 = b;
	}
	
	boolean move(Position62.Direction direction) {
		boolean found = true; 
		switch(direction) {
		case EAST : f1++;
		break;
		case WEST : f1--;
		break;
		case SOUTH : f2--;
		break;
		case NORTH : f2++;
		break;
		}
		
		return found; 
	}

}

//problem3
public class hh {
	// Do not change method 'main'
	public static void main(String[] args) {
		
		Grade63[] grade = new Grade63[5];
		grade[0] = new Grade63("Tom", 35, 25, 85); 
		grade[1] = new Grade63("Jane", 75, 40, 66); 
		grade[2] = new Grade63("Brown", 75, 40, 55); 
		grade[3] = new Grade63("Zino", 35, 54, 90); 
		grade[4] = new Grade63("Yeri", 54, 25, 95); 
		
		for (int i = 0; i < grade.length; i++) 
			System.out.println(grade[i]); 
		
		int best = bestGrade(grade);
		System.out.println("BEST: " + grade[best]); 
	}
	
	public static int bestGrade(Grade63[] grade) {
		
		int best = 0;
		for(int i=1;i<grade.length;i++) {
			if (grade[best].getmath()<grade[i].getmath()) {
				best=i;
			}
			else if (grade[best].getmath()==grade[i].getmath()) {
				if (grade[best].gethistory()<grade[i].gethistory()) {
					best=i;
				}
				else if (grade[best].gethistory()==grade[i].gethistory()) {
					if (grade[best].getscience()<grade[i].getscience()) {
						best=i;
					}
			}
		}
		
			
	}
		return best;	
}
}

class Grade63 {
	private String name;
	private int math, history, science;
	
	public Grade63(String name, int math, int history, int science) {
		this.name = name;
		this.math = math;
		this.history = history;
		this.science = science;
	}
	
	public String toString() {
		return this.name + ": math(" + this.math + ") history(" + this.history + ") science("+this.science+")";
	}
	public int getmath() {
		return this.math;
	}
	public int gethistory() {
		return this.history;
	}
	public int getscience() {
		return this.science;
	}
}


//problem4

public class Hello2030 {
	// Do not change method 'main'
	public static void main(String[] args) {
		
		int[][] a = {{1, 2}, {3, 4, 5}, {6, 7}}; 
		show(a); 
		System.out.println(); 
		
		int[][] ae = extend(a); 
		show(ae); 
		System.out.println(); 
		
		int[][] b = {{5, 5, 5, 5}, {6, 6}, {1, 1, 1}, {2, 2, 2, 2}};
		show(b); 
		System.out.println(); 
		
		int[][] be = extend(b); 
		show(be); 
	}
	
	// write the method "show" and "extend" here
	
	public static void show(int[][] a) {
		int row, col;
		for (row=0;row<a.length;row++) {
			for (col=0;col<a[row].length;col++) {
				
				if (col==(a[row].length-1)) {
					System.out.print(a[row][col]);
				}
				else {
					System.out.print(a[row][col]+" ");
				}
			}
			System.out.println();
		}
	}
	
	public static int[][] extend(int[][] a) {
		int[][] b;
		b=new int [a.length][];
		int row, col;
		int sum;
		for (row=0;row<a.length;row++) {
			b[row] = new int[(a[row].length)+1];
			sum = 0;
			for (col=0;col<a[row].length;col++) {
				
				sum = sum + a[row][col];
				b[row][col] = a[row][col];
			}
			b[row][a[row].length] = sum;
			
		}
		return b;
	}

}