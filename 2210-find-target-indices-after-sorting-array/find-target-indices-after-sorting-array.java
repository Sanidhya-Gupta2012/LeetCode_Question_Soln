class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
         int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]) count++;
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                arr.add(i);
            }
        }return arr;
    }
}