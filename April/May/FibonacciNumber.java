class Solution{
    public int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int n1 = 0, n2 = 1;
        for(int i=2;i<=n;i++){
            int next = n1+n2;
            n1=n2;
            n2 = next;
        } 
        return n2;
    }
}