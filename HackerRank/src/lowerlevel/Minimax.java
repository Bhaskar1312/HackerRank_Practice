package lowerlevel;

import java.util.Scanner;

public class Minimax {
	 static void miniMaxSum(int[] arr) {
	        int min =arr[0];int max=arr[0];
	        for(int i=0;i<arr.length;i++)
	        {if(min>arr[i])
	        min =arr[i];
	        if(max<arr[i])
	        max =arr[i];
	        }
	        long minSum=sum(-max,arr);long maxSum=sum(-min,arr);
	        System.out.println(minSum+" "+maxSum);
	    }
	 static long sum(long x,int[] arr) {
		 for(int i=0;i<arr.length;i++)
			 x+=arr[i];
		 return (x);
	 }
	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int[] arr = new int[5];

	        String[] arrItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < 5; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        miniMaxSum(arr);

	        scanner.close();
	    }
}
