/*
 *��abcd...s��19����ĸ��ɵ������ظ�ƴ��106�Σ��õ�����Ϊ2014�Ĵ�. ������ɾ����1����ĸ������ͷ����ĸa�����Լ���3������5������������λ�õ���ĸ.
 * �õ����´��ٽ���ɾ������λ����ĸ�Ķ����������ȥ�����ֻʣ��һ����ĸ����д������ĸ�� 
 *@author juanjuan
 *@version 2018-3-17
 */
package province_2014;

public class Test_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghigklmnopqrs";
		String s1="";
		for(int i=0;i<106;i++) {
			s1 += s;
		}
		boolean[] a = new boolean[s1.length()];
		for(int i=0;i<a.length;i++) {
			a[i] = true;
		}
		int leftCount = s1.length();
		int countNum = 0;
		int index = 0;
		while(leftCount>1) {
			if(a[index] == true) {
				if(countNum%2==0) {
					a[index] = false;
					leftCount--;
				}
				countNum++;
			}
			index++;
			if(index==s1.length()) {
				index = 0;
				countNum = 0;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==true) {
				System.out.println(i); //��������ʾ�±�Ϊ1023(��1024��)����ĸ,����q 
			}
		}
	}
}
