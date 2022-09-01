package lowerlevel;

public class GreatXOR {
	public static void main(String[] args) {
	int a=64+29;int count=0;
//	for(int i=1;i<a;i++)
//		{System.out.println(a^i);
//		if((a^i) >a)
//		count++;
//		}
//	System.out.println(":count :"+count);
	System.out.println("binary :"+Integer.toBinaryString(a));
	String s= Integer.toBinaryString(a);
	for(int i=0;i<s.length();i++)
		if(s.charAt(i)=='0')
			count+=Math.pow(2, s.length()-i-1);
	System.out.println(":count :"+count);
	//Method2
	System.out.println(":count :" + (~a) +"\t"+Integer.toBinaryString((~a)));
	System.out.println(-a-1+Math.pow(2, s.length()));
	s.replace('0', '2');
	//Integer.parseUnsignedInt(s);Long.parseUnsignedLong(s);
	}
}
