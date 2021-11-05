import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Maximum_Subarray {
	 public static int maxSubArrayO3(int[] nums) {
       int s=0,mx=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
           s=s+nums[i];
           if(mx<s)mx=s;
           if(s<0)s=0;  
       }
       return mx;
   }
	 public static int dnc(int nums[],int l,int r){
	        if(l==r) return nums[l];
	        int m=(l+r)/2;
	        int lss=dnc(nums,l,m);
	        int rss=dnc(nums,m+1,r);
	        int css=cadd(nums,m,l,r);
	        return Math.max(Math.max(css,lss),rss);
	    }
	    public static int cadd(int nums[],int m,int l,int r){
	        int s=0,mx1=Integer.MIN_VALUE,mx2=Integer.MIN_VALUE;
	        for(int i=m+1;i<=r;i++){
	            s=s+nums[i];
	            if(s>mx1)mx1=s;
	        }
	        s=0;
	        for(int i=m;i>=l;i--){
	            s=s+nums[i];
	            if(s>mx2)mx2=s;
	        }
	        return Math.max(Math.max(mx1,mx2),mx1+mx2);
	        
	    }
	    public static int maxSubArrayO2(int[] nums) {
	        return dnc(nums,0,nums.length-1);
	    }

	 public static int maxSubArrayO1(int[] nums) {
       int mx=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
          int s=0;
          for(int j=i;j<nums.length;j++){
               s=s+nums[j];
              if(s>mx)mx=s;
          }
      }
       return mx;
   }
	 public static int maxSubArray(int[] nums) {
       int mx=Integer.MIN_VALUE;
      for(int i=0;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
              int s=0;
              for(int k=i;k<=j;k++){
                  s=s+nums[k];
              }
              if(s>mx)mx=s;
          }
      }
       return mx;
   }
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[Integer.parseInt(br.readLine())];
		for(int i=0;i<a.length;i++) a[i]=Integer.parseInt(br.readLine());
		System.out.println("bruteforce o/p");
			System.out.println(maxSubArray(a));
		System.out.println("optimised1 o/p");
		System.out.println(maxSubArrayO1(a));
		System.out.println("optimised2 o/p");
		System.out.println(maxSubArrayO2(a));
		System.out.println("optimised3 o/p");
		System.out.println(maxSubArrayO3(a));


	}
}
