package lowerlevel;

public class CaesarCipher {
	 static String caesarCipher(String s, int k) {
	    String s2 ="";
	    for(int i=0;i<s.length();i++) {
	    	char ch = s.charAt(i);
	    	if(k>0)
	    	{if(ch >='A' && ch <= 'Z')
	    		{ch = (char)('A'+ (ch-'A' + k)%26);
	    		}
	    	else if(ch >='a' && ch <= 'z')
    		{ch = (char)('a'+ (ch-'a' + k)%26);
   		 		
    		}
	    	}s2=s2+""+ch;
	    }
	    return s2;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(caesarCipher("ABCW-XYZ",2));
		System.out.println(caesarCipher("abcABCw&&--++xyaZ",3));

	}

}
