//problem2

import java.util.Scanner; 

     

public class Hello2030 {

   public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int n = keyboard.nextInt();

    System.out.println(num(n));

    }

   public static int num(int n) {

    if (n==0) {

     return n;

    }

    else {

     if (n%2==0) {

      return n + num(n-1);

     }

     else {

      return -n + num(n-1);

     }

    }

  

   }

}

//problem3

public class Hello2030 {

     

 public static void main(String[] args) {

  Student113[] stArray = new Student113[5];

  stArray[0] = new Student113("John");

  stArray[1] = new Student113("Tom");

  stArray[2] = new Student113("Jane");

  stArray[3] = new Student113("Mary");

  stArray[4] = new Student113("Paul");

 

        System.out.println(search(stArray, "Jane", 4));

  System.out.println(search(stArray, "Paul", 4));

  System.out.println(search(stArray, "John", 4)); 

  System.out.println(search(stArray, "Brown", 4)); 

 }

 

 public static int search(Student113[] s, String name, int a) {

     

  for(int j=0;j<=a;j++) {

   if (name.equals(s[j].getname())) {

    return j;

   }

  }

  

  return -1;

  

 }

     

}

     

class Student113 {

     

 private String name;

 

 public Student113(String name) {

  this.name = name;

 }

 

 public String getname() {

  return this.name;

 }

     

}
