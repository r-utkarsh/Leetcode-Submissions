class Solution {
   private static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        return calculate(a, b, b.length);
    }

    private int calculate(int a, int[] b, int n) {
        if (n == 0) {
            return 1;
        }

        int last = b[n - 1];

        int part1 = pow(calculate(a, b, n - 1), 10);
        int part2 = pow(a, last);

        return (part1 * part2) % MOD;
    }

    private int pow(int a, int k) {
        int result = 1;
        a %= MOD;

        while (k > 0) {
            if (k % 2 == 1) {
                result = (result * a) % MOD;
            }

            a = (a * a) % MOD;
            k /= 2;
        }

        return result;
    }
}