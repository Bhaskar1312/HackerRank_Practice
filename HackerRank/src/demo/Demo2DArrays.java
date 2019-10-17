package demo;

import java.util.Arrays;

public class Demo2DArrays {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[1] = new int[]{11,2,3};
		arr[0] = new int[]{10,4,9};
		arr[2] = new int[]{-1,5,10};
		
		for(int i=0;i<arr.length;i++)
			{	Arrays.sort(arr[i]);
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+"\t");
			System.out.println();
			}
//		int[] arr2 = arr;
	}
}
