/*���   С���μ�X����Ĵ�б���������ʹ�õ��Ӹ�Ӧ�Ʒ�ϵͳ��������һ�֣�С������96�֡����С��������6���ӵ���û���ѰС�����Զ������ȥ��ֻ��3�����ס�
 * ��Ȼ����Щ�ӵ�׼ȷ�ش�����ǰ�ߵĵ��ס���ͬ�����÷����������õģ�1,2,3,5,10,20,25,50��ôС����6���ӵ��÷ֶ��Ƕ����أ�����Щ��������أ�
 *@author juanjuan
 *@version 2018-3-11
 */

package final_7;

public class Test_3 {
	/*
	 * @para ta:����,���ڴ�Ų�ͬ�����÷� da:����,����,���ڴ洢ÿ���÷ֵĴ���,������ÿ���׵Ĵ���
	 * k:��ǰ��ע�Ľ���,������forѭ����i������,���η��������е�Ԫ�� ho:��,��ǰ�м����� bu:��ǰ�����Դ򼸴ΰ�(ʣ���д���) sc:��ʣ���ٷ�
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
			f(ta, da, k + 1, ho - (i == 0 ? 0 : 1), bu - i, sc - ta[k] * i); // ���λ��
		}

		// ����
		da[k] = 0;
	}

	public static void main(String[] args) {
		int[] ta = { 1, 2, 3, 5, 10, 20, 25, 50 };
		int[] da = new int[8];
		f(ta, da, 0, 3, 6, 96); // 3����,6���ӵ�,96��
	}
}
