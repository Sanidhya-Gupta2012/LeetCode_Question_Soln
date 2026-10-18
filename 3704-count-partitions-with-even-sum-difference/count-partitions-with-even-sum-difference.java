class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int count=0;
        int[] left=new int[n];
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i];
        }
        int[] right=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
        }int j=1;
        for(int i=0;i<n-1;i++){
            if((left[i]-right[j])%2==0){
                count++;
            }j++;
        }return count;
    }
}