package province_7;

import java.util.Scanner;

public class Test_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int[] b = new int[n];
		f(a,b,1);
	}
	
	public static void f(int[] a,int[] b,int k) {
		if(k==a.length) {
			for(int i=0;i<b.length;i++) {
				System.out.print(b[i]+" ");
			}
		}
		for(int i=k-1;i>=0;i--) {
			if((Math.abs(b[i]))==a[k]) {
				b[k] = (k-i);
			} else {
				b[k] = -a[k];
			}
			f(a,b,k+1);
		}
	}
}
