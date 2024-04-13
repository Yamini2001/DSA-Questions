import java.util.*;
class Main{
    public static int maxProfit(int[] price,int start,int end){
        if(end<=start){
            return 0;
        }
        int profit = 0;
        for(int i=0;i<end;i++){
            for(int j = i+1;j<=end;j++){
                if(price[j]>price[i]){
                    int min_profit = price[j]-price[i]+maxProfit(price,start,i-1)+maxProfit(price,end,i+1);
                    profit = Math.max(profit,min_profit);
                }
            }
        }
        return profit;
    }
    public static void main(String[] args)
    {
        int price[] = { 100, 180, 260, 310, 40, 535, 695 };
        int n = price.length;

        System.out.print(maxProfit(price, 0, n - 1));
    }
}