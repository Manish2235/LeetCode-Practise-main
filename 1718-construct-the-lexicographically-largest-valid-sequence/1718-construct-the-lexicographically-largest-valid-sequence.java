class Solution {
    int n, len;
    int[] arr;
    int[] left;          // left[i] = how many times i still needs to be placed
    boolean found = false;

    void backtrack(int idx) {

        if (found) return;

        // skip filled positions quickly
        while (idx < len && arr[idx] != 0) idx++;

        // base case
        if (idx == len) {
            found = true;
            return;
        }

        // try bigger numbers first for lexicographically largest
        for (int val = n; val >= 1; val--) {

            if (left[val] == 0) continue;

            if (val == 1) {
                // place 1 once
                arr[idx] = 1;
                left[1]--;

                backtrack(idx + 1);

                if (found) return;

                // undo
                arr[idx] = 0;
                left[1]++;

            } else {
                int j = idx + val;

                // valid pair placement
                if (j < len && arr[j] == 0 && left[val] == 2) {

                    arr[idx] = val;
                    arr[j] = val;
                    left[val] -= 2;

                    backtrack(idx + 1);

                    if (found) return;

                    // undo
                    arr[idx] = 0;
                    arr[j] = 0;
                    left[val] += 2;
                }
            }
        }
    }

    public int[] constructDistancedSequence(int n) {
        this.n = n;
        this.len = 2 * n - 1;

        arr = new int[len];
        left = new int[n + 1];

        left[1] = 1;
        for (int i = 2; i <= n; i++) left[i] = 2;

        backtrack(0);
        return arr;
    }
}