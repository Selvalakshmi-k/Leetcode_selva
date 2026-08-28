class Solution {
    public int[] shortestToChar(String s, char c) {

        int[] res = new int[s.length()];

        List<Integer> l = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                l.add(i);
            }
        }

        int[] d = new int[l.size()];
        int idx = 0;

        for (int num : l) {
            d[idx++] = num;
        }

        Arrays.sort(d);

        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                res[i] = 0;
                continue;
            }

            // Before first occurrence
            if (i < d[0]) {
                res[i] = d[0] - i;
            }

            // After last occurrence
            else if (i > d[d.length - 1]) {
                res[i] = i - d[d.length - 1];
            }

            // Between two occurrences
            else {
                while (index < d.length - 1 && i > d[index]) {
                    index++;
                }

                int previous = d[index - 1];
                int next = d[index];

                res[i] = Math.min(i - previous, next - i);
            }
        }

        return res;
    }
}