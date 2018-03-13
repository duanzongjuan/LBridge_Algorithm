/*
 *���⣺ k������   ����һ������ΪN�����У�A1, A2, ... AN���������һ��������������Ai, Ai+1, ... Aj(i <= j)֮����K�ı��������Ǿͳ��������[i, j]��K�����䡣 ����
 *����������ܹ��ж��ٸ�K��������  
 *����
 *��һ�а�����������N��K��(1 <= N, K <= 100000)  
 *����N��ÿ�а���һ������Ai��(1 <= Ai <= 100000)  
 *���
 *���һ������������K���������Ŀ��  
 *���磬���룺
 *5 2
 *1  
 *2  
 *3  
 *4  
 *5 
 *����Ӧ�������
 *6
 *@author juanjuan 
 *@version 2018-3-13
 */
package province_8;

import java.util.Scanner;

public class Test_10 {

	static int a[] = new int[100010];
	static long dp[] = new long[100010];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k, i, j;
		n = scanner.nextInt();
		k = scanner.nextInt();
		long res;
		while (true) {
			dp[0] = 0;
			res = 0;
			for (i = 1; i <= n; i++) {
				a[i] = scanner.nextInt();
				dp[i] = dp[i - 1] + a[i];
			}
			for (i = 1; i <= n; i++) {
				for (j = 0; j <= n - i; j++) {
					if ((dp[j + i] - dp[j]) % k == 0)
						res++;
				}
			}
			System.out.println(res);
		}
	}
}
