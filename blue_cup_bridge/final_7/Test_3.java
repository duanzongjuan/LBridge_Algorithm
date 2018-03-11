/*打靶   小明参加X星球的打靶比赛。比赛使用电子感应计分系统。其中有一局，小明得了96分。这局小明共打了6发子弹，没有脱靶。但望远镜看过去，只有3个弹孔。
 * 显然，有些子弹准确地穿过了前边的弹孔。不同环数得分是这样设置的：1,2,3,5,10,20,25,50那么小明的6发子弹得分都是多少呢？有哪些可能情况呢？
 *@author juanjuan
 *@version 2018-3-11
 */

package final_7;

public class Test_3 {
	/*
	 * @para ta:数组,用于存放不同环数得分 da:数组,缓存,用于存储每个得分的次数,即打中每个孔的次数
	 * k:当前关注的焦点,类似于for循环中i的作用,依次访问数组中的元素 ho:孔,当前有几个孔 bu:当前还可以打几次靶(剩余打靶次数) sc:还剩多少分
	 */

	static void f(int[] ta, int[] da, int k, int ho, int bu, int sc) {
		if (ho < 0 || bu < 0 || sc < 0)
			return;
		if (k == ta.length) {

			if (ho > 0 || bu > 0 || sc > 0) // ?
				return;

			for (int i = 0; i < da.length; i++) {
				for (int j = 0; j < da[i]; j++)
					System.out.print(ta[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i <= bu; i++) {
			da[k] = i;
			f(ta, da, k + 1, ho - (i == 0 ? 0 : 1), bu - i, sc - ta[k] * i); // 填空位置
		}

		// 回溯
		da[k] = 0;
	}

	public static void main(String[] args) {
		int[] ta = { 1, 2, 3, 5, 10, 20, 25, 50 };
		int[] da = new int[8];
		f(ta, da, 0, 3, 6, 96); // 3个孔,6发子弹,96分
	}
}
