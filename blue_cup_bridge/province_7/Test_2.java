/*
 * ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ������������������������һ����Ϩ��236���������ʣ����Ӷ����꿪ʼ������party�ģ�
 *@author:juanjuan
 *@version:2018-3-6
 * 
 */
package province_7;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++) {
			int s=i,n=i;
			//boolean is = false;
			while(true) {
				if(s==236) {
					System.out.println(i);
					//is =  true;
					break;
				}
				if(s > 236) {
					break;
				}
				n++;
				s+=n;
			}
			/*if(is) {
				break;
			}*/
		}
		
		f();
	}
	
	//����ö��
	public static void f() {
		int start,end;
		//ö�ٸտ�ʼ������ʱ�������
		for(start=1;start<100;start++) {
			//ö�����ڵ�����
			for(end=start;end<100;end++) {
				int sum=0;
				//ö�ٸտ�ʼ�����յ����������ڵ�����������
				for(int i=start;i<=end;i++) {
					sum += i;
					}
				if(sum==236) {
					System.out.println(start);
				}
			}
		}
	}
}
