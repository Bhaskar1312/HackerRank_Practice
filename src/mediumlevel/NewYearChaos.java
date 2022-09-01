package mediumlevel;

import java.util.*;

public class NewYearChaos {

    // Complete the minimumBribes function below.
         static void minimumBribes(int[] q) {
           int n= q.length;int sum=0;int flag=0;
           for(int i=0;i<n;i++)
               {if(( q[i]-(i+1) ) > 2)
               {    flag=1;
                   System.out.println("Too chaotic");
                   break;
               }
               else if (( q[i]-(i+1) )>0)
                       sum +=( q[i]-(i+1) );
                }
            if(flag==0)
              System.out.println(sum);  

       }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
