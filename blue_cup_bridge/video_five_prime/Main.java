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

package video_five_prime;
public class Main {
	public static void main(String[] args) {
		int N = 1000 * 1000 * 10;
		int x = 100002;
		
		int[] a = new int[N]; //int类型java默认值为0.
		
		for(int i=2; i<N/2; i++) {  //i<N也行
			if(a[i] == 1) continue;  //合数没有资格参加筛选(比如,4,6在除去2,3的倍数的时候已经除去)
			
			//筛选
			for(int k=i; k<=N/i; k++) {  //int k=2;效率不如int k=i;
				if(i * k < N) 
					a[i*k] = 1; //将i的k倍置1,(2,4,6,8...)
			}
		}
		
		int count = 0;
		for(int i=2; i<N; i++) {  //0,1不是素数
			if(a[i] == 0) {
				count++;
				if(count == x) {
					System.out.println(i);
				}
			}
				
		}
	}
}
