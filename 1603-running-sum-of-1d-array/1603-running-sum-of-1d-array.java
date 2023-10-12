class Solution {
    public int[] runningSum(int[] nums) {
        int[] sumArray = new int[nums.length];
        int size = nums.length;
        for(int i = 0; i<size;i++){
            for(int j = 0; j<=i; j++){
                sumArray[i] += nums[j];
            }
        }
        return sumArray;
    }
}