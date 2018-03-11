package final_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Test_5 {
	public static int n, m, k;
	public static String[] S;
	public static String[] num;
	public static int[] start;
	public static long MOD = 1000000007;
	public static long count = 0;
	public static HashSet<String> result = new HashSet<String>();

	public void dfs(int step, int sum) {
		if (step == n || sum >= m) {
			if (sum >= m) {
				ArrayList<String> set = new ArrayList<String>();
				StringBuffer[] s = new StringBuffer[sum];
				for (int i = 0; i < sum; i++)
					s[i] = new StringBuffer("");
				for (int i = 0; i < n; i++) {
					if (!num[i].equals("-")) {
						if (!set.contains(num[i])) {
							set.add(num[i]);
							s[set.size() - 1].append(i);
							s[set.size() - 1].append(start[i]);
						} else {
							int j = set.indexOf(num[i]);
							s[j].append(i);
							s[j].append(start[i]);
						}
					}
				}
				if (set.size() == sum - m + 1) {
					for (int i = 0; i < sum; i++) {
						if (s[i].toString().length() == k * 2) {
							if (!result.contains(s[i].toString()))
								count = (count + 1) % MOD;
							result.add(s[i].toString());
							break;
						}
					}
				}
			}
			return;
		} else {
			for (int i = 0; i < S[step].length(); i++) {
				if (i + k <= S[step].length()) {
					num[step] = S[step].substring(i, i + k);
					start[step] = i;
					dfs(step + 1, sum + 1);
					num[step] = "-";
				}
				dfs(step + 1, sum);
			}
		}
	}

	public static void main(String[] args) {
		Test_5 test = new Test_5();
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		S = new String[n];
		for (int i = 0; i < n; i++)
			S[i] = in.next();
		num = new String[n + 1];
		start = new int[n + 1];
		for (int i = 0; i <= n; i++)
			num[i] = "-";
		test.dfs(0, 0);
		System.out.println(count);
	}

}