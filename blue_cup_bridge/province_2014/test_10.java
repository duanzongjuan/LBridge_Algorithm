/*小明先把硬币摆成了一个 n 行 m 列的矩阵。随后，小明对每一个硬币分别进行一次Q操作.对第x行第y列的硬币进行Q操作的定义：将所有第 i*x 行，第 j*y 列的硬币进行翻转.
 *其中i和j为任意使操作可行的正整数，行号和列号都是从1开始.当小明对所有硬币都进行了一次Q操作后，他发现了一个奇迹——所有硬币均为正面朝上.小明想知道最开始有多少枚硬币是反面朝上的。
 *于是，他向他的好朋友小M寻求帮助.聪明的小M告诉小明，只需要对所有硬币再进行一次Q操作，即可恢复到最开始的状态。然而小明很懒，不愿意照做。于是小明希望你给出他更好的方法。
 *帮他计算出答案。输入数据包含一行，两个正整数 n m，含义见题目描述.输出一个正整数，表示最开始有多少枚硬币是反面朝上的。  
 *【样例输入】 2 3
 *【样例输出】 1
 *@author juanjuan 
 *@version 2018-3-17
 */
package province_2014;

import java.util.Scanner;

public class test_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = 1;
			}
		}

		for (int x = 0; x < n-1; x++) {
			for (int y = 0; y < m-1; y++) {
				Q(a, x + 1, y + 1);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == -1) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

	public static void Q(int[][] a, int x, int y) {
		a[x - 1][y - 1] = -a[x][y];
		for (int i = 2;; i++) {
			if (i * x < a.length) {
				a[i * x - 1][y - 1] = -a[i * x - 1][y - 1];
			}
			if (i * y < a[x].length) {
				a[x - 1][i * y - 1] = -a[x - 1][i * y - 1];
			}
			if (i * x < a.length && i * y < a[x].length) {
				a[i * x - 1][y * i - 1] = -a[i * x - 1][y * i - 1];
			}
			if (i * x > a.length && i * y > a[x].length) {
				break;
			}
		}
		return;
	}
}
