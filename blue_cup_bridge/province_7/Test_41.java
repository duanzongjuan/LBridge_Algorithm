/*��С��    9���˶�Ա�μӱ�������Ҫ��3�����Ԥ��������Щ����ķ����أ����Ǳ���˶�ԱΪ A,B,C,... I
 *@author juanjuan
 *@version 2018-3-15
 */
package province_7;

public class Test_41 {
	public static void main(String[] args) {
		int k = f(9,3);
		int m = f(6,3);
		System.out.println(k*m/3/2); //��9������ѡ3����,�ٴ�ʣ�µ�6������ѡ3����,����ͬ����3���˱���һ��,�ڶ�����������ѡ����һ�������,������6
	}
	
	public static int f(int m,int n) {
		if(m<n) return 0;
		if(n==0) return 1;
		if(n==m) return 1;
		return f(m-1,n-1)+f(m-1,n);
	}
}
