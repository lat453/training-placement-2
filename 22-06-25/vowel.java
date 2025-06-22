public class Solution {
    public boolean isVowel(char c) {
        return "aeiou".indexOf(c) >= 0;
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            String w = words[i];
            prefix[i + 1] = prefix[i] + (isVowel(w.charAt(0)) && isVowel(w.charAt(w.length() - 1)) ? 1 : 0);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0], r = queries[i][1];
            ans[i] = prefix[r + 1] - prefix[l];
        }
        return ans;
    }
}
