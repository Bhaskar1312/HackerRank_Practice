package lowerlevel;

public class TestingCopyingArray {

	public static void main(String[] args) {
	
		int[] a ={1,2,3};
		int[] b= a;
		int[] c =a.clone();
		b[0]++;
		for(int i=0;i<b.length;i++)
		    System.out.print(b[i]+"\t"+b[i]+"\t"+c[i]+"\n");
	}

}
