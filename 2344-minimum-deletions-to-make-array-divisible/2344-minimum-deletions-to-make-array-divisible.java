class Solution {
//    static {
//         Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//             try (java.io.FileWriter fw = new java.io.FileWriter("display_runtime.txt")) {
//                 fw.write("0");
//             } catch (Exception e) {
//             }
//         }));
//     }
    // static int findgcd(int a, int b){
    //     if(b==0)
    //         return a;
    //     return findgcd(b,a%b);
    //     }
    static boolean divide(int d,int[] numsDivide){
        for(int i=0;i<numsDivide.length;i++){
            if(numsDivide[i]%d!=0){
                return false;
            }
        }
        return true;
    }
        public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        // int g=numsDivide[0];
        // for(int i=1;i<numsDivide.length;i++){
        //     g=findgcd(g,numsDivide[i]);
        // }
        // for(int i=0;i<nums.length;i++){
        //     if(g%nums[i]==0)
        //     return i;
        // }
        // return -1;
        int d=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                d++;
                continue;
            }
            s.add(nums[i]);
            if(!divide(nums[i],numsDivide)){
                d++;
            }else{
                break;
            }
            
        }
        if(d==nums.length){
            return -1;
        }
        return d;
    }
}