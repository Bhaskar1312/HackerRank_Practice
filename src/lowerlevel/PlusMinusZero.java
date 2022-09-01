package lowerlevel;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class PlusMinusZero {
	    // Complete the plusMinus function below.
	    static void plusMinus(int[] arr) {
	    	Float countp=0.0f;Float countn=0.0f;Float countz=0.0f;
	    	for(int i=0;i<arr.length;i++)
	    		{if(arr[i]>0)
	    			countp++;
	    		else if(arr[i] <0)
	    			countn++;
	    		else countz++;}
	    	countp /=arr.length;countn /=arr.length;countz /=arr.length;
	    	//System.out.println(countp + " "+countn + " "+countz );
	    	System.out.println(String.format("%.4f",countp) + "\n"+ String.format("%.4f",countn) + "\n"+String.format("%.4f",countz));
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int[] arr = new int[n];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        plusMinus(arr);
	        scanner.close();
	    }
	}
