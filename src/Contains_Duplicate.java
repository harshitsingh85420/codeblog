import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Contains_Duplicate {
	public static boolean containsDuplicate(int[] nums) {
		 for(int i=0;i<nums.length;i++){
	          for(int j=i+1;j<nums.length;j++){
	              if(nums[i]==nums[j])return true;
	          }
	      }
	         return false;
	 }
	 public static boolean containsDuplicateO1(int[] nums) {
       Arrays.sort(nums);
       for (int i = 1; i < nums.length; i ++) {
           if (nums[i] == nums[i - 1])
               return true;
       }
       return false;
   }
	 public static boolean containsDuplicateO2(int[] nums) {
	        Arrays.sort(nums);
	        for (int i = 1; i < nums.length; i ++) {
	            if (nums[i] == nums[i - 1])
	                return true;
	        }
	        return false;
	    }
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[Integer.parseInt(br.readLine())];
		for(int i=0;i<a.length;i++) a[i]=Integer.parseInt(br.readLine());
System.out.println("optimised2 o/p"+containsDuplicateO2(a));
System.out.println("optimised1 o/p"+containsDuplicateO1(a));
System.out.println("bruteforce o/p"+containsDuplicate(a));
	}
}
