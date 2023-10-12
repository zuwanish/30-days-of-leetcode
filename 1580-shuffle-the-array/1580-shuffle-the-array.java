class Solution {
    public int[] shuffle(int[] nums, int n) {
        int size = nums.length/2;
        int index = size;
        int[] sorted = new int[nums.length];
        for(int i = 1;i<=size;i++){
            sorted[(size-i)+(--index)] = nums[size-i];
            sorted[(size+(i-1))-(index)] = nums[size+(i-1)];

        }
        return sorted;
    }
}