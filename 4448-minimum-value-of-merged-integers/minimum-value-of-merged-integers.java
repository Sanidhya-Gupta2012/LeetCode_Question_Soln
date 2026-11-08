class Solution {
    public int minMergedInteger(int[] nums) {
         int n=nums.length;
        int min=Integer.MAX_VALUE;
        int[] arr=new int[n/2];
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=Integer.toString(nums[i]);
        }
        int k=0;
        for(int i=0;i<n;i+=2){
            arr[k]=Integer.parseInt(str[i]+str[i+1]);
            k++;
        }
        for(int i=0;i<n/2;i++){
            if(min>arr[i]){
                min=Math.min(min,arr[i]);
            }
        }return min;
    }
}