class Solution {

    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        int[] f = new int[256];

        for (char ch : t.toCharArray()) {
            f[ch]++;
        }

        int[] f1 = new int[256];

        int count = 0;
        int left = 0;

        String res = "";
        int min = Integer.MAX_VALUE;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (f[ch] > 0) {

                f1[ch]++;

                if (f1[ch] <= f[ch]) {
                    count++;
                }
            }

            while (count == t.length()) {

                int len = right - left + 1;

                if (len < min) {
                    min = len;
                    res = s.substring(left, right + 1);
                }

                char leftChar = s.charAt(left);

                if (f[leftChar] > 0) {

                    f1[leftChar]--;

                    if (f1[leftChar] < f[leftChar]) {
                        count--;
                    }
                }

                left++;
            }
        }

        return res;
    }
}