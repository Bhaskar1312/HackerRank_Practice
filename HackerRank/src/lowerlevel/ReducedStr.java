package lowerlevel;

public class ReducedStr {
	static String superReducedString(String s) {
        for(int i=0;i<s.length()-1;i++)
        if(s.charAt(i)==s.charAt(i+1))
        {s=s.substring(0,i)+""+s.substring(i+2);
        System.out.println(i+"  "+s+" "+s.length());i=-1;
        }
        if(s.equals("")) return "Empty String";
        return s;
    }
	public static void main(String[] args) {
	System.out.println(superReducedString("baab"));
	System.out.println(superReducedString("aaabbccc"));
	System.out.println("abc".substring(0,0)+" "+1);
	}
	
}
