import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Best_Time_to_Buy_and_Sell_Stock {
	 public static int maxProfit(int[] prices) {
       int mx=0;
for(int i=0;i<prices.length;i++){
 for(int j=i+1;j<prices.length;j++){
     if(prices[j]-prices[i]>mx)mx=prices[j]-prices[i];
 }
}
       return mx;
}
	public static int maxProfitO1(int[] prices) {
      int a[]=new int[prices.length];
      int mx=prices[prices.length-1];
      for(int i=prices.length-1;i>=0;i--){
          if(prices[i]>mx)mx=prices[i];
          a[i]=mx;
      }mx=0;
      for(int i=0;i<prices.length;i++){
          if(a[i]-prices[i]>mx)mx=a[i]-prices[i];
      }
      return mx;
}
	public static int maxProfitO2(int[] prices) {
        int mn=prices[0];
        int mx=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-mn>mx)mx=prices[i]-mn;
            if(prices[i]<mn)mn=prices[i];
        }
        return mx;
}
	public static void main(String args[]) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a[]=new int[Integer.parseInt(br.readLine())];
		for(int i=0;i<a.length;i++) a[i]=Integer.parseInt(br.readLine());
System.out.println("optimised2 o/p"+maxProfitO2(a));
System.out.println("optimised1 o/p"+maxProfitO1(a));
System.out.println("bruteforce o/p"+maxProfit(a));
	}
}
