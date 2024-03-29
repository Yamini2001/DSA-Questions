class Solution{
    public void reverseString(char[] ch){
        int start = 0,int end = ch.length()-1;
        while(start<=end){
            char temp = char[start];
            char[start] = char[end];
            char[end] = temp;
            start++;
            end--;
        }
    }
}