class Solution {
    public String addStrings(String a, String b) {
        int i= a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || carry > 0) {
            int one = 0;
            int two = 0;

            if (i >= 0) {
                one = a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                two = b.charAt(j) - '0';
                j--;
            }

            int sum = one + two + carry;

            sb.append(sum % 10);
            carry = sum / 10;
        }

        return sb.reverse().toString();
    }

}
