//problem1

import java.util.Scanner;

     

public class Hello2030 {

 public static void main(String[] args) {

  Scanner apple = new Scanner(System.in);

  

  String L = apple.nextLine();

  String w1 = apple.next();

  String w2 = apple.next();

  

  String L2 = L.substring(0,L.indexOf(w1));

  String L3 = L.substring(L.indexOf(w1)+w1.length());

     

  System.out.print(L2 + w2 + L3);

  

  apple.close();

 }

}

     

     

//problem2

     

import java.util.Scanner;

     

public class Hello2030 {

 public static void main(String[] args) {

  Scanner apple = new Scanner(System.in);

  

  int n = apple.nextInt();

  

  int a1 = n/100000;

  int aa1 = n%100000;

  int a2 = aa1/10000;

  int aa2 = aa1%10000;

  int a3 = aa2/1000;

  int aa3 = aa2%1000;

  int a4 = aa3/100;

  int aa4 = aa3%100;

  int a5 = aa4/10;

  int aa5 = aa4%10;

     

     

  System.out.print(a1 + " ");

  System.out.print(a2 + " ");

  System.out.print(a3 + " ");

  System.out.print(a4 + " ");

  System.out.print(a5 + " ");

  System.out.print(aa5 + " ");

     

  

  apple.close();

 }

}

     

     

     

     

     

     

//problem3

     

import java.util.Scanner;

     

public class Hello2030 {

 public static void main(String[] args) {

  Scanner apple = new Scanner(System.in);

  

  int n = apple.nextInt();

  apple.nextLine();

  String a = apple.nextLine();

  System.out.print(n + " " + a);

 }

}

     
