class Solution{
    public String ReverseVowels(String s){
        char[] word = s.toCharArray();
        int start = 0 ,end = s.length()-1;
        String Vowels = "aeiouAEIOU";

        while(start<end){
            while(start<end && Vowels.indexOf(word[start])==-1){
                start++;
            }
            while(start<end && Vowels.indexOf(word[end])==-1){
                end--;
            }

            //swap the vowels
            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }
        String answer = new String(word);
        return answer;
    }
}