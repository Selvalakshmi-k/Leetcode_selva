class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();

        int l = 0, r = arr.length - 1;
        while (l < r) {
            if (!Character.isAlphabetic(arr[l])) {
                l++;
            } else if (!Character.isAlphabetic(arr[r])) {
                r--;
            } else {
                char temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        int l1 = 0, r1= arr.length - 1;
        while (l1 < r1) {
            if (Character.isAlphabetic(arr[l1])) {
                l1++;
            } else if (Character.isAlphabetic(arr[r1])) {
                r1--;
            } else {
                char temp = arr[l1];
                arr[l1] = arr[r1];
                arr[r1] = temp;
                l1++;
                r1--;
            }
        }

        return new String(arr);
    }
}