/*
 *·��֮��    С��ð��X�������ʿ��������һ����ֵĳǱ����Ǳ����ʲô��û�У�ֻ�з���ʯͷ�̳ɵĵ��档����Ǳ������� n x n �����񡣡���ͼ1.png����ʾ����ϰ�ף���ʿҪ���������ߵ�
 *���Ͻǡ����Ժ���������ƶ���������б���ߣ�Ҳ������Ծ��ÿ�ߵ�һ���·��񣬾�Ҫ��������������������һ�������Ǳ�����ǽ�ͱ�ǽ�ڸ��� n �����ӣ�ͬһ������ֻ������һ�Ρ�����������
 *���еķ������ֻ���������ϼ�����Ŀ�������ƶϳ���ʿ������·������ʱ�ǿ��Եģ�����ͼ1.png�е����ӡ������Ҫ�������֪�������֣�����ʿ������·�����������ݱ�֤·��Ψһ��
 *���룺��һ��һ������N(0<N<20)����ʾ������ N x N ������   �ڶ���N���������ո�ֿ�����ʾ���ߵļ����ϵ����֣������򶫣� ������N���������ո�ֿ�����ʾ���ߵļ����ϵ����֣��Ա����ϣ�
 *�����һ�����ɸ���������ʾ��ʿ·���� Ϊ�˷����ʾ������Լ��ÿ��С������һ�����ִ����������ǿ�ʼ���: 0,1,2,3.... ���磬ͼ1.png�еķ�����Ϊ��
 *0  1  2  3
 *4  5  6  7
 *8  9  10 11
 *12 13 14 15
 *ʾ�����û����룺
 *4
 *2 4 3 4
 *4 3 3 3
 *����Ӧ�������
 *0 4 5 1 2 3 7 11 10 9 13 14 15
 */
package final_7;

import java.util.Scanner;

public class Test_4 {
	static int[] col; // ��������ÿ�����ӵ���Ŀ
	static int[] row;// ���汱��ÿ�����ӵ���Ŀ
	static int[][] visit; // �������,����Թ��ķ����Ƿ��߹�
	static int N;
	static int[][] location = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // ���������ĸ�����
	static int[][] print; // ת��Ϊ0~N^2-1������,���Ҫ��
	static int rowSum = 0; // ���߰��ӵ�����Ŀ
	static int colSum = 0; // ���߰��ӵ�����Ŀ
	static int[] map = null; // ����Ҫ�������·��
	static int aLen = 1; // ����·���ĳ���

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		// ��ʼ��
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

		// ��������
		for (int i = 0; i < N; i++) {
			row[i] = sc.nextInt();
			rowSum += row[i];
		}
		for (int j = 0; j < N; j++) {
			col[j] = sc.nextInt();
			colSum += col[j];
		}

		// ��ʼ����
		row[0]--;
		rowSum--;
		col[0]--;
		colSum--;
		visit[0][0] = 1;
		map[0] = 0;
		// ��0,0����
		dfs(0, 0);
	}

	public static void dfs(int x, int y) {
		if (x == N - 1 && y == N - 1) {
			// ��ӡ
			if (colSum == 0 && rowSum == 0) {
				for (int i = 0; i < aLen; i++) {
					System.out.print(map[i] + " ");
				}
			}
		}
		// ���������ĸ�����
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

				// ����
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
