/*
 * 标题：包子凑数     小明几乎每天早晨都会在一家包子铺吃早餐。他发现这家包子铺有N种蒸笼，其中第i种蒸笼恰好能放Ai个包子。每种蒸笼都有非常多笼，可以认为是无限笼。每当有顾客想买X个包子，
 * 卖包子的大叔就会迅速选出若干笼包子来，使得这若干笼中恰好一共有X个包子。比如一共有3种蒸笼，分别能放3、4和5个包子。当顾客想买11个包子时，大叔就会选2笼3个的再加1笼5个的
 * （也可能选出1笼3个的再加2笼4个的）。当然有时包子大叔无论如何也凑不出顾客想买的数量。比如一共有3种蒸笼，分别能放4、5和6个包子。而顾客想买7个包子时，大叔就凑不出来了。小明想知道
 * 一共有多少种数目是包子大叔凑不出来的。输入    第一行包含一个整数N。(1 <= N <= 100)  以下N行每行包含一个整数Ai。(1 <= Ai <= 100)  输出一个整数代表答案。
 * 如果凑不出的数目有无限多个，输出INF。例如，
 * 输入：
 * 2  
 * 4  
 * 5   
 * 程序应该输出：
 * 6  再例如，输入：
 * 2  
 * 4  
 * 6    
 * 程序应该输出：
 * INF
 * 样例解释：对于样例1，凑不出的数目包括：1, 2, 3, 6, 7, 11。  对于样例2，所有奇数都凑不出来，所以有无限多个。  
 *@author juanjuan
 *@version 2018-3-13
 */
package province_8;

import java.util.Scanner;

public class Test_8 {
	static int[] dp = new int[100 * 100 + 5];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}
		int m = a[0];
		for (int i = 1; i < N; i++) {
			m = gcd(m, a[i]);
		}
		if (m != 1) {
			System.out.println("INF");
			return;
		}
		// 完全背包问题
		dp[0] = 1;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j + a[i] < (100 * 100 + 5); j++) {
				if (dp[j] == 1)
					dp[j + a[i]] = 1;
			}
		}

		int count = 0;
		for (int i = 0; i < (100 * 100 + 5); i++) {
			if (dp[i] != 1) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
		// return b==0?a:gcd(b,a%b);
	}

}
