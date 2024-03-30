class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                result+=nums[i];
            }
            else{
                break;
            }
        }
        Arrays.sort(nums);
        for(int num: nums){
            if(num==result){
                result++;
            }
        }
        return result;
    }
}