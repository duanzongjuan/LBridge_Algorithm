/*
*  		B   DEF
	A + — + —— = 10 
*   	C   GHI
 * 这个算式中A~I代表1~9的数字，不同的字母代表不同的数字。比如：6+8/3+952/714 就是一种解法，5+3/1+972/486 是另一种解法。这个算式一共有多少种解法？
 *@author:juanjuan
 *@version:2018-3-6
 */
//由于计算机中5/2会等于2，而且如果打算采用精度方面的处理的话，会很麻烦，而且很容易错。把这些式子全部变成乘法形式。A*C*GHI+B*GHI+DEF*C=10*C*GHI。

package province_7;

public class Test_3 {
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = "123456789".toCharArray();
		System.out.println(f(c, 0));
		f();
		g();
	}

	// 全排列算法
	public static int f(char[] c, int k) {
		if (k == c.length) {
			if (check(c)) {
				count++;
				// System.out.println(count);
			}
		}
		for (int i = k; i < c.length; i++) {
			{
				char temp = c[k];
				c[k] = c[i];
				c[i] = temp;
			}
			f(c, k + 1);
			{
				char temp = c[k];
				c[k] = c[i];
				c[i] = temp;
			}
		}
		return count;
	}

	public static boolean check(char[] c) {
		int[] a = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			a[i] = c[i] - '0';
		}
		if (a[0] * a[2] * (100 * a[6] + 10 * a[7] + a[8]) + a[1] * (100 * a[6] + 10 * a[7] + a[8])
				+ (100 * a[3] + 10 * a[4] + a[5]) * a[2] == 10 * a[2] * (100 * a[6] + 10 * a[7] + a[8])) {
			return true;
		}
		return false;
	}

	// 暴力算法(速率慢)
	public static void f() {
		int m = 0;
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if (b == a)
					continue;
				for (int c = 1; c < 10; c++) {
					if (c == a || c == b)
						continue;
					for (int d = 1; d < 10; d++) {
						if (d == a || d == b || d == c)
							continue;
						for (int e = 1; e < 10; e++) {
							if (e == d || e == c || e == b || e == a)
								continue;
							for (int f = 1; f < 10; f++) {
								if (f == e || f == d || f == c || f == b || f == a)
									continue;
								for (int g = 1; g < 10; g++) {
									if (g == f || g == e || g == d || g == c || g == b || g == a)
										continue;
									for (int h = 1; h < 10; h++) {
										if (h == g || h == f || h == e || h == d || h == c || h == b || h == a)
											continue;
										for (int i = 1; i < 10; i++) {
											if (i == h || i == g || i == f || i == e || i == d || i == c || i == b
													|| i == a)
												continue;
											if (a * c * (100 * g + 10 * h + i) + b * (100 * g + 10 * h + i)
													+ (100 * d + 10 * e + f) * c == 10 * c * (100 * g + 10 * h + i)) {
												m++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(m);
	}

	// 暴力算法(速率慢)
	public static void g() {
		int n = 0;
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				for (int c = 1; c < 10; c++) {
					for (int d = 1; d < 10; d++) {
						for (int e = 1; e < 10; e++) {
							for (int f = 1; f < 10; f++) {
								for (int g = 1; g < 10; g++) {
									for (int h = 1; h < 10; h++) {
										for (int i = 1; i < 10; i++) {
											if ((a != b && a != c && a != d && a != e && a != f && a != g && a != h
													&& a != i)
													&& (b != c && b != d && b != e && b != f && b != g && b != h
															&& b != i)
													&& (c != d && c != e && c != f && c != g && c != h && c != i)
													&& (d != e && d != f && d != g && d != h && d != i)
													&& (e != f && e != g && e != h && e != i)
													&& (f != g && f != h && f != i) && (g != h && g != i) && (h != i)) {
												if (a * c * (100 * g + 10 * h + i) + b * (100 * g + 10 * h + i)
														+ (100 * d + 10 * e + f) * c == 10 * c
																* (100 * g + 10 * h + i)) {
													n++;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(n);
	}
}
