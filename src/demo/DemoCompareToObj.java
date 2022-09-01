package demo;

import java.util.Arrays;
import java.util.Comparator;

public class DemoCompareToObj   {
	public static void main(String[] args) {

//	int[] i = new int[5];
	Student[] s = new Student[6];
	s[0] = new Student("Bhaskar",100);
	s[1] = new Student("Mohit",101);
	s[2] = new Student("Shivam",105);
	s[3] = new Student("qwww",99);
	s[4] = new Student("qdqwdqd",95);
	s[5] = new Student("Lol",101);
	Arrays.sort(s);
	
	for(int i=0;i<s.length;i++)
	System.out.println(s[i].marks+"\t"+s[i].name);

	}	
}
class Student implements Comparable{
	String name;
	int marks;
	Student(String name,int marks){
		this.name  = name;
		this.marks = marks;
	}
	@Override
	public int compareTo(Object obj) {
		Student stu =(Student) obj;
		if(this.marks > stu.marks)
		return 1;
		else if(this.marks <stu.marks)
		return -1;
		else 
			return 0;
	}
}