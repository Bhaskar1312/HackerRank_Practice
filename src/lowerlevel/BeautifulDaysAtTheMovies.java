package lowerlevel;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
    	int count=0;
    	for(int x=i;x<=j;x++)
    	{
    		if(isbeautiful(x,k))
    			count++;
    	}
    	return count;
    }

    private static boolean isbeautiful(int i, int k) {
		String s=i+"";
    	StringBuffer s2= new StringBuffer(i+"");
		s2.reverse();
		int m = Integer.parseInt(s);
		int n= Integer.parseInt(s2.toString());
		return ((m-n)%k==0);
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
