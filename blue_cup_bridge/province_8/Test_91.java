package province_8;

import java.util.Scanner;

public class Test_91 {
	static int k;
	static int[] aa = new int[100010];
	static int[] bb = new int[100010];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int low, high;
		int n = sc.nextInt();
		k = sc.nextInt();
		for (int i = 0; i < n; i++) {
			aa[i] = sc.nextInt();
			bb[i] = sc.nextInt();
		}
		// 二分查找法
		low = 1;
		high = 100000;
		while (low < high - 1) {
			int mid = (low + high) / 2;
			if (!solve(mid)) {
				high = mid;
			} else {
				low = mid;
			}
		}
		System.out.println(high);
	}

	public static boolean solve(int x) {
		int count = 0;
		int a, b;
		for (int i = 0; i < x; i++) {
			a = aa[i] / x;
			b = bb[i] / x;
			count = a * b;
		}
		if (count >= k) {
			return true;
		}
		return false;
	}

}
