import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();

		for(int i=0; i<m; i++) {
			for(int j=0; j<m-i-1; j++) {
				System.out.print(" ");
			}

			for(int k=0; k<=i; k++) {
				System.out.print(f(i,k) + " ");
			}
			System.out.println();
		}
	} 

	public static int f(int m,int n) {
		if(m == 0) return 1;
		if(n == 0 || n == m) return 1;
		return f(m-1,n) + f(m-1,n-1);
	}
}