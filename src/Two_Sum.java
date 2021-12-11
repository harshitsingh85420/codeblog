import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	public static int[] twoSum(int[] nums, int target) {
	    Map<Integer,Integer> set=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(set.containsKey(target-nums[i])){
	                return new int[]{i,set.get(target-nums[i])};
	            }
	            else{
	                set.put(nums[i],i);
	            }
	        }
	        return new int[] {0,0};
	    }
	
	public static void main(String args[]) throws Exception{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[Integer.parseInt(br.readLine())];
int t=Integer.parseInt(br.readLine());
for(int i=0;i<a.length;i++) a[i]=Integer.parseInt(br.readLine());

for(int i:twoSum(a,t))
	System.out.println(i);
}}

