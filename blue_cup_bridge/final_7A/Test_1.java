package final_7A;

import java.math.BigInteger;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = f(9999);
		String n = Integer.toBinaryString(a.intValue());
		System.out.println(a.bitLength());
	}
	
	public static BigInteger f(int n) {
		if(n>1) {
			return BigInteger.valueOf(n).multiply(f(n-1));
		}
		return BigInteger.ONE;
	}
}
