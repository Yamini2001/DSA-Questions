class Main{
    static int max(int a,int b){
        return (a>b) ? a:b;
    }
    public static int Knapsack(int W,int[] wt,int[] val,int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] > W) {
            return Knapsack(W, wt, val, n - 1);
        }
        else{
            return max(val[n-1]+Knapsack(W-wt[n-1],wt,val,n-1),Knapsack(W,wt,val,n-1));
        }
    }
    public static void main(String[] args){
        int[] profit = new int[] {60,100,120};
        int[] weight = new int[]{10,20,30};
        int W = 50;
        int n =profit.length;
        System.out.println(Knapsack(W,weight,profit,n));
    }
}
