/*
 * ��һ��ú�򣬶ѳ�������׶�Ρ����壺��һ���1�����ڶ���3�������г������Σ���������6�������г������Σ������Ĳ�10�������г������Σ���....���һ����100�㣬���ж��ٸ�ú��
 * @author:juanjuan
 * @version:2018-3-6
 */
package province_7;
public class Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a = new int[101];
		for(int i=1;i<101;i++) {
			a[i]=a[i-1]+i;
		}
		for(int i=1; i<101;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
}
