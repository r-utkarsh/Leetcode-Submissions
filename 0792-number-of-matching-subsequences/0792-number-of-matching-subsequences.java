class Solution {
    public int numMatchingSubseq(String s, String[] words) {

        ArrayList<Integer>[] pos = new ArrayList[26];

        for (int i = 0; i < 26; i++) {
            pos[i] = new ArrayList<>();
        }

        for (int i = 0; i < s.length(); i++) {
            pos[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        for (String word : words) {
            int prev = -1;
            boolean valid = true;

            for (char c : word.toCharArray()) {
                ArrayList<Integer> list = pos[c - 'a'];
                int left = 0;
                int right = list.size();
                while (left < right) {
                    int mid = left + (right - left) / 2;

                    if (list.get(mid) <= prev) {
                        left = mid + 1;
                    } else {
                        right = mid;
                    }
                }
                if (left == list.size()) {
                    valid = false;
                    break;
                }
                prev = list.get(left);
            }
            if (valid) {
                count++;
            }
        }

        return count;
    }
}