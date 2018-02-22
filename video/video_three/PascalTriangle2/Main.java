 import java.util.*;
 public class Main {
 	public static void main(String[] args) {
 		Scanner sc = new Scanner(System.in);
 		int n = sc.nextInt();
 		int m = sc.nextInt();

 		for(int i=0; i<= n;i++) {
 			System.out.print(f(n,i) + " ");
 		}		
 	}

 	public static int f(int n,int m) {
 		if(m == 0) return 1;;
 		if(n == 0 || n == m) return 1;
 		return f(n-1,m) + f(n-1,m-1);
 	}
 }