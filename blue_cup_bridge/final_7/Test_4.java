/*
 *路径之谜    小明冒充X星球的骑士，进入了一个奇怪的城堡。城堡里边什么都没有，只有方形石头铺成的地面。假设城堡地面是 n x n 个方格。【如图1.png】所示。按习俗，骑士要从西北角走到
 *东南角。可以横向或纵向移动，但不能斜着走，也不能跳跃。每走到一个新方格，就要向正北方和正西方各射一箭。（城堡的西墙和北墙内各有 n 个靶子）同一个方格只允许经过一次。但不必做完
 *所有的方格。如果只给出靶子上箭的数目，你能推断出骑士的行走路线吗？有时是可以的，比如图1.png中的例子。本题的要求就是已知箭靶数字，求骑士的行走路径（测试数据保证路径唯一）
 *输入：第一行一个整数N(0<N<20)，表示地面有 N x N 个方格   第二行N个整数，空格分开，表示北边的箭靶上的数字（自西向东） 第三行N个整数，空格分开，表示西边的箭靶上的数字（自北向南）
 *输出：一行若干个整数，表示骑士路径。 为了方便表示，我们约定每个小格子用一个数字代表，从西北角开始编号: 0,1,2,3.... 比如，图1.png中的方块编号为：
 *0  1  2  3
 *4  5  6  7
 *8  9  10 11
 *12 13 14 15
 *示例：用户输入：
 *4
 *2 4 3 4
 *4 3 3 3
 *程序应该输出：
 *0 4 5 1 2 3 7 11 10 9 13 14 15
 */
package final_7;

import java.util.Scanner;

public class Test_4 {
	static int[] col; // 保存西边每个靶子的数目
	static int[] row;// 保存北边每个靶子的数目
	static int[][] visit; // 标记数组,标记迷宫的方格是否走过
	static int N;
	static int[][] location = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // 上下左右四个方向
	static int[][] print; // 转换为0~N^2-1的数组,输出要求
	static int rowSum = 0; // 北边靶子的总数目
	static int colSum = 0; // 西边靶子的总数目
	static int[] map = null; // 满足要求的行走路径
	static int aLen = 1; // 可行路径的长度

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		// 初始化
		row = new int[N];
		col = new int[N];
		visit = new int[N][N];
		print = new int[N][N];
		map = new int[N * N + 1];
		int index = 0;
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				print[i][j] = index++;
			}
		}

		// 输入数据
		for (int i = 0; i < N; i++) {
			row[i] = sc.nextInt();
			rowSum += row[i];
		}
		for (int j = 0; j < N; j++) {
			col[j] = sc.nextInt();
			colSum += col[j];
		}

		// 开始计算
		row[0]--;
		rowSum--;
		col[0]--;
		colSum--;
		visit[0][0] = 1;
		map[0] = 0;
		// 从0,0出发
		dfs(0, 0);
	}

	public static void dfs(int x, int y) {
		if (x == N - 1 && y == N - 1) {
			// 打印
			if (colSum == 0 && rowSum == 0) {
				for (int i = 0; i < aLen; i++) {
					System.out.print(map[i] + " ");
				}
			}
		}
		// 上下左右四个方向
		for (int i = 0; i < 4; ++i) {
			int dx = x + location[i][0];
			int dy = y + location[i][1];
			if (dx >= 0 && dx < N && dy >= 0 && dy < N && visit[dx][dy] == 0 && row[dy] > 0 && col[dx] > 0) {
				visit[dx][dy] = 1;
				row[dy]--;
				rowSum--;
				col[dx]--;
				colSum--;
				map[aLen++] = print[dx][dy];
				dfs(dx, dy);

				// 回溯
				aLen--;
				visit[dx][dy] = 0;
				row[dy]++;
				rowSum++;
				col[dx]++;
				colSum++;
			}
		}
	}
}
