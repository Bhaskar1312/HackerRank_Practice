package demo;

public class DemoStringMethods {
	
	public static void main(String[] args) {
		String s1="    Welcome to    Tutorialspoint.com    ";
		System.out.println(s1.matches("(.*)Tutorials(.*)"));
		System.out.println(s1.matches("Welcome"));
		String regex="[a-z]+";
		String s2 = "wlqlmqwldnddqod";
		System.out.println(s2.matches(regex)+"\t"+s2);
		char[] chararr=s2.toCharArray();
		System.out.println(chararr);
		String s3="This is a demo of getChars method";
		int start=10,end=14;
		char[] buf=new char[end-start];
		s3.getChars(start, end, buf, 0);//0 is targetStart
		System.out.println(buf);
		System.out.println("A"+s1.strip()+"Z");
	}
}
