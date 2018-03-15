/*取球博弈    两个人玩取球的游戏。一共有N个球，每人轮流取球，每次可取集合{n1,n2,n3}中的任何一个数目。如果无法继续取球，则游戏结束。此时，持有奇数个球的一方获胜。如果两人都
 *是奇数，则为平局。假设双方都采用最聪明的取法，第一个取球的人一定能赢吗？试编程解决这个问题。输入格式：第一行3个正整数n1 n2 n3，空格分开，表示每次可取的数目 
 *(0<n1,n2,n3<100) 第二行5个正整数x1 x2 ... x5，空格分开，表示5局的初始球数(0<xi<1000)
 *输出格式：一行5个字符，空格分开。分别表示每局先取球的人能否获胜。能获胜则输出+，次之，如有办法逼平对手，输出0，无论如何都会输，则输出-
 *例如，输入：
 *1 2 3
 *1 2 3 4 5
 *程序应该输出：+ 0 + 0 -
 *再例如，输入：
 *1 4 5
 *10 11 12 13 15
 *程序应该输出：0 - 0 + +
 *再例如，输入：
 *2 3 5
 *7 8 9 10 11
 *程序应该输出：
 *+ 0 0 0 0
 *@author juanjuan
 *@version 2018-3-15
 */

/*解题思路:在获得最有利的条件下，让对手的选择范围尽量减小，所以在保证是奇数个球时，选择较大的数；最不利的状态下，让对手选择最大，这样翻盘的机会会越大，所以必须选偶数个球时选择
 *最小的。(是偶数的时候,选择最大的奇数,如果全部是偶数,选择最小的偶数,是奇数的时候,选择最大的)
 */
package province_7;

import java.util.Arrays;
import java.util.Scanner;

public class Test_9_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] f = new int[3];
		for (int i = 0; i < 3; i++)
			f[i] = sc.nextInt();
		Arrays.sort(f);
		for (int i = 0; i < 5; i++) {
			int sum = sc.nextInt();
			int a = 0, b = 0; // a表示第一个选手有的球的数目的奇偶,0表示偶数,1表示奇数
			while (sum >= f[0]) {
				if (a == 0) {
					if (sum >= f[2] && f[2] % 2 == 1) {
						a = 1;
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 1) {
						a = 1;
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 1) {
						a = 1;
						sum -= f[0];
					} else if (sum >= f[0]) {
						sum -= f[0];
					}
				} else if (a == 1) {
					if (sum >= f[2] && f[2] % 2 == 0) {
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 0) {
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 0) {
						sum -= f[0];
					} else if (sum >= f[0]) {
						a = 0;
						sum -= f[0];
					}
				}

				if (b == 0) {
					if (sum >= f[2] && f[2] % 2 == 1) {
						b = 1;
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 1) {
						b = 1;
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 1) {
						b = 1;
						sum -= f[0];
					} else if (sum >= f[0]) {
						sum -= f[0];
					}
				} else if (b == 1) {
					if (sum >= f[2] && f[2] % 2 == 0) {
						sum -= f[2];
					} else if (sum >= f[1] && f[1] % 2 == 0) {
						sum -= f[1];
					} else if (sum >= f[0] && f[0] % 2 == 0) {
						sum -= f[0];
					} else if (sum >= f[0]) {
						b = 0;
						sum -= f[0];
					}
				}
			}
			if (a == b) {
				System.out.print("0");
			} else if (a < b) {
				System.out.print("-");
			} else {
				System.out.print("+");
			}
			if (i != 4) {
				System.out.print(" ");
			}
		}
	}
}
