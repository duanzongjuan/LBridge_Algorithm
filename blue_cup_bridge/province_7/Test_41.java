/*分小组    9名运动员参加比赛，需要分3组进行预赛。有哪些分组的方案呢？我们标记运动员为 A,B,C,... I
 *@author juanjuan
 *@version 2018-3-15
 */
package province_7;

public class Test_41 {
	public static void main(String[] args) {
		int k = f(9,3);
		int m = f(6,3);
		System.out.println(k*m/3/2); //先9个人中选3个人,再从剩下的6个人中选3个人,但是同样的3个人被第一批,第二批，第三批选中是一样的组合,即除以6
	}
	
	public static int f(int m,int n) {
		if(m<n) return 0;
		if(n==0) return 1;
		if(n==m) return 1;
		return f(m-1,n-1)+f(m-1,n);
	}
}
