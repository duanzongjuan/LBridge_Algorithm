/*
 * 有12张连在一起的12生肖的邮票。现在你要从中剪下5张来，要求必须是连着的.（仅仅连接一个角不算相连）一共有多少种不同的剪取方法
 *
 *@author juanjuan
 *@version 2013-3-9
 */
package province_7;
/*
 * 枚举出相邻的元素,1相邻,0不相邻
 * static int[][] cc = {
 * {1,1,0,0,1,0,0,0,0,0,0,0},
 * {1,1,1,0,0,1,0,0,0,0,0,0},
 * {0,1,1,1,0,0,1,0,0,0,0,0},
 * {0,0,1,1,0,0,0,1,0,0,0,0},
 * {1,0,0,0,1,1,0,0,1,0,0,0},
 * {0,1,0,0,1,1,1,0,0,1,0,0},
 * {0,0,1,0,0,1,1,1,0,0,1,0},
 * {0,0,0,1,0,0,1,1,0,0,0,1},
 * {0,0,0,0,1,0,0,0,1,1,0,0},
 * {0,0,0,0,0,1,0,0,1,1,1,0},
 * {0,0,0,0,0,0,1,0,0,1,1,1},
 * {0,0,0,0,0,0,0,1,0,0,1,1},
 * };
 * 
 */

public class Test_7 {
	static int[] a = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (a[0] = 0; a[0] < 8; a[0]++) {
			for (a[1] = a[0] + 1; a[1] < 9; a[1]++) {
				for (a[2] = a[1] + 1; a[2] < 10; a[2]++) {
					for (a[3] = a[2] + 1; a[3] < 11; a[3]++) {
						for (a[4] = a[3] + 1; a[4] < 12; a[4]++) {
							if (judge()) {
								count++;
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}

	public static boolean judge() {
		boolean[] visit = new boolean[5]; //默认初始化值为false
		dfs(visit, 0);
		return visit[0] && visit[1] && visit[2] && visit[3] && visit[4];
	}

	public static void dfs(boolean[] visit, int i) {
		visit[i] = true;
		for (int j = 0; j < visit.length; j++) {
			//相邻的两个元素在同一行,或者同一列.同一行:a[i]==a[j]+1或者a[i]==a[j]-1;同一行除4取整相等:a[i]/4 == a[j]/4
			if (!visit[j] && (a[i] == a[j] - 1 || a[i] == a[j] + 1) && (a[i] / 4 == a[j] / 4)) {
				dfs(visit, j);
			}
			//同一列:a[i]==a[j]+4或者a[i]==a[j]-4,同一列除4取余相等:a[i] % 4 == a[j] % 4.  
			if (!visit[j] && (a[i] == a[j] + 4 || a[i] == a[j] - 4) && (a[i] % 4 == a[j] % 4)) {
				dfs(visit, j);
			}
		}
	}
}
