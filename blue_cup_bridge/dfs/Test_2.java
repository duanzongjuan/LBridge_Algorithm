/*所示六角形中，填入1~12的数字。使得每条直线上的数字之和都相同。 图中，已经替你填好了3个数字，请你计算星号位置所代表的数字是多少？
 *@author juanjuan
 *@version 2018-3-19
 */
package dfs;

public class Test_2 {
	static int[] a = new int[13];
	static boolean[] hasvisited = new boolean[13];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//减少深度搜索次数
		a[1] = 1;
		a[2] = 8;
		a[12] = 3;
		hasvisited[1] = true;
		hasvisited[8] = true;
		hasvisited[3] = true;
		dfs(1);
	}

	public static void dfs(int pos) {
		if (pos == 13) {
			judge();
		}
		if (pos == 1 || pos == 2 || pos == 12) {
			dfs(pos + 1);
			return;
		}
		for (int i = 1; i < 13; i++) {
			if (!hasvisited[i]) {
				a[pos] = i;
				hasvisited[i] = true;
				dfs(pos + 1);
				hasvisited[i] = false;
			}
		}
	}

	public static void judge() {
		int[] b = new int[6];
		b[0] = a[1] + a[3] + a[6] + a[8];
		b[1] = a[1] + a[4] + a[7] + a[11];
		b[2] = a[8] + a[9] + a[10] + a[11];
		b[3] = a[2] + a[3] + a[4] + a[5];
		b[4] = a[2] + a[6] + a[9] + a[12];
		b[5] = a[5] + a[7] + a[10] + a[12];
		for (int i = 1; i < 6; i++) {
			if (b[i] != b[i - 1]) {
				return;
			}
		}
		System.out.print(a[6]);
	}
}
