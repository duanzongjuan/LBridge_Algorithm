/*���������������n��������,���������ӳ�һ�ţ����һ�����Ķ�λ����������:n=3ʱ,3������13��312��343�����ɵ��������Ϊ34331213�����磺n=4ʱ��4������7��13��4��246�����ɵ��������Ϊ7424613��
 * ���룺n
 * N����
 * ��������ɵĶ�λ�� 
 *@author juanjuan
 *@version 2018-3-20
 */

//�Ȱ�����ת�����ַ�����Ȼ���ڱȽ�a+b��b+a�����a+b>=b+a���Ͱ�a����b��ǰ�棬��֮���a����b�ĺ��档
package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		int n = sc.nextInt();
		while(n-->0) {
			list.add(sc.next());
		}
		sc.close();
		
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if((list.get(i)+list.get(j)).compareTo(list.get(j)+list.get(i))<0) { //ע��compareTo����
					String temp = list.get(j);  //�����齻��������
					list.set(j, list.get(i));
					list.set(i,temp);
				}
			}
		}
		
		String str = "";
		for(int i=0;i<list.size();i++) {
			str += list.get(i);
		}
		System.out.println(str);
	}
}
