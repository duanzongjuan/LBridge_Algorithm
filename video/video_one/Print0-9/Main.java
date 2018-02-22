/**
 *递归与循环
 *打印0-9
 *@author juanjuan
 *@version 2018-2-8 
 */
public class Main{
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();

		//递归
		f1(9);
		System.out.println();
		f2(0,9);
	}

	//打印0-i
	public static void f1(int i) {
		if(i > 0) f1(i-1);
		System.out.print(i+" ");
	}

	public static void f2(int begin,int end) {
		if(begin > end) return;
		System.out.print(begin+" ");
		f2(begin+1,end);
	}
}