//𝓟𝓵𝓮𝓪𝓼𝓮 𝓤𝓟𝓥𝓞𝓣𝓔 𝓲𝓯 𝓲𝓽 𝓱𝓮𝓵𝓹𝓼👍🏻
class Solution {
    public String makeFancyString(String s) {
        char[] chars = s.toCharArray();
        char last = chars[0];
        int count = 1;
        int pos = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != last) {
                last = chars[i];
                count = 0;
            }

            if (++count > 2) continue;

            chars[pos++] = chars[i];
        }

        return new String(chars, 0, pos);
    }
}