package mediumlevel;

import java.util.*;

public class NewYearChaos2 {

	    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int n= q.length;int sum=0;int temp;int flag=1;
        for(int i=n-1;i>=0;i--)
            {if(q[i]!=(i+1))
            	{   if(i>0 &&(q[i-1] == i+1))
            		{sum +=1;
            		temp=q[i];q[i]=q[i-1];q[i-1]=temp;
            		//System.out.println(temp+" "+sum);
            		}
            		else if(i>1 &&(q[i-2] ==i+1) ) 
            		{	sum +=2;
            			temp=q[i-2];q[i-2]=q[i-1];q[i-1]=q[i];q[i]=temp;
//            			System.out.println(temp+" :"+sum);
//            			for(int j=0;j<q.length;j++)
//            				System.out.println(q[j]+"");	
            		}
            		else if(i>1 && i<(n-1))
                    {	//System.out.println("breaking i="+i);
            			flag=-1;break;}
            	}
            }
        if(flag==1)
            System.out.println(sum);
        else System.out.println("Too chaotic");
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
