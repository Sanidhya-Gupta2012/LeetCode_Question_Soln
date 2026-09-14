class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1)return 0;
        int z=0;
        int s=0,e=0;int count=0;
        int pro=1;
        while(e<nums.length){
            pro*=nums[e];
            while(pro>=k){
                pro/=nums[s];
                s++;
            }
            count+=e-s+1;
            e++;
        }
        return count;
    }
}