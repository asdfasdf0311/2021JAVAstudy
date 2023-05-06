//problem1

public class Hello2030 {

     

 public static void main(String[] args) {

  checkOdd(100);

  checkOdd(59); 

  checkOdd(24);

  checkOdd(31); 

 }

 

 static void checkOdd(int x) {

  try {

   if (x%2 == 0) {

    throw new MyNewException();

   }

  }

  catch (MyNewException e) {

   String message = e.getMessage();

   System.out.print(x);

   System.out.println(message);

   

  } 

 }

}

     

class MyNewException extends Exception {

     

      MyNewException() {

       super(" is not odd");

      }

  

  }

     

//problem2

import java.util.Scanner;

import java.util.InputMismatchException; 

     

public class Hello2030 {

     

 public static void main(String[] args) {

  

  boolean done = false; 

  Scanner keyboard = new Scanner(System.in);

  int n = 0;

  int a = 0;

  int[] b = {0,0,0};

  

  

  while (!done) {

   try {

    n = keyboard.nextInt(); 

    

    if (-9999999 < n) {

     

     b[a] = n;

     a++;

    }

    

    else {

     throw new MyRangeException(); 

    }

    

   }

   catch (InputMismatchException e1) {

    System.out.println("Invalid Input. Input Again.");

    keyboard.nextLine(); 

   }

   catch (MyRangeException e2) {

    System.out.println("Range error. Try again.");

   }

   

   if (a==3) {

    

    done = true; 

   }

  }

  

     

  

  for (int i=0;i<3;i++) {

   System.out.print(b[i]);

   if (i!=2) {

    System.out.print(" ");

   }

  }

     

 }

     

}

     

class MyRangeException extends Exception { }
