class Main{
    public static int findOdd(int[] arr,int n){
        int res = 0;
        for(int i=0;i<n;i++)
            res^=arr[i];
        return res;
    }
    public static void main(String[] args){
        int[] arr={34,12,35,68,14,12,14};
        int n = arr.length;
        int result = findOdd(arr,n);
        System.out.println(result);
    }
}