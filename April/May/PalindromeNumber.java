class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        String s1 = new StringBuilder(s).reverse().toString();
        return s.equals(s1);
    }
    
}