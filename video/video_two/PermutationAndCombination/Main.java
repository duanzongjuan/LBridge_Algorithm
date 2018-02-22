/**
 *在n个球中取M个球,有多少种取法.
 *@author juanjuan
 *@version 2018-2-9
 */
public class Main {
	public static void main(String[] args) {
		int k = f(10,3);
		System.out.println(k);
	}

	//n个里面取m个
	public static int f(int n,int m) {
		if(n < m) return 0;
		if(n == m) return 1;
		if(m == 0) return 1;  
		return f(n-1,m-1) + f(n-1,m);  //n个球里面有个特殊球x,取法划分,包不包含x.
	}
}