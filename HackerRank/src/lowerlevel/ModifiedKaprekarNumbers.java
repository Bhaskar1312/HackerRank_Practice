package lowerlevel;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    // Complete the kaprekarNumbers function below.
	  static void kaprekarNumbers(int p, int q) {
	        int flag=0;
	        for(int i=p;i<=q;i++)
	            {if(i==sumOfSquareSplits(i))
	                {flag=1;
	                System.out.print(i+" ");
	                }
	            }
	        if(flag==0)
           	 System.out.print("INVALID RANGE");
	            	
	    }
	    static int sumOfSquareSplits(int x) {
	    	int temp=x*x;int i=1;
	      for(i=1;;i++)
	    	  if(temp/(int)Math.pow(10, i) ==0)
	    		  break;
	     int l=temp/(int)Math.pow(10, i-i/2);
	     int r=temp%(int)Math.pow(10, i-i/2);
//	    while(l%10==0 && l >0)
//	    	 l=l/10;
	    return l+r;
	        
	    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//    	int x=Integer.parseInt("000123");
//    	System.out.println("H:"+(x/11));
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
