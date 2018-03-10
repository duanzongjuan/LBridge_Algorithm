package province_8;

import java.util.Scanner;

public class Test_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N <1 || N > 100) {
			System.exit(-1);
		}
		
		int[] a = new int[N];
		for(int i=0; i<N;i++) {
			a[i]=sc.nextInt();
		}
	}
}
