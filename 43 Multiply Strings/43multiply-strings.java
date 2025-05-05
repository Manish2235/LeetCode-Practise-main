class Solution {
    public String multiply(String num1, String num2) {
         if (num1.equals("0") || num2.equals("0")) return "0";

        int len1 = num1.length();
        int len2 = num2.length();

        // The result can be at most len1 + len2 digits
        int[] result = new int[len1 + len2];

        // Multiply digits from the end of both strings
        for (int i = len1 - 1; i >= 0; i--) {
            int digit1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int digit2 = num2.charAt(j) - '0';

                int mul = digit1 * digit2;
                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10; // place digit
                result[i + j] += sum / 10;    // carry to next digit
            }
        }

        // Convert result array to string, skipping leading zeros
        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (sb.length() == 0 && digit == 0) continue;
            sb.append(digit);
        }

        return sb.toString();
    }
}