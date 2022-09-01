package lowerlevel;

public class BitImplementation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,2,3,3};
		System.out.println(arr[0]^arr[1]^arr[2]^arr[3]^arr[4]);
		System.out.println(3^3^3^1);
		System.out.println(3^3^3);
		System.out.println(0^0);
		System.out.println((1^2)^(1^2^3));
		System.out.println("check periodicity of xor");
		int res=0;int resu=0;
		for(int i=0;i<160;i++)
			{res=res^i;
			resu=resu^res;
			System.out.print(i+"\t"+i%8+"\t");
			System.out.print(res);
			System.out.print("\t");
			System.out.println(resu);
			}
		System.out.println(65<<1);
		System.out.println(65>>1);
	}

}
