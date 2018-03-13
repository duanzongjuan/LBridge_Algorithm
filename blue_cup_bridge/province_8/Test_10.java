/*
 *标题： k倍区间   给定一个长度为N的数列，A1, A2, ... AN，如果其中一段连续的子序列Ai, Ai+1, ... Aj(i <= j)之和是K的倍数，我们就称这个区间[i, j]是K倍区间。 你能
 *求出数列中总共有多少个K倍区间吗？  
 *输入
 *第一行包含两个整数N和K。(1 <= N, K <= 100000)  
 *以下N行每行包含一个整数Ai。(1 <= Ai <= 100000)  
 *输出
 *输出一个整数，代表K倍区间的数目。  
 *例如，输入：
 *5 2
 *1  
 *2  
 *3  
 *4  
 *5 
 *程序应该输出：
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
