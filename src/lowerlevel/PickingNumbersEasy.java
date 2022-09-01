package lowerlevel;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PickingNumbersEasy {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int e=100;int n=c.length;
        for(int i=0;;){
            i=(i+k)%n;
             
        if(c[i]==1)
                e=e-3;
        else e=e-1; 
        System.out.println(i+" "+e);
        if(i==0)
           { System.out.println(e);
               return e;}  
        }
        //return e;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	int[] c1 = {0, 0, 1, 0, 0, 1, 1, 0};int k1=2;
        int result = jumpingOnClouds(c1, k1);
        //int[] c2= {1,1,1,0,1,1,0,0,0,0};int k2=3;
        //result = jumpingOnClouds(c2, k2);


    }
}
