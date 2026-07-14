class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {

                if (list1[i].equals(list2[j])) {

                    if (i + j < minSum) {
                        result.clear();          // Found a better minimum
                        result.add(list1[i]);
                        minSum = i + j;
                    }
                    else if (i + j == minSum) {
                        result.add(list1[i]);    // Same minimum
                    }
                }
            }
        }

        return result.toArray(new String[0]);
    }
}