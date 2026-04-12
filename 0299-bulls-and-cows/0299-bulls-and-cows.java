class Solution {
      public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;

        int[] count = new int[10]; // digits 0-9

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if (s == g) {
                bulls++;
            } else {
                // If previously this digit appeared in guess
                if (count[s - '0'] < 0) {
                    cows++;
                }
                // If previously this digit appeared in secret
                if (count[g - '0'] > 0) {
                    cows++;
                }

                count[s - '0']++; // increase secret digit
                count[g - '0']--; // decrease guess digit
            }
        }

        return bulls + "A" + cows + "B";
    }
}