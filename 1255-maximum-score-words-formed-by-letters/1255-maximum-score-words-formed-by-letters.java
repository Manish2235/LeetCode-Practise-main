class Solution {
  static int maxScore;
    static int n;

    public static void solve(int i, int[] score, String[] words,
                             int currScore, int[] freq) {

        maxScore = Math.max(maxScore, currScore);

        if (i >= n) {
            return;
        }

        int j = 0;
        int tempScore = 0;

        // Create a copy
        int[] tempFreq = freq.clone();

        while (j < words[i].length()) {

            char ch = words[i].charAt(j);

            tempFreq[ch - 'a']--;
            tempScore += score[ch - 'a'];

            if (tempFreq[ch - 'a'] < 0) {
                break;
            }

            j++;
        }

        // Include current word
        if (j == words[i].length()) {
            solve(i + 1, score, words,
                  currScore + tempScore, tempFreq);
        }

        // Exclude current word
        solve(i + 1, score, words,
              currScore, freq);
    }

    public static int maxScoreWords(String[] words,
                                    char[] letters,
                                    int[] score) {

        maxScore = Integer.MIN_VALUE;

        int[] freq = new int[26];

        for (char ch : letters) {
            freq[ch - 'a']++;
        }

        n = words.length;

        solve(0, score, words, 0, freq);

        return maxScore;
    }
}