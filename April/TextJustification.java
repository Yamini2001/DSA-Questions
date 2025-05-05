class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        int i = 0;
        
        while (i < n) {
            int charCnt = 0;
            int j = i;
            while (j < n && charCnt + words[j].length() <= maxWidth) {
                charCnt += words[j].length() + 1; // +1 for space; beacuse some situation might arrise where you take the group of words whose char counts exactly to the maxWidth, now here the text can not be justified. Hence assume a minimum of single space
                j++;
            }
            
            StringBuilder sb = new StringBuilder();
            int spaces = maxWidth - (charCnt - (j - i));
            int gaps = j - i - 1;
            
        
//if it is last line or only one word, then we need to keep it left justified
            if (j == n || gaps == 0) {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) sb.append(" ");
                }
                while (sb.length() < maxWidth) sb.append(" ");
            } else {
                for (int k = i; k < j; k++) {
                    sb.append(words[k]);
                    if (k < j - 1) {
                        int spaceToAdd = spaces / gaps + (k - i < spaces % gaps ? 1 : 0);
                        for (int l = 0; l < spaceToAdd; l++) {
                            sb.append(" ");
                        }
                    }
                }
            }
            
            ans.add(sb.toString());
            i = j;
        }
        
        return ans;
    }
}