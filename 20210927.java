//problem1
import java.util.Scanner;

public class hh{
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int x = keyboard.nextInt();
		int y = keyboard.nextInt();
		if (((100>=x)&&(1<=x))&&((100>=y)&&(1<=y))) {
			for(int a=1;a<=x;a++) {
				if((x%a)==0) {
					System.out.print(a);
					if(x!=a) {
						System.out.print(",");
					}
				}
			}
			System.out.println("");
			for(int b=1;b<=y;b++) {
				if((y%b)==0) {
					System.out.print(b);
					if(y!=b) {
						System.out.print(",");
					}
				}
			}
			int temp=0;
			while(x!=0) {
				if (x<y) {
					temp=x;
					x=y;
					y=temp;
				}
				x=x-y;
			}
			System.out.println();
			for(int c=1;c<=y;c++) {
				if((y%c)==0) {
					System.out.print(c);
					if(y!=c) {
						System.out.print(",");
					}
				}
			}
		}
	}
}





//problem2
import java.util.Scanner;

public class hh{
	public static void main(String args[]) {
		Scanner keyboard =  new Scanner(System.in);
		int n = keyboard.nextInt();
		int count;
		int a=0;
		if ((n>=1)&&(n<=20)) {
			for (int num=2;num<=100;num++) {
				count=0;
				for (int i=2;i<num;i++) {
					if(num%i==0) {
						count+=1;
					}
				}
				if(count==0) {
					System.out.print(num+" ");
					a=a+1;
					if (a==n) {
						break;
					}
				}
				
			}
		}
	}
}




//problem3
import java.util.Scanner;

public class hh{
	public static void main(String[] args) {		
		Scanner keyboard =  new Scanner(System.in);
		String a;
		String b;
		String c;
		int n = 0;
		while (n == 0) {
			
			a = keyboard.next();
			if (a.equals("end")) {
				n=n+1;
				continue;
			}
			b = keyboard.next();
			c = keyboard.next();
			
			switch(b){
			case "+":
				System.out.println(a+c);
				break;
			case "*":
				for (int i=0;i<c.length();i++) {
					System.out.print(a);
				}
				System.out.println();
				break;
			case "-":
				System.out.println(a.substring(0,a.indexOf(c))+a.substring(a.indexOf(c)+c.length(),a.length()));
				break;
			default:
				System.out.println("wrong operator");
				break;
			}
			
		}

		System.out.println("Bye");
		keyboard.close();
	}
	
}
//problem4
import java.util.Scanner;

public class Hello2030 {
	public static void main(String[] args) {
		Scanner key =  new Scanner(System.in);
		
		int n = key.nextInt();
		
		if ((n >= 1)&&(n<=99999999)) {
			int a = 0;
			int b = 0;
			int c = 1;
			do {
				if (n/c > 0) {
					b=b+1;
				}
				a=a+1;
				c=c*10;
			} while (a<8);
			System.out.println(b);
		}
		
		
	}
}