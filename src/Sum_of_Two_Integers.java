import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum_of_Two_Integers {
	public static int getSum(int a, int b) {
	      while(b!=0){
	          int c=a&b;
	          a=a^b;
	          b=c<<1;
	      }
	        return a;
	    }
	public static void main(String args[]) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
	System.out.println(getSum(a,b));

		}
	}
//
//class Solution {
//    public int getSum(int a, int b) {
//      while(b!=0){
//          int c=a&b;
//          a=a^b;
//          b=c<<1;
//      }
//        return a;
//    }
//}


//python soln
//class Solution(object):
//    def getSum(self, a, b):
//        mask = 0xffffffff
//        if(b is 0):
//            return a
//        if(a is 0):
//            return b
//        while b:
//            sm=(a^b)&mask
//            carry=((a&b)<<1)&mask
//            a=sm
//            b=carry
//        
//        if(a>>31)&1: 
//			return ~(a^mask)
//        return a