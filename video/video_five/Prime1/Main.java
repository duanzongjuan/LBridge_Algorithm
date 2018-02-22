/**
 *素数就是不能再进行等分的整数.比如7,11.而9不是，因为它可以平分为3等分.一般认为最小的素数是2,接着是3,5...
 *第100002(十万零二)个素数是?
 *请注意:2是第一个素数,3是第二高素数,以此类推。
 *@author juanjuan
 *@version 2018-2-12
 */
public class Main {  
    // 检查是否素数  
    public static boolean check(int n){  
        for(int i=2;i*i<=n;i++){  
            if(n%i==0){  
                return false;  
            }  
        }  
        return true;  
    }  
    public static void main(String[] args) {  
        int n = 1;  
        int i = 3;  
        while(n<100002){  
            if(check(i)){  
                n++;  
                System.out.println(n+"->"+i);  
                i++;  
            }else{  
                i++;  
            }  
        }  
    }  
}  