class Solution {
   public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        String currentString = "";
        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0'); // handle multi-digit
            }

            else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);

                // reset
                k = 0;
                currentString = "";
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                String prevString = stringStack.pop();

                StringBuilder temp = new StringBuilder(prevString);

                for (int i = 0; i < repeat; i++) {
                    temp.append(currentString);
                }

                currentString = temp.toString();
            }

            else {
                currentString += ch;
            }
        }

        return currentString;
    }
}