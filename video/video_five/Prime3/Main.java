/**
 *素数就是不能再进行等分的整数.比如7,11.而9不是，因为它可以平分为3等分.一般认为最小的素数是2,接着是3,5...
 *第100002(十万零二)个素数是?
 *请注意:2是第一个素数,3是第二高素数,以此类推。
 *@author juanjuan
 *@version 2018-2-12
 */
import java.math.BigInteger;
public class Main {
	public static void main(String[] args) {
		BigInteger bigInteger = new BigInteger("1"); //将一个字符串变为BigInteger类型的数据
		for(int s=1; s<=100002;s++) {
			bigInteger=bigInteger.nextProbablePrime();
			System.out.println(s+":"+bigInteger);
		}
	}
}