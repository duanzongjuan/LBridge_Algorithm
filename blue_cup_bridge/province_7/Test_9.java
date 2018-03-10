/*交换瓶子  有N个瓶子，编号 1 ~ N，放在架子上。比如有5个瓶子：2 1 3 5 4 要求每次拿起2个瓶子，交换它们的位置。经过若干次后，使得瓶子的序号为：1 2 3 4 5 对于这么简单的情况，
 * 显然，至少需要交换2次就可以复位。如果瓶子更多呢？你可以通过编程来解决。输入格式为两行：第一行: 一个正整数N（N<10000）, 表示瓶子的数目  第二行：N个正整数，用空格分开，
 * 表示瓶子目前的排列情况。输出数据为一行一个正整数，表示至少交换多少次，才能完成排序。
 * 例如，输入：5
 * 3 1 2 5 4 程序应该输出：3
 * 再例如，输入：
 * 5
 * 5 4 3 2 1
 * 程序应该输出：
 * 2
 * @author juanjuan
 * @version 2018-3-10
 */
package province_7;

import java.util.Scanner;

public class Test_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time = System.currentTimeMillis();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N+1];
		for(int i=1; i<=N;i++) {
			a[i] = sc.nextInt();
		}
		
		long count = 0;
		for(int i=1;i<a.length;i++) {
			if(a[i]!=i) {
				int temp = a[i];
				for(int j=i; j<a.length;j++) {
					if(a[j] == i) {
						a[i] = a[j];
						a[j] = temp;
						count++;
					}
				}
			}
		}
		System.out.println(count);
		long time1 = System.currentTimeMillis();
		System.out.println(time1-time);
	}
}
