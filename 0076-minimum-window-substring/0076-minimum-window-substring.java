class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) {
            return "";
        }

        int[] count = new int[128];

        // Count characters required from t
        for (char c : t.toCharArray()) {
            count[c]++;
        }

        int l = 0;
        int have = 0;
        int need = t.length();

        int start = 0;
        int minLen = Integer.MAX_VALUE;

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            // Character is needed
            if (count[c] > 0) {
                have++;
            }

            count[c]--;

            // Window contains all characters of t
            while (have == need) {

                // Check minimum window
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }

                char left = s.charAt(l);

                count[left]++;

                // Removing a required character
                if (count[left] > 0) {
                    have--;
                }

                l++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}