/*
 *��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ�.������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ.
 *�õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ��   ����һ��Сд��ĸ����ͨ��������ύ�𰸡���Ҫ��д�κζ�������� 
 *@author juanjuan
 *@version 2018-3-17
 */

//StringBuffer���ڿ��Ա���ַ���

package province_2014;

import java.util.ArrayList;

public class Test_3 {

	public static void main(String[] args) {
		String str = "";
		for (int i = 1; i <= 19; i++) {
			str += (char) (96 + i);
		}
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 106; i++) {
			sb.append(str);
		}
		while (sb.length() > 1) {
			for (int i = 0; i < sb.length(); i++) {
				sb.delete(i, i + 1);
			}
		}
		System.out.println(sb);
	}
}
