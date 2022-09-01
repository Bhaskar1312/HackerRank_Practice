package mediumlevel;

import java.io.*;
import java.math.*;
import java.util.*;

public class MinimumSwapsTwo {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int n=arr.length;int swaps=0;
    	for(int i=n-1;i>0;i--) {
    		if(arr[i]!=(i+1)) {
    			int tempindex=0;int temp=arr[i];
    			for(int j=0;j<i;j++) {
    				if(arr[j]==(i+1))
    					{tempindex=j;break;}
    			}
    			arr[i]=arr[tempindex];
    			arr[tempindex]=temp;
    			swaps++;
    		}
    	}
    	return swaps;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
