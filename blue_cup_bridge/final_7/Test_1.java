/*
 * X�����ŭ��С��ϲ��ײ�𳵣�һ��ƽֱ�����������𳵼���� 1000��,���� ��������A��B�� ��ʱ�� 10��/�� �����ʻ����ŭ��С���A��������ʱ��50��/�룬ײ��B����Ȼ�󷵻�ȥײA����
 * �ٷ���ȥײB�����������....���������1�״�ͣ�����ʣ����ڼ��ŭ��С��ײ B �����ٴΣ�
 *@author juanjuan
 *@version 2018-3-10
 */
package final_7;

public class Test_1 {
	// �ݹ�
	static int time = 0;
	static int i = 0;

	public static void main(String[] args) {
		f(1000);
		System.out.println(time);
	}

	//���ȵݹ�
	public static double f(double length) {
		double t = length / 60; //50t+10t=1000;
		length = length - (10 + 10) * t;
		if (length <= 1)
			return 0;
		if (i % 2 == 0) { //ż��ײB,����ײA
			time++;
		}
		i++;
		return f(length);
	}
}
