package lowerlevel;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	class Result1 {

	    /*
	     * Complete the 'getTotalX' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER_ARRAY a
	     *  2. INTEGER_ARRAY b
	     */

	    public static int getTotalX(List<Integer> a, List<Integer> b) {
	    // Write your code here
	    	int amax=a.get(0);
	    	int bmin=b.get(0);
	    	for(int i=0;i<a.size();i++)
	    		if(amax<a.get(i))
	    			amax=a.get(i);
	    	for(int i=0;i<b.size();i++)
	    		if(bmin>b.get(i))
	    			bmin=b.get(i);
	    	int count=0;
	    	if(amax>bmin)
	    		return 0;
	    	for(int i=amax;i<=bmin && i<=100;i++)
	    		if(ismultipleof(a,i) && isadivisorof(b,i))
	    			count++;
	    	return count;
	    }

		  static boolean isadivisorof(List<Integer> b,int x) {
			
			for(int i=0;i<b.size();i++)
				{//int temp=b.get(i);
				if(b.get(i)%x !=0)
					return false;
				}
			return true;
		}

		static boolean ismultipleof(List<Integer> a, int x) {
			for(int i=0;i<a.size();i++)
			{//int temp=a.get(i);
			if(x%a.get(i) !=0)
			return false;
			}
			return true;
		}

	}

	public class BetweenTwoSets {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(firstMultipleInput[0]);

	        int m = Integer.parseInt(firstMultipleInput[1]);

	        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrTemp[i]);
	            arr.add(arrItem);
	        }

	        String[] brrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> brr = new ArrayList<>();

	        for (int i = 0; i < m; i++) {
	            int brrItem = Integer.parseInt(brrTemp[i]);
	            brr.add(brrItem);
	        }

	        int total = Result1.getTotalX(arr, brr);

	        bufferedWriter.write(String.valueOf(total));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
