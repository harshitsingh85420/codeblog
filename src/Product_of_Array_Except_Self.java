import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Product_of_Array_Except_Self {
	public static int[] productExceptSelf(int[] nums) {
        int l[]=new int[nums.length];
        int t=1;
        l[0]=1;
        for(int i=1;i<nums.length;i++){
            l[i]=l[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--){
            l[i]=l[i]*t;
            t=t*nums[i];
        }
        return l;
    }

		  public static int[] productExceptSelfO1(int[] nums) {
		        int l[]=new int[nums.length];
		        int r[]=new int[nums.length];
		        l[0]=1;
		        for(int i=1;i<nums.length;i++){
		            l[i]=l[i-1]*nums[i-1];
		        }
		         
		        r[nums.length-1]=1;
		        for(int i=nums.length-2;i>=0;i-- ){
		            r[i]=r[i+1]*nums[i+1];
		        }
		        for(int i=0;i<nums.length;i++){
		           r[i]=r[i]*l[i];
		        }
		        return r;
		    }
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[Integer.parseInt(br.readLine())];
		for(int i=0;i<a.length;i++) a[i]=Integer.parseInt(br.readLine());
		System.out.println("bruteforce o/p");
		for(int i:productExceptSelf(a)) {
			System.out.print(i);
		}
		System.out.println("optimised1 o/p");
		for(int i:productExceptSelfO1(a)) {
			System.out.print(i);
		}

	}
}
