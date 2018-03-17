/*有n个小朋友围坐成一圈。老师给每个小朋友随机发偶数个糖果，然后进行下面的游戏：每个小朋友都把自己的糖果分一半给左手边的孩子。一轮分糖后，拥有奇数颗糖的孩子由老师补给1个糖果，
 *从而变成偶数。反复进行这个游戏，直到所有小朋友的糖果数都相同为止。你的任务是预测在已知的初始糖果情形下，老师一共需要补发多少个糖果。
 *程序首先读入一个整数N(2<N<100)，表示小朋友的人数。 接着是一行用空格分开的N个偶数(每个偶数不大于1000，不小于2) 要求程序输出一个整数，表示老师需要补发的糖果数。
 *例如：输入
 *3
 *2 2 4
 *程序应该输出：
 *4
 *@author juanjuan
 *@version 2018-3-17
 */
package province_2014;

import java.util.Scanner;

public class Test_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp, i, count = 0;
		int n = sc.nextInt();
		int[] a = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		while (true) {
			int x = 0;// x用于记录数组中相同元素的个数
			for (i = 0; i < n; i++) {
				if (a[i] % 2 != 0) {
					a[i]++;
					count++;
				}
			}
			for (i = 0; i < n; i++) {
				a[i] = a[i] / 2;
			}

			temp = a[0]; // temp保存第一个小孩子手里的一半的糖果
			for (i = 0; i < n - 1; i++) {
				a[i] = a[i] + a[i + 1];
			}
			a[n - 1] = a[n - 1] + temp; // 将第一个小孩子的糖果给最后一个小孩子

			for (i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1]) {
					++x;
				}
			}
			if (x == n - 1) {
				System.out.print(count);
				break;
			}
		}
	}
}
