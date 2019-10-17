package lowerlevel;
import java.lang.Math;

public class FlipBits {

	public static void main(String[] args) {
		long N =2147483647L;
		//Long p =Long.parseLong("0"+Integer.toBinaryString(N));
		//System.out.println(p);
		int n = (int)((N>0)?Math.floor( Math.log10(N)/Math.log10(2) ) + 1:0); //calculate number of digits in advance floor(log2(N)) + 1
		System.out.println(n);
	       long temp=N;
	       int i=0;long rslt=0;long power=1L;
	       while(i<32){
	        if(temp%2==0)
	        rslt +=power;
	        power *=2L;
	        temp=temp/2;
	        i++;
	       }
	        System.out.println(rslt);

	}

}
