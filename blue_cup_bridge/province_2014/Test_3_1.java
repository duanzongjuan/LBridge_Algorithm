/*��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ�.������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ.�õ����´��ٽ���ɾ��
 * ����λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ.
 *@author juanjuan
 *@version 2018-3-17
 */

//ArrayList���ȿɱ������
package province_2014;

import java.util.ArrayList;

public class Test_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefghijklmnopqrs";
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<106;i++) {
			for(int j=0;j<s.length();j++) {
				list.add(s.charAt(j)+" ");
			}
		}
		boolean flag = true;
		while(flag) {
			if(list.size()==1) {
				flag = false;
				continue;
			}
			for(int i=0;i<list.size();i++) {
				if(i%2==0) {
					list.set(i, "0");
				}
			}
			for(int i=0;i<list.size();i++) {
				if(list.get(i) == "0") {
					list.remove(i);
				}
			}
		}
		System.out.println(list.get(0));
	}
}
