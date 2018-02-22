
/**
 *6
 *5+1
 *4+2,4+1+1
 *3+3,3+2+1,3+1+1+1
 *2+2+2,2+2+1+1,2+1+1+1+1
 *1+1+1+1+1+1
 *
 *@author juanjuan
 *@version 2018-2-9
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		f(n,a,0);
	}

	public static void f(int n,int[] a,int k) {
		if(n <= 0) {
			for(int i=0; i<k; i++) {
				if(i == k-1) {
					System.out.print(a[i]);
					break;
				}
				System.out.print(a[i] + "+");
			}
			System.out.println();
			return;
		}
		for(int i=n; i>0; i--) {
			if(k > 0 && i > a[k-1]) continue;
			a[k] = i;
			f(n-i,a,k+1);
		}
	}
}