package mediumlevel;

import java.util.Arrays;

public class Pairs {
	public static void main(String[] args) {
		int[] arr = new int[] {1,5,3,4,2}; int k=2;
		Arrays.sort(arr);int pairs=0;
        for(int i=0;i<arr.length-1;i++)
        {//int key=arr[i];
        	int val = arr[i]+k;

         if(Arrays.binarySearch(arr,i+1,arr.length,val)>0)
        	 pairs++;
        }
        System.out.println(pairs);
	}
}
