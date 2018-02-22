/**
 *素数就是不能再进行等分的整数.比如7,11.而9不是，因为它可以平分为3等分.一般认为最小的素数是2,接着是3,5...
 *第100002(十万零二)个素数是?
 *请注意:2是第一个素数,3是第二高素数,以此类推。
 *@author juanjuan
 *@version 2018-2-12
 */

//筛选法
//2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18..先去除2的倍数
//3,5,7,9,11,13,15,17..再去除3的倍数
//5,7,11,17..再去除5的倍数
//...

public class Main {
	public static void main(String[] args) {
		int N = 1000 * 1000 * 10;
		int x = 100002;

		int[] a = new int[N];  //int类型java默认值为0.

		for(int i=2; i<N/2; i++) {
			if(a[i] == 1) continue;  //和数没有资格参加筛选

			//筛选
			for(int k=2; k<=N/i; k++) {
				if(i*k<N)
					a[i*k] = 1;
			}
		}

		int m = 0;
		for(int i=2; i<N; i++) {
			if(a[i] == 0) {
				m ++;
				if(m == x)
					System.out.println(i + " ");
			}
		}
	}
}