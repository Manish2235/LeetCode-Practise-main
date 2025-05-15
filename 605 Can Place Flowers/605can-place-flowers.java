class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
    int length = flowerbed.length;
    int count = 0;

    for (int i = 0; i < length; i++) {
        if (flowerbed[i] == 0) {
            boolean emptyLeft = (i == 0 || flowerbed[i - 1] == 0);
            boolean emptyRight = (i == length - 1 || flowerbed[i + 1] == 0);

            if (emptyLeft && emptyRight) {
                flowerbed[i] = 1; // plant flower
                count++;
                if (count >= n) return true;
            }
        }
    }

    return count >= n;
    }
}