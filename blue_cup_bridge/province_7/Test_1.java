/*
 * 有一堆煤球，堆成三角棱锥形。具体：第一层放1个，第二层3个（排列成三角形），第三层6个（排列成三角形），第四层10个（排列成三角形），....如果一共有100层，共有多少个煤球？
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
