class Solution {
//    static {
//         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//             try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//                 fw.write("0");
//             } catch (Exception e) {
//             }
//         }));
//     }
    static int findgcd(int a, int b){
        if(b==0)
            return a;
        return findgcd(b,a%b);
        }
        public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int g=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            g=findgcd(g,numsDivide[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(g%nums[i]==0)
            return i;
        }
        return -1;
    }
}