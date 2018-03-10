/*
 * 某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。现在算起来，他一共吹熄了236根蜡烛。请问，他从多少岁开始过生日party的？
 *@author:juanjuan
 *@version:2018-3-6
 * 
 */
package province_7;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<100;i++) {
			int s=i,n=i;
			//boolean is = false;
			while(true) {
				if(s==236) {
					System.out.println(i);
					//is =  true;
					break;
				}
				if(s > 236) {
					break;
				}
				n++;
				s+=n;
			}
			/*if(is) {
				break;
			}*/
		}
		
		f();
	}
	
	//暴力枚举
	public static void f() {
		int start,end;
		//枚举刚开始过生日时侯的岁数
		for(start=1;start<100;start++) {
			//枚举现在的岁数
			for(end=start;end<100;end++) {
				int sum=0;
				//枚举刚开始过生日的岁数和现在的岁数加起来
				for(int i=start;i<=end;i++) {
					sum += i;
					}
				if(sum==236) {
					System.out.println(start);
				}
			}
		}
	}
}
