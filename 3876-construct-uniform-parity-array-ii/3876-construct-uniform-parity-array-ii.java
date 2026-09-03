
class Solution {
    public boolean uniformArray(int[] nums1) {

        int min = Integer.MAX_VALUE;

        // Find the smallest element
        for (int x : nums1) {
            min = Math.min(min, x);
        }

        // If smallest is odd, possible
        if (min % 2 == 1) {
            return true;
        }

        // Smallest is even.
        // So every element must be even.
        for (int x : nums1) {
            if (x % 2 == 1) {
                return false;
            }
        }

        return true;
    }
}

