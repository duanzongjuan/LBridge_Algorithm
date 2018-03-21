/*［最大整数］设有n个正整数,将它们连接成一排，组成一个最大的多位整数。例如:n=3时,3个整数13，312，343，连成的最大整数为34331213。又如：n=4时，4个整数7，13，4，246，连成的最大整数为7424613。
 * 输入:n
 * N个数
 * 输出：连成的多位数 
 *@author juanjuan
 *@version 2018-3-20
 */

//先把整数转换成字符串，然后在比较a+b和b+a，如果a+b>=b+a，就把a排在b的前面，反之则把a排在b的后面。
package greedy;

import java.util.Scanner;

public class Test_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = new String[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.next();
		}
		sc.close();

		//比较、交换、移动
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if ((a[i] + a[j]).compareTo(a[j] + a[j]) < 0) {
					String temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		String str = "";
		for(int i=0;i<n;i++) {
			str += a[i];
		}
		System.out.println(str);
	}

	//比较算法
	public static int compareTo(String s1, String s2) {
		int i1 = Integer.parseInt(s1);
		int i2 = Integer.parseInt(s2);
		if (i1 - i2 >= 0)
			return 1;
		else
			return -1;
	}
}
