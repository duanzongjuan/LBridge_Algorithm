package province_8;

public class Test_2 {
	static int count = 0;
	static int[] first = new int[9];
	static int[] last = new int[9];
	static int m = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		force(); //暴力破解
		
		//全排列破解
		int[] a = new int[9];
		for(int i=0; i<9; i++) {
			a[i] = i+1;
		}
		g(a,0);
		System.out.println(count/3/2); //除以3是除去旋转(180°/60°),除以2是除去镜像.
		
		//全排列破解2
		f(0);
		System.out.println(m/3/2);
	}
	
	//暴力破解
	public static void force() {
		int count = 0;
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				for(int k=1; k<10; k++) {
					for(int l=1; l<10; l++) {
						for(int m=1; m<10; m++) {
							for(int n=1; n<10; n++) {
								for(int o=1; o<10; o++) {
									for(int p=1; p<10; p++) {
										for(int q=1; q<10; q++) {
											if(i+j+k+l == l+m+n+o && i+j+k+l == i+p+q+o && i != j && i!=k && i!=l && i!= m &&
											  i!=n && i!=o && i!= p && i!= q && j!=k && j!= l && j!= m && j!=n && j!=o &&
											 j!=p && j!=q && k!=l && k!=m && k!=n && k!=o && k!=p && k!=q && l!=m && l!=n && l!=o 
											&& l!=p && l!=q && m!=n && m!=o && m!=p && m!=q && n!=o && n!=p && n!=q && o!=p && o!=q && p!=q) {
												count ++;
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count/6);
	}
	
	//全排列破解
	public static void g(int[] a,int k) {
		if(k>=a.length) {
			check(a);
			return;
		}
		
		for(int i=k; i<a.length; i++) {
			//试探
			{
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
			
			g(a,k+1);
			//回溯
			{
				int temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}
	
	public static void check(int[] a) {
		int[] b = new int[3];
		b[0] = a[0]+a[1]+a[2]+a[3];
		b[1] = a[3]+a[4]+a[5]+a[6];
		b[2] = a[6]+a[7]+a[8]+a[0];
		if(b[0]==b[1] && b[1] == b[2]) {
			count ++;
		}
	}
	
	//全排列破解2
	public static void f(int k) {
		if(k == 9) {
			if(last[0]+last[1]+last[3]+last[5] == last[5]+last[6]+last[7]+last[8] && last[5]+last[6]+last[7]+last[8] == last[0]+last[2]+last[4]+last[6])
			m++;
			return;
		}
		for(int i=0; i<9; i++) {
			if(first[i] == 0) {
				first[i] = 1;
				last[k] = i+1;
				f(k+1);
				first[i] = 0;
			}
		}
	}
}


