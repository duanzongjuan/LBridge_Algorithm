/*
 *С����Xɽ��̽�գ���һ����������书�ؼ���2000��ҳ����Ȼ��α��ģ����� ��ʶ������ĵ�10ҳ�͵�11ҳ��ͬһ��ֽ�ϣ�����11ҳ�͵�12ҳ����ͬһ��ֽ�ϡ�     С��ֻ����ϰ�����
 *��81ҳ����92ҳ���书���ֲ�����������顣����������Ҫ˺�¶�����ֽ���ߣ�  ���Ǹ���������ͨ��������ύ�����֣���Ҫ��д�κζ�������ݡ� 
 *@author juanjuan
 *@version 2018-3-16
 */
package province_2014;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int a =  sc.nextInt();
		int b = sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				count ++;
			}
		}
		System.out.println(count+1); //һ��ʼ81,(80,81)��һҳ
	}

}
