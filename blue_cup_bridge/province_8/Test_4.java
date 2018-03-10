package province_8;

public class Test_4 {
	public static void main(String[] args) {
		f(4,2,2);
	}
	
	public static int f(int m,int n, int o) {
		if(m == 0 && n == 0 || m==0 && o == 0 || n==0 && o == 0) {
			return 1;
		}
		
		return f(m-1,n,o)+f(m,n-1,o)+f(m,n,o-1);
	}
	
}
