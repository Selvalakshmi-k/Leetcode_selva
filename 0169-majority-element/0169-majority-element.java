// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         Map<Integer,Integer> m=new HashMap<>();
//         for(int i=0;i<n;i++){
//              m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);        }
//         for(int num:nums){
//             if(m.get(num)>n/2) return num;
//         }
//         return -1;
//     }
// }
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
