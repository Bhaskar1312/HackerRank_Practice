package demo;

public class DemoStringCompare {
	public static void main(String[] args) {
		String s1="abc";
		String s2="ABC";
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		System.out.println("A".compareTo("a"));
		s1.compareToIgnoreCase(s2);
	}
	
}