//problem1
public class Hello2030 {
	public static void main(String[] args) {
		final double PI=3.14;
		double radius = 45/PI/2;
		double area = radius*radius*PI;
		System.out.println("area = " + area);
	}
}



//problem2
public static final int boarding_limit = 5;
	public static void main(String[] args) {
		int all = 38;
		int remainder = all%(boarding_limit - 1);
		int Round_Trips = (all/(boarding_limit - 1))+1;
		//승선인원에 뱃사공이 포함되므로 승선제한인원에서 1명을 뺀 값으로 나눈다.
		//38에서 4를 나눈 값의 나머지가 존재하므로 한번의 왕복을 더 해야한다.
		
		System.out.println("Number of Round Trips = " + Round_Trips);
	}


//problem3
public static void main(String[] args) {
		String s = "I love you.";
		System.out.println("string = [" + s + "]");
		int s_len = s.length();
		System.out.println("string length = " + s_len);
		System.out.println("Is the string the same as \"I Love YOU.\"?" + " " + s.equals("I Love YOU."));
		System.out.println("Is the string the same as \"I Love YOU.\"?" + " " + s.equalsIgnoreCase("I Love YOU."));
		System.out.println("string to lowercase = [" + s.toLowerCase() + "]");
		System.out.println("string to uppercase = [" + s.toUpperCase() + "]");
		String ss = "   I love you.   ";
		System.out.println("add three white spaces before and after the string = [" + ss + "]");
		System.out.println("trim the leading and trailing white spaces = [" + ss.trim() + "]");
		System.out.println("character at position 7 = " + s.charAt(7));
		System.out.println("substring starting from position 5 = [" + s.substring(5) + "]");
		System.out.println("starting index of the substring \"ov\" = " + s.indexOf("ov"));
		System.out.println("comparison to \"I love you.\" = " + s.compareTo("I love you."));
	}