package lowerlevel;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class BonAppetit {

	    // Complete the bonAppetit function below.
	    static void bonAppetit(List<Integer> bill, int k, int b) {
	    	int sum=0;
	    	for(int i=0;i<bill.size();i++)
	    		sum+=bill.get(i);
	    	sum -=bill.get(k);
	    	if(sum/2!=b)
	    		System.out.print(b-sum/2);
	    	else System.out.print("Bon Appetit");

	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        String[] billItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> bill = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int billItem = Integer.parseInt(billItems[i]);
	            bill.add(billItem);
	        }

	        int b = Integer.parseInt(bufferedReader.readLine().trim());

	        bonAppetit(bill, k, b);

	        bufferedReader.close();
	    }
	}

