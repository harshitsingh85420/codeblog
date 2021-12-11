import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Valid_Palindrome {
	 public static boolean isPalindrome1(String s) {
		    int[] set=new int[256];
		        for(int i=0;i<10;i++){
		            set['0'+i]=i+1;
		        }
		        for(int i=0;i<26;i++){
		            set['a'+i]=11+i;
		            set['A'+i]=11+i;
		        }
		        int l=0,r=s.length()-1;
		        while(l<r){
		            if(set[s.charAt(l)]==0)l++;
		            else if(set[s.charAt(r)]==0)r--;
		            else{
		                if(set[s.charAt(l)]!=set[s.charAt(r)]){
		               return false;}
		                l++;
		                r--;
		            }
		        }
		        return true;
		    }
	 public static boolean isPalindrome(String s) {
	      s=s.toLowerCase();
	         int l=0,r=s.length()-1;
	        
	         while(l<r){
	             if(!Character.isLetterOrDigit(s.charAt(l)))l++;
	             else if(!Character.isLetterOrDigit(s.charAt(r)))r--;
	             else{
	                 if(s.charAt(l)!=s.charAt(r))return false;
	                 l++;r--;
	             }
	         }
	         return true;
	     }
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();

		System.out.println("optimised1 o/p"+"->"+isPalindrome(s));
		System.out.println("optimised2 o/p"+"->"+isPalindrome1(s));

	}
}
