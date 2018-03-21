/*有N堆纸牌，编号分别为1，2，…，n。每堆上有若干张,但纸牌总数必为n的倍数.可以在任一堆上取若干张纸牌,然后移动。移牌的规则为：在编号为1上取的纸牌，只能移到编号为2的堆上；
 *在编号为n的堆上取的纸牌，只能移到编号为n-1的堆上；其他堆上取的纸牌，可以移到相邻左边或右边的堆上。现在要求找出一种移动方法，用最少的移动次数使每堆上纸牌数都一样多。
 *例如：n=4，4堆纸牌分别为：① 9 ② 8 ③ 17 ④ 6 移动三次可以达到目的：从③取4张牌放到④ 再从③区3张放到②然后从②去1张放到①。
 *输入输出样例：4
 *9 8 17 6
 *屏幕显示：3
 *@author juanjuan 
 *@version 2018-3-20
 */

/*思想:设a[i]为第I堆纸牌的张数(0<=I<=n)v为均分后每堆纸牌的张数，s为最小移动次数.我们用贪心算法，按照从左到右的顺序移动纸牌。如第I堆的纸牌数不等于平均值，
 *则移动一次（即s加1），分两种情况移动：1．若a[i]>v，则将a[i]-v张从第I堆移动到第I+1堆；2．若a[i]<v，则将v-a[i]张从第I+1堆移动到第I堆。
 *为了设计的方便，我们把这两种情况统一看作是将a[i]-v从第I堆移动到第I+1堆，移动后有a[i]=v; a[I+1]=a[I+1]+a[i]-v.
 */
package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		sc.close();

		int avg = 0;
		int count = 0;

		// 计算平均值
		for (int i = 0; i < list.size(); i++) {
			avg += list.get(i);
		}
		avg = avg / list.size();

		// 移动、修改
		for (int i = 0; i < list.size() - 1; i++) {  //list.size()-1,防止越界
			count++;
			list.set(i + 1, list.get(i + 1) + list.get(i) - avg); //修改指定索引的值
		}
		System.out.println(count);
	}
}
