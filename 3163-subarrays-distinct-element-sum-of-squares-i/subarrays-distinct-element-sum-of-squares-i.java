class Solution {
    public int sumCounts(List<Integer> nums) {
       int ans=0;
        for(int i=0;i<nums.size();i++){
            int[] freq=new int[101];
            int distinct=0;
            for(int j=i;j<nums.size();j++){
                if(freq[nums.get(j)]==0){
                    distinct++;
                }
                freq[nums.get(j)]++;
                ans+=distinct*distinct;
            }
        }return ans;
    }
}