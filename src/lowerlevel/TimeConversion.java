package lowerlevel;

	import java.io.*;
	import java.math.*;
	import java.text.*;
	import java.util.*;
	import java.util.regex.*;

	public class TimeConversion {
	    /*
	     * Complete the timeConversion function below.
	     */
	    static String timeConversion(String s) {
	        /*
	         * Write your code here.
	         */
	    	String str[]=s.split(":");
	    	int hh=Integer.parseInt(str[0]);
            if(s.endsWith("AM"))
                if(hh==12)
                    return "00"+":"+str[1]+":"+str[2].substring(0, 2);
                else return str[0]+":"+str[1]+":"+str[2].substring(0, 2);
            if(s.endsWith("PM"))
                if(hh!=12)
                    return (hh+12)+":"+str[1]+":"+str[2].substring(0, 2);
                else return str[0]+":"+str[1]+":"+str[2].substring(0, 2);
            return null;
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String s = scan.nextLine();

	        String result = timeConversion(s);

	        bw.write(result);
	        bw.newLine();

	        bw.close();
	    }
	}
