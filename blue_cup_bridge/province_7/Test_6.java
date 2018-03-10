package province_7;

public class Test_6 {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = "0123456789".toCharArray();
		f(c,0);
		System.out.println(count);
	}
	
	public static void f(char[] c,int k) {
		if(k == c.length) {
			if(check2(c)) {
				count++;
			}
		}
		for(int i=k;i<c.length;i++) {
			{
				char temp = c[k];
				c[k] = c[i];
				c[i] = temp;
			}
			f(c,k+1);
			
			{
				char temp = c[k];
				c[k] = c[i];
				c[i] = temp;
			}
		}
	}
	
	public static boolean check1(char c,char d) {
		if(c==(d+1) || c==(d-1)) {
			return false;
		}
		return true;
	}
	
	public static boolean check2(char[] c) {
		if(check1(c[0],c[1]) && check1(c[0],c[5]) &&check1(c[0],c[4]) &&check1(c[0],c[3]) &&check1(c[1],c[5])&&check1(c[1],c[4]) &&check1(c[1],c[6])&&check1(c[1],c[2])
				&&check1(c[2],c[5]) &&check1(c[2],c[6]) &&check1(c[3],c[4])&&check1(c[3],c[8])&&check1(c[3],c[7])&&check1(c[4],c[5])&&check1(c[4],c[9])&&check1(c[4],c[8])
				&&check1(c[4],c[7])&&check1(c[5],c[6])&&check1(c[5],c[9])&&check1(c[5],c[8])&&check1(c[6],c[9])&&check1(c[7],c[8])&&check1(c[8],c[9])) {
			return true;
		}
		return false;
	}
}
