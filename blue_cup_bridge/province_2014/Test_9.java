/*X国王有一个地宫宝库。是 n x m 个格子的矩阵。每个格子放一件宝贝。每个宝贝贴着价值标签。地宫的入口在左上角，出口在右下角。 小明被带到地宫的入口，国王要求他只能向右或向下行走。
 *走过某个格子时，如果那个格子中的宝贝价值比小明手中任意宝贝价值都大，小明就可以拿起它(当然，也可以不拿)。当小明走到出口时，如果他手中的宝贝恰好是k件，则这些宝贝就可以送给小明。
 *请你帮小明算一算，在给定的局面下，他有多少种不同的行动方案能获得这k件宝贝。
 *输入一行3个整数，用空格分开：n m k (1<=n,m<=50, 1<=k<=12)       
 *接下来有 n 行数据，每行有 m 个整数 Ci (0<=Ci<=12)代表这个格子上的宝物的价值       
 *要求输出一个整数，表示正好取k个宝贝的行动方案数。该数字可能很大，输出它对 1000000007 取模的结果。  
 *例如，输入：
 *2 2 2
 *1 2 
 *2 1  
 *程序应该输出：2   
 *再例如，输入： 
 *2 3 2 
 *1 2 3 
 *2 1 5  
 *程序应该输出： 14 
 *@author juanjuan 
 *@version 2018-3-18
 */

//深度优先搜索(dfs)+记忆化(避免重复计算)

package province_2014;

import java.util.Scanner;

public class Test_9 {
	public static int n, m, k;
	public static int map[][] = new int[55][55];// [x][y]坐标里的宝物价值
	public static int d[][][][] = new int[55][55][13][14];// 进入[x][y]进行宝物选择之前的状态
	public static final int N = 1000000007;

	/*
	 * @param x:横坐标,即向右 y:竖坐标,即向下 num:手中拿了几件宝贝 max:手中宝贝最大值
	 */
	private static int dfs(int x, int y, int num, int max) {

		if (d[x][y][num][max + 1] != -1000) {// 说明这条路径已经计算过了，直接提取记忆储存的方案就可以了

			return d[x][y][num][max + 1];
		}
		// 递归的出口
		if (x == n && y == m) {// 如果向下向右都走不动了(到达终点)

			if (num == k)// 如果已经取了最后一个，到达终点就只有一条路径了
				return d[x][y][num][max + 1] = 1;
			else if (num == k - 1 && max < map[x][y])// 如果已经取了k—1件，当前的宝物又可以取得，此物必取!
				return d[x][y][num][max + 1] = 1; // 注意还有一个原则就是，拿起来的就不能再放下了
			else
				return d[x][y][num][max + 1] = 0;// 如果走到最后了都没有捡到k件宝贝，一条路都没有
		}

		long s = 0;
		if (x < n) {// 说明可以向下走
			if (max < map[x][y]) {// 当前坐标上的宝物可以拿
				s = s + dfs(x + 1, y, num + 1, map[x][y]);
				s = s % N;
			}
			// 不取
			s = s + dfs(x + 1, y, num, max);
			s = s % N;
		}
		if (y < m) {

			if (max < map[x][y]) {
				s = s + dfs(x, y + 1, num + 1, map[x][y]);
				s = s % N;// 每次都取余，这样可以避免是s值过大越界
			}
			// 当然也可以不取
			s = s + dfs(x, y + 1, num, max);
			s = s % N;
		}

		return d[x][y][num][max + 1] = (int) (s % N);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {

				map[i][j] = sc.nextInt();
			}
		}
		// 初始化,标记坐标没有走过
		for (int i = 0; i < 55; i++) {
			for (int j = 0; j < 55; j++) {
				for (int k = 0; k < 13; k++) {
					for (int l = 0; l < 14; l++) {
						// 只能用这个for循环赋值,-1000可换成任意数,最好负数,防止跟其真实值重复,不能为0,也可能以某种方式走的时候无解即是0
						d[i][j][k][l] = -1000;
					}
				}
			}
		}

		System.out.println(dfs(1, 1, 0, -1)); // 宝物的价值有可能为0，这个也是可以拿起来的，所以最要从-1开始搜

	}
}
