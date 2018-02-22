/**
 *素数就是不能再进行等分的整数.比如7,11.而9不是，因为它可以平分为3等分.一般认为最小的素数是2,接着是3,5...
 *第100002(十万零二)个素数是?
 *请注意:2是第一个素数,3是第二高素数,以此类推。
 *@author juanjuan
 *@version 2018-2-12
 */

public class Main {
	public static void main(String[] args) {
		int i=2;
		int count = 1;
		boolean t = true;
		while(true) {
			i++;
			for(int j=2; j<=Math.sqrt(i);j++) {
				if(i % j == 0) {
					t = false;
					break;
				} 
			}

			if(t) {
				count ++;
			} else {
				t = true;  //回溯!!!! 切记
			}

			if(count == 100002) {
				System.out.println(i);
				break;
			} 
		}
	}
}