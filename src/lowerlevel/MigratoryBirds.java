package lowerlevel;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MigratoryBirds {

	    // Complete the migratoryBirds function below.
	    static int migratoryBirds(List<Integer> arr) {
	    	int[] count = new int[5];
	        for(int i=0;i<5;i++)
	            for(int j=0;j<arr.size();j++)
	            {   if(arr.get(j) == i+1)
	                    count[i]++;
	            }
	            int max =count[0];int temp=1;
	            for(int i=0;i<5;i++)
	                if(max < count[i])
	                {max=count[i];temp=i+1;}
	            return temp;

	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < arrCount; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr.add(arrItem);
	        }

	        int result = migratoryBirds(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

