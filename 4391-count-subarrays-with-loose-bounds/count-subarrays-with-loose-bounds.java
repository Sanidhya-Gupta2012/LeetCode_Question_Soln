class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
         long n=nums.length;
        long count=0;
        long temp=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=minK && nums[i]<=maxK){
                temp++;
                count+=temp;
            }else {
                temp=0;
            }
        }return count;
    }
}